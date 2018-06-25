package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHOrganization extends BasePage {
    @FindBy(name = "org_button")
    private WebElement organizationTab;

    @FindBy(name = "org_1")
    private WebElement organizationGgDetailButton;

    @FindBy(name = "org_4")
    private WebElement organizationPrdDetailButton;

    @FindBy(name = "org_12")
    private WebElement organizationVtsDetailButton;

    @FindBy(name = "org_41")
    private WebElement organizationMktDetailButton;

    @FindBy(name = "del_org_41")
    private WebElement removeOrganizationButton;

    @FindBy(id = "swal2-content")
    private WebElement messageAlert;

    @FindBy(className = "swal2-confirm")
    private WebElement okButtonMessageAlert;

    public void openOrganizationGGDetailView() {
        CommonEvents.clickButton(organizationGgDetailButton);
    }

    public void openOrganizationGAFDetailView() {
        CommonEvents.clickButton(organizationPrdDetailButton);
    }

    public void openOrganizationVtsDetailView() {
        CommonEvents.clickButton(organizationVtsDetailButton);
    }

    public boolean isOrganizationMaktDetailButtonVisible() {
        return CommonEvents.isVisible(organizationMktDetailButton);
    }

    public void removeOrganization() {
        CommonEvents.clickButton(removeOrganizationButton);
    }

    public void clickOkButtonMessageAlert() {
        CommonEvents.clickButton(okButtonMessageAlert);
        CommonEvents.waitUntil(3);
    }

    public String getMessageAreaDeleted() {
        return PropertyAccessor.getInstance().getMessageAreaDeleted();
    }

    public String getAlertMessage() {
        return CommonEvents.getTextContent(messageAlert);
    }

    public void navigateToLegalOrg() {
        openOrganizationGGDetailView();
        openOrganizationGAFDetailView();
        openOrganizationVtsDetailView();
    }
}