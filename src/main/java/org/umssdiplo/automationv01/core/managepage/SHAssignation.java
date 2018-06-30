package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignation extends BasePage {

    @FindBy(name = "delete_assignment")
    private WebElement deleteElement;

    @FindBy(name = "logout_button")
    private WebElement logOut;

    public SHAssignModalDelete clicViewModal() {
        CommonEvents.clickButton(deleteElement);
        return new SHAssignModalDelete();
    }
    public void isLogoutButtonVisible() {
        CommonEvents.waitWebElementIsVisible(logOut);
    }

    public void logOutSystem() {
        isLogoutButtonVisible();
        CommonEvents.clickButton(logOut);
    }
}