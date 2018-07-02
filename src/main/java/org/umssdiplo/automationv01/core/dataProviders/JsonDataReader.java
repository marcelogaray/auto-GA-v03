package org.umssdiplo.automationv01.core.dataProviders;

import com.google.gson.Gson;
import org.umssdiplo.automationv01.core.dataTypes.Employee;
import org.umssdiplo.automationv01.core.dataTypes.Organization;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataReader {
    private final String dataFilePath = PropertyAccessor.getInstance().getJsonDataFilePath();

    public Employee getEmployeeData() {
        String employeJsonDataFilePath = dataFilePath + "employee.json";
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(employeJsonDataFilePath));
            Employee employee = gson.fromJson(bufferReader, Employee.class);
            return employee;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + employeJsonDataFilePath);
        } finally {
            try {
                if (bufferReader != null) bufferReader.close();
            } catch (IOException ignore) {
            }
        }
    }
  public Organization getOrganizationData() {
        String employeJsonDataFilePath = dataFilePath + "organization.json";
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(employeJsonDataFilePath));
            Organization organization = gson.fromJson(bufferReader, Organization.class);
            return organization;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + employeJsonDataFilePath);
        } finally {
            try {
                if (bufferReader != null) bufferReader.close();
            } catch (IOException ignore) {
            }
        }
    }

    public Organization getOrganizationData(String jsonFileName) {
        String employeJsonDataFilePath = dataFilePath + jsonFileName + ".json";
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(employeJsonDataFilePath));
            Organization organization = gson.fromJson(bufferReader, Organization.class);
            return organization;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + employeJsonDataFilePath);
        } finally {
            try {
                if (bufferReader != null) bufferReader.close();
            } catch (IOException ignore) {
            }
        }
    }
}