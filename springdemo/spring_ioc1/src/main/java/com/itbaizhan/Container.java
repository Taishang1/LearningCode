package com.itbaizhan;

import com.itbaizhan.dao.StudentDaoImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Container {
    static Map<String,Object> map = new HashMap<>();
    static {
        // 读取配置文件
        InputStream is = Container.class.getClassLoader().getResourceAsStream("bean.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 遍历配置文件的所有配置
        Enumeration<Object> keys = properties.keys();
        while (keys.hasMoreElements()){
            String key = keys.nextElement().toString();
            String value = properties.getProperty(key);
            // 创建对象，将对象放入集合
            try {
                Object o = Class.forName(value).newInstance();
                map.put(key,o);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


    }

    // 从容器中获取对象
    public static Object getBean(String key){
        return map.get(key);
    }
}
