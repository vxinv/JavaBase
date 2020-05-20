import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

import javax.sound.midi.SoundbankResource;

/**
 * FileName: RedisAutoConfiguration
 * Author:   李鑫
 * Date:     2020/4/14 12:55
 * Description:
 */

@Configuration
//只有当 Jedis存在的时候 才会执行这个配置
//@ConditionalOnClass(Jedis.class)
// 引入属性类
@EnableConfigurationProperties(MyRedisProperties.class)
public class
RedisAutoConfiguration {

   /* @Bean
    // 当这个bean不存在的时候才执行
    @ConditionalOnMissingBean
    public Jedis  jedis(MyRedisProperties properties){
        Jedis jedis = new Jedis(properties.getHost(), properties.getPort());
        jedis.auth(properties.getPassword());
        jedis.select(properties.getIndex());
        return jedis;
    }*/

    @Bean
    public String testBootAutoConfigure(MyRedisProperties properties){
        System.out.println("==========================>Hello Boot<==========================");
        return "hello";
    }

}
