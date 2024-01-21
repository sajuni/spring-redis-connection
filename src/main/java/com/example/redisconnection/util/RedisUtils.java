package com.example.redisconnection.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisUtils {
    private final RedisTemplate<String, String> redisTemplate;

    public RedisUtils(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void setData(String key, String value){
        redisTemplate.opsForValue().set(key, value);
    }

    public String getData(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public void deleteData(String key){
        redisTemplate.delete(key);
    }
}
