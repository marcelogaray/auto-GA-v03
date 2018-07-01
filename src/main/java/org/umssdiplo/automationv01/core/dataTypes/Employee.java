package org.umssdiplo.automationv01.core.dataTypes;

public class Employee {
    private String employeeCode;//=EMP-5
    private String firstName;//=Daniela
    private String lastName;//=Rios
    private String birthDate;//=20-12-1985
    private String gender;//=Femenino
    private String nationality;//=Boliviana
    private String admisionDate;//=20-12-1985
    private String status;//=Activo
    private String registrationDate;//=20-12-1985
    private String messageErrorEmployeeDuplicatetCode;//=El codigo de empleado %s ya se encuentra asignado a otro empleado

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAdmisionDate() {
        return admisionDate;
    }

    public void setAdmisionDate(String admisionDate) {
        this.admisionDate = admisionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getMessageErrorEmployeeDuplicatetCode() {
        return messageErrorEmployeeDuplicatetCode;
    }

    public void setMessageErrorEmployeeDuplicatetCode(String messageErrorEmployeeDuplicatetCode) {
        this.messageErrorEmployeeDuplicatetCode = messageErrorEmployeeDuplicatetCode;
    }
}
