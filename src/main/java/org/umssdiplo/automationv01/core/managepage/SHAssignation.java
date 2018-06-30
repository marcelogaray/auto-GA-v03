package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignation extends BasePage {
    @FindBy(name = "assignment_button")
    private WebElement assignmentTab;

    @FindBy(name = "new_assignment")
    private WebElement addAssignmentButton;

    @FindBy(name = "view_assignment")
    private WebElement viewAssignment;

    @FindBy(name = "logout_button")
    private WebElement logOut;

    public void isViewButtonVisible() {
        CommonEvents.waitWebElementIsVisible(viewAssignment);
    }

    public boolean assignationIsPresent() {
        isViewButtonVisible();
        return viewAssignment.isEnabled();
    }

    public void isLogoutButtonVisible() {
        CommonEvents.waitWebElementIsVisible(logOut);
    }

    public void logOutSystem() {
        isLogoutButtonVisible();
        CommonEvents.clickButton(logOut);
    }
}