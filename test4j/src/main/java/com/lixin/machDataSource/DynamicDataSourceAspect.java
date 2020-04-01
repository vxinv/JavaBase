package com.lixin.machDataSource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * aop 切换
 */
@Aspect
@Component
public class DynamicDataSourceAspect {
    Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * switch datasource
     * @param point point
     * @param targetDataSource target
     */
    @Before("@annotation(targetDataSource)")
    public void switchDataSource(JoinPoint point,TargetDataSource targetDataSource){
        if (!DynamicDataSourceContextHolder.dataSourceKeys.contains(targetDataSource.value())){
            log.error("datasource[{}] not exist,use default datasource", targetDataSource.value());
        }else {
            DynamicDataSourceContextHolder.setDataSourceKey(targetDataSource.value());
            log.info("switch datasource to [{}] in method [{}]",DynamicDataSourceContextHolder.getDataSourcekey(),point.getSignature());
        }
    }


    /**
     * restore datasource
     * @param point
     * @param targetDataSource
     */
    @After("@annotation(targetDataSource)")
    public void restoreDataSource(JoinPoint point,TargetDataSource targetDataSource){
            DynamicDataSourceContextHolder.clearDataSourcekey();
            log.info("Restore DataSource to [{}] in Method [{}]",DynamicDataSourceContextHolder.getDataSourcekey(),point.getSignature());
    }


}
