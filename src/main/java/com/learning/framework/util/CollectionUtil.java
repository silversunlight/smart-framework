package com.learning.framework.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

public class CollectionUtil {
    //判断Collection是否为空
    public static boolean isEmpty(Collection<?> collection) {
        return CollectionUtils.isEmpty(collection);
    }

    //判断Collection是否非空
    public static boolean isNotEmpry(Collection<?> collection) {
        return CollectionUtils.isNotEmpty(collection);
    }

    //判断Map是否为空
    public static boolean isEmpty(Map<?, ?> map) {
        return MapUtils.isEmpty(map);
    }

    //判断Map是否非空
    public static boolean isNotEmpry(Map<?, ?> map) {
        return MapUtils.isNotEmpty(map);
    }
}
