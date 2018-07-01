package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.dataProviders.FileReaderManager;
import org.umssdiplo.automationv01.core.dataTypes.Employee;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class CommonSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHOrganization organization;
    private SHEmployee employee;
    private SHNewEmployeeForm employeeForm;
    private Employee employeeData;

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
        employeeData = FileReaderManager.getInstance().getJsonReader().getEmployeeData();
        employeeForm.fillNewEmployeeForm(employeeData);
    }

    @And("^click over 'Guardar' button on 'New Employee Form' page$")
    public void click_over_guardar_new_employee_button() throws Throwable {
        employeeForm.clickAcceptNewEmployee();
    }

    @Then("^'El codigo de empleado ya se encuentra asignado a otro empleado' information message should be displayed$")
    public void is_message_code_duplicated_showed() throws Throwable {
        String messageExpected = String.format("El codigo de empleado %s ya se encuentra asignado a otro empleado", employeeData.getEmployeeCode());
        Assert.assertEquals(employeeForm.getAlertMessage(), messageExpected);
    }

    @And("^click 'Detail' button on 'Gerencia General' option on 'Organization' page$")
    public void goToArea() {
        organization.openOrganizationDetailView();
    }

    @And("^click 'Eliminar' button on 'Organization' page$")
    public void clickRemoveOrganizationButton() {
        organization.removeOrganization();
    }

    @Then("^'El area con id XX no puede eliminarse ya que tiene areas y/o empleados asignados' information message should be displayed$")
    public void areaWithEmployeeMessageIsDisplayed() {
        Assert.assertEquals(organization.getAlertMessage(), "El area con id 2 no puede eliminarse ya que tiene areas y/o empleados asignados.");
    }

    @And("^go to 'Estructura Organizacional' on 'Header' page$")
    public void load_Organization_page() {
        organization = headerWithLogin.clickOrganizationTab();
    }

    @And("^click 'Nuea Area' button on 'Organization' page$")
    public void clickNewOrganization() {
        organization.openNewOrganizationModalForm();
    }

    @And("^click 'Cancelar' button on 'New Organization' modal form$")
    public void clickCancelNewOrganization() {
        organization.clickCancelNewOrganizationButton();
    }

    @And("^go to 'Home' on 'Header' page$")
    public void goToHome() {
        headerWithoutLogin.clickHomeTab();
    }

    @And("^click 'Detail' button on 'Gerencia General Disabled' option on 'Organization page'$")
    public void goToDisabledArea() {
        organization.openInactiveOrganizationDetailView();
    }

    @Then("^'Nueva Area' button is not present on 'Organization' page$")
    public void isNewOrganizationButtonNotPresent() {
        Assert.assertFalse(organization.isNewOrganizationButtonPresent(), "'New Organization' button is present.");
    }
}