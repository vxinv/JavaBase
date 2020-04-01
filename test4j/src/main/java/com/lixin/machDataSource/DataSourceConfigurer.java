package com.lixin.machDataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfigurer  {

    @Bean("master")
    @Primary
    //@ConfigurationProperties(prefix = "spring.datasource.master")
    public DataSource master(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://rm-2ze3kt2861n4gf13mpo.mysql.rds.aliyuncs.com:3306/product_master"); //数据源
        return getDataSource(config);
    }


    @Bean("slave")
    //@ConfigurationProperties(prefix = "spring.datasource.slave")
    public DataSource slave(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://rm-2ze3kt2861n4gf13mpo.mysql.rds.aliyuncs.com:3306/product_slave_alpha"); //数据源
        return getDataSource(config);

    }


    @Bean("dynamicDataSource")
    public DataSource dynamicDataSource(){
        DynamicRoutingDataSource dynamicRoutingDataSource = new DynamicRoutingDataSource();
        Map<Object,Object> dataSourceMap = new HashMap<>(2);
        dataSourceMap.put("master", master());
        dataSourceMap.put("slave", slave());
        // set defalut
        dynamicRoutingDataSource.setDefaultTargetDataSource(master());
        dynamicRoutingDataSource.setTargetDataSources(dataSourceMap);
        // to put datasource keys into DatasourceContextHolder
        DynamicDataSourceContextHolder.dataSourceKeys.addAll(dataSourceMap.keySet());
        return  dynamicRoutingDataSource;
    }

    @Bean
    @ConfigurationProperties(prefix = "mybatis")
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dynamicDataSource());
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("mybatis/mappers/**Mapper.xml"));
        return sqlSessionFactoryBean;
    }

    @Bean
    public PlatformTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dynamicDataSource());
    }

    private DataSource getDataSource(HikariConfig config) {
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
}
