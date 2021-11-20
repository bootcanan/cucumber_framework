package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //1. properties objesi olusturmak

    // bu objenin projenin heryerinden class ismi ile cagirilabilmesi icin static yapiyoruz
// bu objeye class disindan mudahale olmamasi icin private yapiyoruz

    private static Properties properties;

    static{// herseyden once calisir
        String path="configuration.properties";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            properties=new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }


    public static String getProperty(String key) {
        String value = properties.getProperty(key);

        return value;


    }
    }
