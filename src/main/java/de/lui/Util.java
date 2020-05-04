package com.exapital;

import javax.cache.Cache;
import javax.cache.CacheFactory;
import javax.cache.CacheManager;
import java.util.Collections;
import java.util.logging.Logger;

public class Util {
    private static final Logger log = Logger.getLogger(Util.class.getName());

    public static Cache getCache() {
        Cache cache;
        try {
            CacheFactory cacheFactory = CacheManager.getInstance().getCacheFactory();
            cache = cacheFactory.createCache(Collections.emptyMap());
            return cache;
        } catch (Exception e) {
            log.warning("failed" + e);
            return null;
        }
    }
}
