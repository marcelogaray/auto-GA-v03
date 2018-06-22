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
    private static final String NEW_EMPLOYEE_CODE = "employeeCode";
    private static final String NEW_EMPLOYEE_NAME = "firstName";
    private static final String NEW_EMPLOYEE_LAST_NAME = "lastName";
    private static final String NEW_EMPLOYEE_NACIONALITY = "nationality";
    private static final String NEW_EMPLOYEE_BIRTH_DATE = "birthDate";
    private static final String NEW_EMPLOYEE_ADMISION_DATE = "admisionDate";
    private static final String NEW_EMPLOYEE_REGISTRATION_DATE = "registrationDate";
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

    public String getUser() {
        return getDataProperty(USER);
    }

    public String getPassword() {
        return getDataProperty(PASSWORD);
    }

    public String getNewEmployeeCode() {
        return getDataProperty(NEW_EMPLOYEE_CODE);
    }

    public String getNewEmployeeName() {
        return getDataProperty(NEW_EMPLOYEE_NAME);
    }

    public String getNewEmployeeLastName() {
        return getDataProperty(NEW_EMPLOYEE_LAST_NAME);
    }

    public String getNewEmployeeNacionality() {
        return getDataProperty(NEW_EMPLOYEE_NACIONALITY);
    }

    public String getNewEmployeeBirthDate() {
        return getDataProperty(NEW_EMPLOYEE_BIRTH_DATE);
    }

    public String getNewEmployeeAdmisionDate() {
        return getDataProperty(NEW_EMPLOYEE_ADMISION_DATE);
    }

    public String getNewEmployeeRegistrationDate() {
        return getDataProperty(NEW_EMPLOYEE_REGISTRATION_DATE);
    }
}