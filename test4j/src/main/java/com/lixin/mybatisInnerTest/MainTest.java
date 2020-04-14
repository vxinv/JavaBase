/*
package com.lixin.mybatisInnerTest;


import com.lixin.mapper.ProductDao;
import com.lixin.model.Product;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.net.URL;

/*
public class MainTest {

    SqlConfiger sqlConfiger = new SqlConfiger();

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testPath(){
        //
        URL xmlpath = this.getClass().getClassLoader().getResource("");
        System.out.println(xmlpath);

        //获取当前工程路径
        System.out.println(System.getProperty("user.dir"));

        //获取所有的类路径
        //System.out.println(System.getProperty("java.class.path"));
    }


    @Test
    public void testSessionFactory(){
        */
/**
         * 如果是xml文件配置 解析xml保存在configure
         *//*

        SqlSessionFactory sqlSessionFactory = sqlConfiger.sqlSessionFactoryBean();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ProductDao mapper = sqlSession.getMapper(ProductDao.class);
        Product select = mapper.select(1);

        log.info(select.getName());

    }

    */
/**
     * public Object pluginAll(Object target) {
     *     for (Interceptor interceptor : interceptors) {
     *       target = interceptor.plugin(target);
     *     }
     *     return target;
     *   }
     *
     * *//*


    @Test
    public void testPlugin(){


    }
}
*/
