package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.smartHouse.Header;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHLogin;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHOrganization;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionMod3Case1 {
    private Header menu;
    private SHLogin login;
    private SHOrganization organization;

    @Given("^'SMARTHOUSE' page is loaded$")
    public void smartHousePageIsLoaded() throws Throwable {
        menu = LoadPage.smartHousePage();
    }
    @And("^open 'Login' page$")
    public void openLoginPage() throws Throwable {
        login = menu.clickLoginButton();
    }
    @And("^set admin credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentialsOnLoginForm();
    }
    @And("^accept credentials on 'Login' page$")
    public void acceptLoginCredentials() throws Throwable {
        login.acceptLoginCredentials();
    }
    @And("^close 'Login' page$")
    public void closeLoginPage() throws Throwable {
        login.closeLoginPage();
    }
    @And("^open 'Organization' page$")
    public void openOrganizationPage() throws Throwable {
        organization = menu.clickOrganizationTab();
    }
    @And("^open 'Organization' detail$")
    public void openOrganizationDetail() throws Throwable {
        organization.openOrganizationDetailView();
    }
    @And("^open new 'Organization' form$")
    public void openNewOrganizationForm() throws Throwable {
        organization.openNewOrganizationForm();
    }
    @And("^'SMARTHOUSE' page is closed")
    public void closePage() throws Throwable {
        LoadPage.closePage();
    }
}
