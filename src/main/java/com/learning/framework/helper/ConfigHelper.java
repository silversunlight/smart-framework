package com.learning.framework.helper;

import com.learning.framework.ConfigConstrant;
import com.learning.framework.util.PropsUtil;

import java.util.Properties;

/**
 * 属性文件助手类
 */
public class ConfigHelper {
    private static final Properties CONFIG_PROPS = PropsUtil.loadProps(
            ConfigConstrant.CONFIG_FILE
    );

    //获取jdbc驱动
    public static String getJdbcDriver() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstrant.JDBC_DRIVER);
    }

    //获取jdbc url
    public static String getJdbcUrl() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstrant.JDBC_URL);
    }

    //获取jdbc username
    public static String getJdbcUsername() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstrant.JDBC_USERNAME);
    }

    //获取jdbc password
    public static String getJdbcPassword() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstrant.JDBC_PASSWORD);
    }

    //获得应用基础包名
    public static String getAppBasePackage() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstrant.APP_BASE_PACKAGE);
    }

    //获得视图文件的路径
    public static String getAppJspPath() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstrant.APP_JSP_PATH,
                "/WEB-INF/view/");
    }

    //获取应用静态资源的路径
    public static String getAppAssetPath() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstrant.APP_ASSET_PATH,
                "/asset/");
    }
}
