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

    @Then("^I should see the 'Crear Area' modal form$")
     public void theModalOrganizationIsDisplayed() throws Throwable {
        Assert.assertTrue(organization.isModalFormPresent());
        organization.cancelModal();
     }


}
