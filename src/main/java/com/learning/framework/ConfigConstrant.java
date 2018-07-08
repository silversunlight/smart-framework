package com.learning.framework;

/**
 * 提供相关配置项的常量
 */
public interface ConfigConstrant {
    String CONFIG_FILE = "smart.properties";
    String JDBC_DRIVER = "smart.framework.jdbc.driver";
    String JDBC_URL = "smart.framework.jdbc.url";
    String JDBC_USERNAME = "smart.framework.jdbc.username";
    String JDBC_PASSWORD = "smart.framework.jdbc.password";
    //基础包名
    String APP_BASE_PACKAGE = "smart.framework.app.base_package";
    //jsp文件的路径
    String APP_JSP_PATH="smart.framework.app.jsp_path";
    //表示静态资源的路径
    String APP_ASSET_PATH = "smart.framework.app.asset_path";

}
