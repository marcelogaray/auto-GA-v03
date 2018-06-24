package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHOrganization extends BasePage {
    @FindBy(name = "org_1")
    private WebElement organizationDetailButton;

    @FindBy(name = "org_77")
    private WebElement organizationBlockedDetailButton;

    @FindBy(name = "newOrganization_button")
    private WebElement addOrganizationButton;

    @FindBy(name = "newOrganizationForm")
    private WebElement newOrganizationForm;

    @FindBy(name = "cancelNewOrganization")
    private WebElement cancelNewOrganizationButton;

    public void openActiveOrganizationDetailView() {
        CommonEvents.clickButton(organizationDetailButton);
    }

    public void openInactiveOrganizationDetailView() {
        CommonEvents.clickButton(organizationBlockedDetailButton);
    }

    public void openNewOrganizationModalForm() {
        CommonEvents.clickButton(addOrganizationButton);
    }

    public Boolean isNewOrganizationButtonPresent() {
        return CommonEvents.isVisible(addOrganizationButton);
    }

    public void clickCancelNewOrganizationButton() {
        CommonEvents.clickButton(cancelNewOrganizationButton);
    }
}