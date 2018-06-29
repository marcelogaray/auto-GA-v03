package org.umssdiplo.automationv01.core.dataProviders;

import com.google.gson.Gson;
import org.umssdiplo.automationv01.core.dataTypes.Employee;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataReader {
    private final String customerFilePath = PropertyAccessor.getInstance().getJsonDataFilePath() + "employee.json";
    private Employee employee;

    public JsonDataReader() {
        employee = getEmployeeData();
    }

    public Employee getEmployeeData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(customerFilePath));
            Employee employee = gson.fromJson(bufferReader, Employee.class);
            return employee;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + customerFilePath);
        } finally {
            try {
                if (bufferReader != null) bufferReader.close();
            } catch (IOException ignore) {
            }
        }
    }
}