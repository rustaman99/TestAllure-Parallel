package utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;


public class PropertiesReader {
     private static   Properties prop;

    static {
        try {
            prop = readPropertiesFile("src/main/resources/application.properties");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String name){
        return prop.getProperty(name);
    }
    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }

}
