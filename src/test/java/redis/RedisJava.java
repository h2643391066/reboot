package redis;
import redis.clients.jedis.Jedis;

/**
 * Created with IntelliJ IDEA.
 * User: �º���.
 * Date: 2017/3/4.
 * Time: ���� 12:28.
 * Explain:����RedisPool
 */
public class RedisJava {

    public static void main(String[] args) {
        /*RedisPool.getJedis().set("name","�º���");
        System.out.println(RedisPool.getJedis().get("name"));*/
    	Jedis jedis=new Jedis("192.168.171.148",6379);
    	jedis.set("k1", "v1");
    	jedis.set("k2", "v2");
    	jedis.set("k3", "v3");
    }

}