package com.example.redisconnection;

import com.example.redisconnection.util.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisUtils redis;

    @Test
    public void redisTest() {
        // Redis 데이터 저장
        redis.setData("test2", "ttt");

        // Redis 데이터 저장 확인
        System.out.println("retrievedValue = " + redis.getData("test2"));
    }
}
