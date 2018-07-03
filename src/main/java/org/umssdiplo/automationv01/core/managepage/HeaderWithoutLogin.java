package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class HeaderWithoutLogin extends BasePage {

    @FindBy(name = "reports_button")
    private WebElement reportsTab;

    @FindBy(name = "login_button")
    private WebElement loginBtn;

    @FindBy(name = "home_button")
    private WebElement homeBtn;

    public SHReport clickReportTab() {
        CommonEvents.clickButton(reportsTab);
        return new SHReport();
    }

    public SHLogin openLoginPage() {
        CommonEvents.clickButton(loginBtn);
        return new SHLogin();
    }

    public void openLoginPageInstantied() {
        CommonEvents.clickButton(loginBtn);
    }

    public void clickHomeTab() {
        CommonEvents.waitUntil(50);
        CommonEvents.clickButton(homeBtn);
    }
}