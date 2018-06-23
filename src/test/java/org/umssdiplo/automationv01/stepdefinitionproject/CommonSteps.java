package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class CommonSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHEmployee employee;
    private SHNewEmployeeForm employeeForm;

    @Given("^I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @When("^fill properly credentials in 'Login' modal$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^go to 'Employee' on 'Header' page$")
    public void load_employee_page() throws Throwable {
        employee = headerWithLogin.clickEmployeeTab();
    }

    @And("^click over 'Nuevo Empleado' button on 'Employee' page$")
    public void open_new_employee_page() throws Throwable {
        employeeForm = employee.clickNewEmployeeButton();
    }

    @And("^fill new employee form on 'New Employee Form' page with duplicate 'employee code'$")
    public void click_over_new_employee_button() throws Throwable {
        employeeForm.fillNewEmployeeForm();
    }

    @And("^click over 'Guardar' button on 'New Employee Form' page$")
    public void click_over_guardar_new_employee_button() throws Throwable {
        employeeForm.clickAcceptNewEmployee();
    }

    @Then("^'El codigo de empleado ya se encuentra asignado a otro empleado' information message should be displayed$")
    public void is_message_code_duplicated_showed() throws Throwable {
        Assert.assertEquals(employeeForm.getDuplicateCodeMessage(), employeeForm.getAlertMessage());
    }
}