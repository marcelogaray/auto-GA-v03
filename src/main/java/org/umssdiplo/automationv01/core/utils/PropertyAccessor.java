package org.umssdiplo.automationv01.core.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyAccessor {
    private static final String BROWSER = "browser";
    private static final String BASE_URL = "baseurl";
    private static final String USER = "smartHouseUsername";
    private static final String PASSWORD = "smartHousePassword";
    private static final String JSON_DATA_FILE_PATH = "testDataResourcePath";
    private static PropertyAccessor PropertyAccessor;
    private Properties properties;

    private PropertyAccessor() {
        try (FileInputStream fileInputStream = new FileInputStream("gradle.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException fe) {
            throw new RuntimeException(fe);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PropertyAccessor getInstance() {
        if (PropertyAccessor == null) {
            PropertyAccessor = new PropertyAccessor();
        }
        return PropertyAccessor;
    }

    private String getDataProperty(String nameProperty) {
        String property = System.getProperty(nameProperty);
        if (property == null) {
            return properties.getProperty(nameProperty);
        }
        return property;
    }

    public int getExplicitTimeWait() {
        return Integer.parseInt(getDataProperty("explicitTimeWait"));
    }

    public int getImplicitTimeWait() {
        return Integer.parseInt(getDataProperty("implicitTimeWait"));
    }

    public String getBrowser() {
        return getDataProperty(BROWSER);
    }

    public String getBaseUrl() {
        return getDataProperty(BASE_URL);
    }

    public String getUser() { return getDataProperty(USER); }

    public String getPassword() {
        return getDataProperty(PASSWORD);
    }

    public String getJsonDataFilePath() {
        return getDataProperty(JSON_DATA_FILE_PATH);
    }

    public String getSHDataProperty(String data) {
        return getDataProperty(data);
    }
}