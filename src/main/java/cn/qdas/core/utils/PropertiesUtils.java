package cn.qdas.core.utils;

import java.io.*;
import java.util.Properties;

public class PropertiesUtils {
    public static Properties readProperties(String filePath) throws FileNotFoundException, IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream(new File(filePath)));
        return properties;
    }
    public static void writeProperties(String key,String value,String comment,String filePath) throws FileNotFoundException, IOException{
        Properties properties=new Properties();

        File file=new File(filePath);
        if(file.exists()){
            FileInputStream fis=new FileInputStream(file);
            properties.load(fis);
            fis.close();
        }
        properties.setProperty(key, value);
        properties.store(new FileOutputStream(new File(filePath)), comment);
    }
}
