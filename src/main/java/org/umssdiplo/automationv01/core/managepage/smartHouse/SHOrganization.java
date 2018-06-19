package org.umssdiplo.automationv01.core.managepage.smartHouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHOrganization extends BasePage {

    @FindBy(name = "org_button")
    private WebElement organizationTab;

    @FindBy(name = "org_1")
    private WebElement organizationDetailButton;

    @FindBy(name = "newOrganization_button")
    private WebElement addOrganizationButton;

    @FindBy(name = "del_org_2")
    private WebElement removeOrganizationButton;

    public void openOrganizationForm() {
        CommonEvents.clickButton(organizationTab);
    public void openOrganizationDetailView() {
        CommonEvents.clickButton(organizationDetailButton);
    }
    public void openNewOrganizationForm() {
        CommonEvents.clickButton(addOrganizationButton);
    }

    public void removeOrganization() {
        CommonEvents.clickButton(organizationTab);
        CommonEvents.clickButton(organizationDetailButton);
        CommonEvents.clickButton(removeOrganizationButton);
    }
}
