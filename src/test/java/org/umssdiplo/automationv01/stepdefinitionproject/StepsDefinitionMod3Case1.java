package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.smartHouse.Header;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionMod3Case1 {
    private SHLogin login;
    private Header menu;
    @Given("^'SMARTHOUSE' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        menu = LoadPage.smartHousePage();
    }
    @And("^set admin credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }
}
