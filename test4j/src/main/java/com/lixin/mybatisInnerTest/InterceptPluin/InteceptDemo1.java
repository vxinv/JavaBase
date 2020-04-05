package com.lixin.mybatisInnerTest.InterceptPluin;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Statement;
import java.util.Properties;

/**
 * Mybatis 的插件
 *Ls
 */
// 用来拦截那个对象的那个方法
@Intercepts({@Signature(type = StatementHandler.class,method = "parameterize" ,args = Statement.class)})
public class InteceptDemo1  implements Interceptor {

    Logger log = LoggerFactory.getLogger(this.getClass());
    /**
     * 拦截目标方法执行
     * @param invocation
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        /**
         * 放行 执行目标方法
         */
        log.info("拦截器开始拦截"+invocation.getMethod().getName());
        MetaObject metaObject = SystemMetaObject.forObject(invocation.getTarget());
        Object value = metaObject.getValue("parameterHandler.parameterObject");
        log.info("sql语句的参数是[{}] ", value);
        Object proceed = invocation.proceed();
        return proceed;
    }
    /**
     * 插件包装 四大对象的生成都会调用这个方法
     *
     * @param target
     * @return
     */
    @Override
    public Object plugin(Object target) {
        // 可以借助这个类 来使用当前的intercept 来拦截当前对象
        log.info("将要包装的对象{}", target);
        Object wrap = Plugin.wrap(target, this);
        log.info("包装完成的对象{}", target);
        // 返回为当前target创建的代理
        return wrap;
    }


    /**
     * 将插件注册时的property 设置进来
     * @param properties
     */
    @Override
    public void setProperties(Properties properties) {


    }
}





