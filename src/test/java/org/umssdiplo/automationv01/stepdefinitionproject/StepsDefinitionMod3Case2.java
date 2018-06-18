package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHLogin;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHOrganization;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionMod3Case2 {
    private SHLogin login;
    private SHOrganization organization;

    @Given("^'SMARTHOUSE' page is loaded init$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.smartHousePage();
    }
    @And("^init admin credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
        //login.closeLoginConfirm();
    }
    @And("^close 'Login' page$")
    public void closeLoginPage() throws Throwable {

        login.closeLoginConfirm();
    }

    @And("^load form organization in 'SmartHouse'$")
    public void openFormOrganizationOnSmartHouse() throws Throwable {
        organization = new SHOrganization();
        organization.openOrganizationForm();
    }

    @And("^load data organization in 'SmartHouse'$")
    public void loadDataOrganizationOnSmartHouse() throws Throwable {
        organization.setOrganizationForm();
    }
}
