package org.umssdiplo.automationv01.core.managepage.smartHouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHLogin extends BasePage {
    @FindBy(name = "username")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(name = "emp_button")
    private WebElement loginBtn;

    @FindBy(name = "accept_login_button")
    private WebElement aceptLoginBtn;

    @FindBy(name = "close_login_button")
    private WebElement closeLoginBtn;
    public void setCredentials() {
        CommonEvents.clickButton(loginBtn);
        String username = PropertyAccessor.getInstance().getSHUser();
        String password = PropertyAccessor.getInstance().getSHPassword();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(aceptLoginBtn);
        CommonEvents.clickButton(closeLoginBtn);
    }
}
