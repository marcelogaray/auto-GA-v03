package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHAccident;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionMod2Case1 {
    private SHLogin login;
    private SHAccident shAccident;

    @Given("^'SMARTHOUSE's' page is loaded$")
    public void smarthouse_page_is_loaded() throws Throwable {
        login = LoadPage.smartHousePage();
    }

    @And("^set admin's credentials on 'Login' page$")
    public void set_admin_credentials_on_Login_page() throws Throwable {
        login.setCredentials();
    }

    @And("^Verify \"Registro Accidente\" Form is Deploy$")
    public void verify_Form_is_Deploy() throws Throwable {
        shAccident = new SHAccident();
        shAccident.accidentFomDeploy();
    }

    @And("^Fill full data into Form$")
    public void fillFullDataForm() throws Throwable {
        shAccident.setFormFullData1();
    }

    @And("^Verify \"Crear\" button is Enable$")
    public void verifyButtonCrearIsAnable() throws Throwable {
        shAccident.verifyButtonCrearIsEnable();
    }

    @And("^Verify Cancle, Close Btn$")
    public void veryCloseCanlebtn() throws Throwable {
        // shAccident = new SHAccident();
        shAccident.closeBtnCancelBtn();
    }

}
