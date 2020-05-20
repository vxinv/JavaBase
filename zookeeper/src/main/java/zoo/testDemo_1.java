package zoo;

import org.apache.zookeeper.*;

import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.util.List;

public class testDemo_1  {

    String connectString = "112.126.100.73:2181";
    int timeOut = 2000;
    ZooKeeper zooKeeper;
    //连接

    @Before
    public  void testZook() throws IOException {
         zooKeeper = new ZooKeeper(connectString, timeOut, (watchedEvent)-> {
             try {
                 List<String> children = zooKeeper.getChildren("/lixin", (watch) -> {
                     System.out.println(watch.toString());
                 });
                 System.out.println("===============start=================");
                 children.forEach(System.out::println);
                 System.out.println("===============end=================");

             } catch (KeeperException | InterruptedException e) {
                 e.printStackTrace();
             }
         });

    }
    // 创建节点
    @Test
    public void testCreateNode() throws KeeperException, InterruptedException {
        String s = zooKeeper.create("/lixin/name", "age".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
        System.out.println(s);
    }

    // 监听节点的变化
    @Test
    public void  testChange() throws KeeperException, InterruptedException {
        List<String> children = zooKeeper.getChildren("/lixin",true);
        Thread.sleep(100*1000);
    }
    // 判断节点是否存在
    @Test
    public void testHasNode(){
        try {
            Stat exists = zooKeeper.exists("/lixin2", false);
            System.out.println("是否等于空"+(exists==null?"是的":"不是"));
        } catch (KeeperException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    // 监听服务器动态上下线


}
