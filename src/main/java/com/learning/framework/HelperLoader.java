package com.learning.framework;

import com.learning.framework.helper.BeanHelper;
import com.learning.framework.helper.ClassHelper;
import com.learning.framework.helper.ControllerHelper;
import com.learning.framework.helper.IoCHelper;
import com.learning.framework.util.ClassUtil;

/**
 * 加载相应的Helper类
 */
public final class HelperLoader {
    public static void init() {
        Class<?>[] classList={
                ClassHelper.class,
                BeanHelper.class,
                IoCHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(),false);
        }
    }
}
