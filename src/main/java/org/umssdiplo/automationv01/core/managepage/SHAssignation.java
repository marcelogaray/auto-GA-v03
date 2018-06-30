package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignation extends BasePage {

    @FindBy(name = "view_assignment")
    private WebElement view_assignmentElement;

    @FindBy(name = "closeX")
    private WebElement closeX;

    @FindBy(name = "logout_button")
    private WebElement logOut;

    public SHAssignModalView clicViewModal (){
        CommonEvents.clickButton(view_assignmentElement);
        return new SHAssignModalView();
    }
    public void isLogoutButtonVisible() {
        CommonEvents.waitWebElementIsVisible(logOut);
    }

    public void logOutSystem() {
        isLogoutButtonVisible();
        CommonEvents.clickButton(logOut);
    }
}