package org.umssdiplo.automationv01.core.managepage.SmarthHouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHLogin extends BasePage {
    @FindBy(name = "username")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(name = "login_button")
    private WebElement loginBtn;

    @FindBy(id = "login")
    private WebElement aceptLoginBtn;

    @FindBy(name = "close_login_button")
    private WebElement closeLoginBtn;

    public void clickLoginButton() {
        CommonEvents.clickButton(loginBtn);
    }

    public void setUsernameInputField(){
        CommonEvents.setInputField(usernameInputField, PropertyAccessor.getInstance().getUser());
    }

    public void setPasswordInputField(){
        CommonEvents.setInputField(passwordInputField, PropertyAccessor.getInstance().getPassword());
    }

    public void clickAcceptLoginButton() {
        CommonEvents.clickButton(aceptLoginBtn);
    }

    public void clickCloseLoginButton() {
        CommonEvents.clickButton(closeLoginBtn);
    }

    public void fillCredentials() {
        clickLoginButton();
        setUsernameInputField();
        setPasswordInputField();
        clickAcceptLoginButton();
        clickCloseLoginButton();
    }
}