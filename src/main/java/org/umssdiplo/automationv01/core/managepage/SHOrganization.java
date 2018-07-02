package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
public class SHOrganization extends BasePage {

    @FindBy(xpath = "//a[contains(@class, 'btn-mail')]")
    private WebElement lastElement;
    public SHOrganization() {
        CommonEvents.waitWebElementIsVisible(lastElement);
    }
    @FindBy(name = "org_button")
    private WebElement organizationTab;

    @FindBy(name = "org_1")
    private WebElement organizationDetailButton;

    @FindBy(name = "newOrganization_button")
    private WebElement newOrganizationbutton;

    public void openOrganizationDetailView() {
        CommonEvents.clickButton(organizationDetailButton);
    }

    public SHOrganizationForm openModalOrganizationForm(){
        CommonEvents.clickButton(newOrganizationbutton);
        return new SHOrganizationForm();
    }
}