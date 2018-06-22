package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class LoginSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHAccident shAccident;
    private SHAccidentFormModal shAccidentFomModal;


    @Given("^Given I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^Clicked on 'Accidentes' on TabNAv$")
    public void clikOnAccTabNav() throws Throwable {
        shAccident = headerWithLogin.clickAccidentTab();

    }

    @When("^Click on 'Registrar Accidente' on Accidente Page$")
    public void clickOnBtnRegAccPage() throws Throwable {
        shAccidentFomModal = shAccident.ClickRegistarAccBtn();
    }

    @Then("^AccidenteFormModal is Displayed$")
    public void checkModalFomDisplayed() throws Throwable {
        Assert.assertTrue(shAccidentFomModal.isModalDialogPresent());

    }
}
