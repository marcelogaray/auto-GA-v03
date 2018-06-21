package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class HeaderWithLogin extends BasePage {

    @FindBy(name = "login_button")
    private WebElement loginBtn;

    public SHLogin openLoginPage(){
        CommonEvents.clickButton(loginBtn);
        return new SHLogin();
    }
}