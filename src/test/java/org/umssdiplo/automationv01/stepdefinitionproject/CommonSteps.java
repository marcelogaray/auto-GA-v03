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
    private SHOrganization organization;
    private SHEmployee employee;

    @Given("^Given I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @When("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^I go to 'Estructura Organizacional' on 'Header' page$")
    public void load_Organization_page() {

        organization = headerWithLogin.clickOrganizationTab();
    }

    @And("^I click on 'Detail' button on 'Gerencia General' item on 'Organization List' page$")
    public void goToArea() {

        organization.openOrganizationDetailView();
    }

    @And("^I click on 'Nueva Area' button on 'Organization Detail' page$")
    public void openModalOrganizationForm() {

        organization.openModalOrganizationForm();
    }

    @And("^I fill Organization information, specially Organization Code with 'ORG-0001'$")
    public void fillOrganizationDataInModalForm() {

        organization.fillOrganizationDataInModalForm();
    }

    @And("^I click on 'Crear' button in 'Crear Area' modal form$")
    public void saveOrganizationModalForm() {

        organization.saveOrganizationModalForm();
    }

    @Then("^I should see the alert with the next text: 'Already exists a Organization with the code ORG-0001'$")
     public void theAlertIsDisplayed() throws Throwable {
        Assert.assertTrue(organization.isAlertPresent());
        organization.pressConfirmAlertButton();
        organization.cancelModal();
     }

    @And("^I click on 'Personal' option on 'Header' page$")
    public void load_Personal_page() {

        employee = headerWithLogin.clickEmployeeTab();
    }

    @And("^I click on 'Eliminar Empleado' button on 'Ruben Moscoso' item on 'Lista de Empleados' page$")
    public void showConfirmAlert() {

        employee.clickDeleteButton();
    }

    @Then("^I should see the Confirm alert with the next text: 'Estas Seguro que deseas eliminar al Empleado!'$")
    public void theConfirmAlertIsDisplayed() throws Throwable {
        Assert.assertTrue(employee.isAlertPresent());
        employee.clickCancelAlertButton();
    }

    @And("^I Confirm alert  'Estas Seguro que deseas eliminar al Empleado!', click in \"Si, Eliminar\" button$")
    public void clickConfirmAlert() {

        employee.clickConfirmAlertButton();
    }

    @Then("^I should see the alert with the next text: 'No se pudo eliminar porque tiene algun equipo o item asignado'$")
    public void theErrorAlertIsDisplayed() throws Throwable {
        Assert.assertTrue(employee.isAlertVisible());
        employee.clickAcceptAlertButton();
    }

    @When("^I click on 'Ver detalles de empleado' button on 'Margotd Leticia Fernandez Garcia' item on 'Lista de Empleados' page$")
    public void clickViewDetailsEmployee() {

        employee.clickViewDetailsEmployee();
    }

    @Then("^I should see the detail of information of employee selected$")
    public void employeeDetailsIsDisplayed() throws Throwable {

        Assert.assertTrue(employee.isDetailsVisible(),"don't show the employee detail");
    }
}
