package redis;

import redis.clients.jedis.JedisShardInfo;

/**
 * @author jinguishan
 * @create 2019-02-10 18:05
 */
public class TestRedis {
    public static void main(String[] args) {
        JedisShardInfo shardInfo = new JedisShardInfo("47.101.57.52",6379);
        shardInfo.setPassword("jgs6122x");
        System.out.println(shardInfo.createResource());
    }
}
