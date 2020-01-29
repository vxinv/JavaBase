package proxy.trafficProxy;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import proxy.entitys.Pair;

import java.util.List;


@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "plist")

public class TrafficConfig {

    private List<Pair> pairs;

    private int localPort;

    public int getLocalPort() {
        return localPort;
    }

    public void setLocalPort(int localPort) {
        this.localPort = localPort;
    }

    public List<Pair> getPairs() {
        return pairs;
    }

    public void setPairs(List<Pair> pairs) {
        this.pairs = pairs;
    }
}
