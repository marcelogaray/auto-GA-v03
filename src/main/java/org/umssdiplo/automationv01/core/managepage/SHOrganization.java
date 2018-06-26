package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHOrganization extends BasePage {
    @FindBy(name = "org_button")
    private WebElement organizationTab;

    @FindBy(name = "org_1")
    private WebElement organizationDetailButton;

    @FindBy(name = "newOrganization_button")
    private WebElement newOrganizationbutton;

    @FindBy(name = "newOrganizationForm")
    private WebElement formModal;

    @FindBy(name= "cancelNewOrganization")
    private WebElement cancelButton;

    public void openOrganizationDetailView() {
        CommonEvents.clickButton(organizationDetailButton);
    }

    public void openModalOrganizationForm(){
        CommonEvents.clickButton(newOrganizationbutton);
    }

    public boolean isModalFormPresent() {
        CommonEvents.waitUntil(1000);
        return formModal.isDisplayed();
    }

    public void cancelModal(){
        CommonEvents.clickButton(cancelButton);
    }

}