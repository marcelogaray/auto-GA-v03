package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHLogin extends BasePage {
    @FindBy(name = "username")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(id = "login")
    private WebElement aceptLoginBtn;

    @FindBy(name = "close_login_button")
    private WebElement closeLoginBtn;

    public void setUsernameInputField() {
        CommonEvents.setInputField(usernameInputField, PropertyAccessor.getInstance().getUser());
    }

    public void setPasswordInputField() {
        CommonEvents.setInputField(passwordInputField, PropertyAccessor.getInstance().getPassword());
    }

    public void clickAcceptLoginButton() {
        CommonEvents.clickButton(aceptLoginBtn);
    }

    public void clickCloseLoginButton() {
        CommonEvents.clickButton(closeLoginBtn);
    }

    public HeaderWithLogin fillCredentials() {
        setUsernameInputField();
        setPasswordInputField();
        clickAcceptLoginButton();
        clickCloseLoginButton();
        return new HeaderWithLogin();
    }
}