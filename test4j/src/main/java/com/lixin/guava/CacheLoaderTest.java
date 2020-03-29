package com.lixin.guava;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.junit.Test;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;


/**
 * guava 缓存测试
 */
public class CacheLoaderTest {

    @Test
    public void testCache(){
        LoadingCache<String, String> cache = CacheBuilder.newBuilder().maximumSize(100)
                .expireAfterAccess(30, TimeUnit.MILLISECONDS).build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) {
                        return "world";
                    }
                });

        String hello = cache.getUnchecked("hello");
        System.out.println(hello);

        try {
            /*如果没有缓存 获取 缓存*/
            String s = cache.get("world", () -> "hello");
            System.out.println(s);

        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        String s1 = cache.getUnchecked("world");
        System.out.println(s1);

    }
}
