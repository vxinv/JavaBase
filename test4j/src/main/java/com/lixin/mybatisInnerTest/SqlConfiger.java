package com.lixin.mybatisInnerTest;

import com.lixin.mapper.ProductDao;
import com.lixin.mybatisInnerTest.InterceptPluin.InteceptDemo1;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * java代码配置
 */
@Configuration
public class SqlConfiger {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Bean("dataSource")
    public DataSource dataSource(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://rm-2ze3kt2861n4gf13mpo.mysql.rds.aliyuncs.com:3306/product_slave_alpha"); //数据源
        config.setUsername("root"); //用户名
        config.setPassword("Wqkj2019"); //密码
        config.addDataSourceProperty("cachePrepStmts", "true"); //是否自定义配置，为true时下面两个参数才生效
        config.addDataSourceProperty("prepStmtCacheSize", "20"); //连接池大小默认25，官方推荐250-500
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048"); //单条语句最大长度默认256，官方推荐2048
        config.addDataSourceProperty("useServerPrepStmts", "true"); //新版本MySQL支持服务器端准备，开启能够得到显著性能提升
        config.addDataSourceProperty("useLocalSessionState", "true");
        config.addDataSourceProperty("useLocalTransactionState", "true");
        config.addDataSourceProperty("rewriteBatchedStatements", "true");
        config.addDataSourceProperty("cacheResultSetMetadata", "true");
        config.addDataSourceProperty("cacheServerConfiguration", "true");
        config.addDataSourceProperty("elideSetAutoCommits", "true");
        config.addDataSourceProperty("maintainTimeStats", "false");
        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }


    @Bean
    public org.apache.ibatis.session.Configuration configuration(){
        JdbcTransactionFactory jdbcTransactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("dev", jdbcTransactionFactory, dataSource());
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration(environment);
        configuration.addMapper(ProductDao.class);
        InteceptDemo1 inteceptDemo1 = new InteceptDemo1();
        Properties properties = new Properties();
        properties.setProperty("key", "lixin");
        inteceptDemo1.setProperties(properties);
        configuration.addInterceptor(new InteceptDemo1());
        return configuration;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean()  {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfiguration(configuration());
        sqlSessionFactoryBean.setDataSource(dataSource());
        try {
            sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("mybatis/mappers/**Mapper.xml"));
        } catch (IOException e) {
            log.error("找不到mybatis/mappers/**Mapper.xml", e);
        }
        SqlSessionFactory fa = null;
        try {
            fa = sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            log.error("初始化SqlSessionFactory失败", e);
        }
        return fa;
    }

    @Bean
    public PlatformTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }



}
