package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.SmarthHouse.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class LoginSteps {
    private SHLogin login;

    @Given("^'SMARTHOUSE s page is loaded$")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        login = LoadPage.smartHousePage();
    }

    @And("^click on button 'Login' on the header$")
    public void click_on_button_Login_on_the_header() throws Throwable {
        login.clickLoginButton();
    }

    @And("^set username for 'admin'$")
    public void setUsername() throws Throwable {
        login.setUsernameInputField();
    }

    @And("^set password for 'admin'$")
    public void setPassword() throws Throwable {
        login.setPasswordInputField();
    }

    @And("^click on button 'Login'$")
    public void clickLoginButton() throws Throwable {
        login.clickAcceptLoginButton();
    }

    @And("^click on button 'x' on header modal$")
    public void clickOnCloseButton() throws Throwable {
        login.clickCloseLoginButton();
    }

}
