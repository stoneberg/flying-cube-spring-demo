package com.ktds.flyingcube.common.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * Redis Tools
 *
 * @author CL
 *
 */
@RequiredArgsConstructor
@Component
public class RedisUtils {

    private final StringRedisTemplate redisTemplate;

    /**
     * Get value
     *
     * @param key
     */
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * Setting value
     *
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * Set the value and set the expiration time
     *
     * @param key
     * @param value
     * @param expire Expiration time in seconds
     */
    public void set(String key, String value, Integer expire) {
        redisTemplate.opsForValue().set(key, value, expire, TimeUnit.SECONDS);
    }

    /**
     * Delete key
     *
     * @param key
     */
    public void delete(String key) {
        redisTemplate.opsForValue().getOperations().delete(key);
    }

    /**
     * Setting objects
     *
     * @param key     key
     * @param hashKey hashKey
     * @param object  object
     */
    public void hset(String key, String hashKey, Object object) {
        redisTemplate.opsForHash().put(key, hashKey, object);
    }

    /**
     * Setting objects
     *
     * @param key     key
     * @param hashKey hashKey
     * @param object  object
     * @param expire  Expiration time in seconds
     */
    public void hset(String key, String hashKey, Object object, Integer expire) {
        redisTemplate.opsForHash().put(key, hashKey, object);
        redisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }

    /**
     * Set up HashMap
     *
     * @param key key
     * @param map map value
     */
    public void hset(String key, HashMap<String, Object> map) {
        redisTemplate.opsForHash().putAll(key, map);
    }

    /**
     * key Set value when it does not exist
     *
     * @param key
     * @param hashKey
     * @param object
     */
    public void hsetAbsent(String key, String hashKey, Object object) {
        redisTemplate.opsForHash().putIfAbsent(key, hashKey, object);
    }

    /**
     * Get Hash value
     *
     * @param key
     * @param hashKey
     * @return
     */
    public Object hget(String key, String hashKey) {
        return redisTemplate.opsForHash().get(key, hashKey);
    }

    /**
     * Get all the values of the key
     *
     * @param key
     * @return
     */
    public Object hget(String key) {
        return redisTemplate.opsForHash().entries(key);
    }

    /**
     * Delete all values of key
     *
     * @param key
     */
    public void deleteKey(String key) {
        redisTemplate.opsForHash().getOperations().delete(key);
    }

    /**
     * Judge whether there is a value under the key
     *
     * @param key
     */
    public Boolean hasKey(String key) {
        return redisTemplate.opsForHash().getOperations().hasKey(key);
    }

    /**
     * Judge whether there is a value under key and hasKey
     *
     * @param key
     * @param hasKey
     */
    public Boolean hasKey(String key, String hasKey) {
        return redisTemplate.opsForHash().hasKey(key, hasKey);
    }

}
