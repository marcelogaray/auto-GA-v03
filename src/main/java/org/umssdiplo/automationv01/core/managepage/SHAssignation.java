package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignation extends BasePage {

    @FindBy(name = "edit_assignment")
    private WebElement buttonEditModal;
    @FindBy(name = "logout_button")
    private WebElement logOut;

    public void isEditButtonVisible() {
        CommonEvents.waitWebElementIsVisible(buttonEditModal);
    }

    public SHAssignModalEdit clickEditModal() {
        isEditButtonVisible();
        CommonEvents.clickButton(buttonEditModal);
        return new SHAssignModalEdit();
    }

    public void isLogoutButtonVisible() {
        CommonEvents.waitWebElementIsVisible(logOut);
    }

    public void logOutSystem() {
        isLogoutButtonVisible();
        CommonEvents.clickButton(logOut);
    }
}