package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
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

    @Given("^I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @When("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^go to 'Estructura Organizacional' on 'Header' page$")
    public void load_Organization_page() {
        organization = headerWithLogin.clickOrganizationTab();
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
        organization.fillNewItemForm();
    }

    @And("^click 'Crear' button on 'New Item' modal on 'Organization' page$")
    public void clickCrearItemButton() {
        organization.clickSaveItemButton();
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