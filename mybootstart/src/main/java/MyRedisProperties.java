import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * FileName: RedisProperties
 * Author:   李鑫
 * Date:     2020/4/14 12:48
 * Description: redis的配置类
 */
@Data
@Accessors(chain = true)
@ConfigurationProperties(prefix = "myredis")

public class MyRedisProperties {
    private Integer port;
    private String host;
    private String password;
    private int index;
}
