package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.dataProviders.FileReaderManager;
import org.umssdiplo.automationv01.core.dataTypes.Employee;
import org.umssdiplo.automationv01.core.dataTypes.Organization;
import org.umssdiplo.automationv01.core.managepage.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;
import org.umssdiplo.automationv01.core.managepage.SHAssignation;
import org.umssdiplo.automationv01.core.managepage.SHLogin;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;
import org.umssdiplo.automationv01.core.managepage.SHLogin;
import org.umssdiplo.automationv01.core.managepage.SHOrganization;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class CommonSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHOrganization organization;
    private SHEmployee employee;
    private SHNewEmployeeForm employeeForm;
    private Employee employeeData;
    private SHAssignation assignment;
    private Organization organizationData;

    @Given("^I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @When("^fill properly credentials in 'Login' modal$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @When("^Go to 'Asignacion de Equipos' on 'Header' page, press the button 'Nueva Asignacion' on 'Asignacion de Equipos' page$")
    public void go_to_Asignacion_de_Equipos_on_Header_page_press_the_button_Nueva_Asignacion_on_Asignacion_de_Equipos_page() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
        assignment.newAssignment();
    }

    @When("^user selects an employee, a equipment and enters observations of the assignment made on 'Asignar Equipo' modal$")
    public void user_selects_an_employee_a_equipment_and_enters_observations_of_the_assignment_made() throws Throwable {
        assignment.setData();

    }

    @When("^click over 'Crear' button on 'Asignar equipo' modal$")
    public void click_over_Crear_button_on_Asignar_equipo_modal() throws Throwable {
        assignment.registerNewAssignment();
    }

    @Then("^'La asignacion fue registrada correctamente' information message should be displayed on 'Asignacion de Equipos' page$")
    public void la_asignacion_fue_registrada_correctamente_information_message_should_be_displayed() throws Throwable {
        assignment.registeredAssignment();
    }

    @And("^I logOut From 'SMARTHOUSE' Page$")
    public void logOut_From_SMATHOUSE_Page() throws Throwable {
        headerWithoutLogin.openLoginPage();
        login.clickLogOutButton();
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

    @And("^go to 'Estructura Organizacional' on 'Header' page$")
    public void goToEstOrg() {
        organization = headerWithLogin.clickOrganizationTab();
    }

    @And("^click 'Detail' button on 'Gerencia General Enabled' option on 'Organization' page$")
    public void goToActiveArea() {
        organization.openActiveOrganizationDetailView();
    }

    @And("^click 'Nueva Area' button on 'Organization' page$")
    public void clickNewOrganization() {
        organization.openNewOrganizationModalForm();
    }

    @And("^fill 'New Organization' modal form on 'Organization' page with 'start date' biger than 'end date'$")
    public void fillFormOrganizationDataWithStartBigerEndDate() {
        organizationData = FileReaderManager.getInstance().getJsonReader().getOrganizationData("organization_ORG_Case7");
        organization.fillNewOrganizationForm(organizationData);
    }

    @And("^click 'Crear' button on 'New Organization' modal on 'Organization' page$")
    public void clickCreateOrganizationButton() {
        organization.clickSaveOrganizationButton();
    }

    @Then("^'La fecha de inicio de actividades debe ser menor a la fecha final' information message should be displayed.$")
    public void idStartDateBiggerEndDate() {
        String expectedMessage = String.format("La fecha de inicio de actividades (%s) debe ser menor a la fecha final (%s).", organizationData.getInitDateActivitiesNewOrg(), organizationData.getEndDateActivitiesNewOrg());
        Assert.assertEquals(organization.getAlertMessage(), expectedMessage);
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

    @And("^click 'Eliminar' button on 'Item ITM-001' element on 'Organization' page$")
    public void clickRemoveItemButton() {
        organization.removeItem();
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

    @Then("^'El item con id XX no puede eliminarse ya que se encuentra asignado a un empleado' information message should be displayed.$")
    public void itemWithEmployeeMessageIsDisplayed() {
        Assert.assertEquals(organization.getAlertMessage(), "El item con id 29 no puede eliminarse ya que se encuentra asignado a un empleado.");
    }

    @And("^click 'Eliminar' button on 'Organization' page.$")
    public void clickRemoveOrganizationButton2() {
        organization.removeOrganization2();
    }

    @And("^click 'Aceptar' button on 'Information Message' modal$")
    public void clickOkButtonMessageConfirmation() {
        organization.clickOkButtonMessageAlert();
    }

    @Then("^the area should not be present in the list$")
    public void isAreaDeletedPresente() {
        Assert.assertFalse(organization.isOrganizationMaktDetailButtonVisible(), "The Area was not be eliminated");
    }

    @And("^navigate to 'Gerencia General' option on 'Organization' page$")
    public void goToGGArea() {
        organization.openActiveOrganizationDetailView();
    }

    @And("^click 'Nuevo Item' button on 'Organization' page$")
    public void clickNuevoItemButton() {
        organization.clickNewItemButton();
    }

    @And("^fill 'New Item' modal form on 'Organization' page$")
    public void fillNewItemForm() {
        organization.fillNewItemForm("ITM-050");
    }

    @And("^click 'Crear' button on 'New Item' modal on 'Organization' page$")
    public void clickCrearItemButton() {
        organization.clickSaveItemButton();
    }

    @And("^verify 'El Item fue creado correctamente' message info is displayed on 'Organization' page$")
    public void verifyOrgCreatedMessage() {
        Assert.assertEquals(organization.getAlertMessage(), "El Item fue creado correctamente");
    }

    @And("^click 'Aceptar' button on 'Message Information' modal on 'Organization' page$")

    public void clickAceptarInformationMessage() {
        organization.clickAcceptButtonMessage();
    }

    @Then("^new item must be present in items list$")
    public void isPresentNewItem() {
        Assert.assertTrue(organization.isNewItemVisible(), "The new item is not present in the list items.");
    }
}