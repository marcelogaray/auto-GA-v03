package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.dataTypes.Organization;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHOrganization extends BasePage {

    @FindBy(name = "org_button")
    private WebElement organizationTab;

    @FindBy(name = "org_1")
    private WebElement organizationDetailButton;

    @FindBy(name = "org_77")
    private WebElement organizationBlockedDetailButton;

    @FindBy(name = "del_item_29")
    private WebElement removeItemButton;

    @FindBy(id = "swal2-content")
    private WebElement messageAlert;

    @FindBy(name = "newOrganization_button")
    private WebElement addOrganizationButton;

    @FindBy(name = "newOrganizationForm")
    private WebElement newOrganizationForm;

    @FindBy(name = "cancelNewOrganization")
    private WebElement cancelNewOrganizationButton;

    @FindBy(name = "del_org_2")
    private WebElement removeOrganizationButton;

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

    public void openOrganizationDetailView() {
        CommonEvents.clickButton(organizationDetailButton);
    }

    public void removeItem() {
        CommonEvents.clickButton(removeItemButton);
    }

    public String getAlertMessage() {
        return CommonEvents.getTextContent(messageAlert);
    }

    public void openNewOrganizationForm() {
        CommonEvents.clickButton(addOrganizationButton);
    }

    public void removeOrganization() {
        CommonEvents.clickButton(removeOrganizationButton);
    }

    @FindBy(name = "org_1")
    private WebElement organizationDetailButton;

    @FindBy(name = "newOrganization_button")
    private WebElement addOrganizationButton;

    @FindBy(id = "swal2-content")
    private WebElement messageAlert;

    @FindBy(name = "name")
    private WebElement nameElementNewOrgForm;

    @FindBy(name = "description")
    private WebElement descripitionElementNewOrgForm;

    @FindBy(name = "gestion")
    private WebElement gestionElementNewOrgForm;

    @FindBy(name = "code")
    private WebElement codeElementNewOrgForm;

    @FindBy(name = "start")
    private WebElement startElementNewOrgForm;

    @FindBy(name = "end")
    private WebElement endElementNewOrgForm;

    @FindBy(name = "hierarchicalLevelKey")
    private WebElement hierarchicalLevelSelectElementNewOrgForm;

    @FindBy(id = "mat-option-4")
    private WebElement hierarchicalLevelOptionElementNewOrgForm;

    @FindBy(name = "saveNewOrganization")
    private WebElement saveOrganizationButton;

    @FindBy(css = "#btn_date_picket_start > button")
    private WebElement startDateElementDatePicket;

    @FindBy(css = "#btn_date_picket_end > button")
    private WebElement endDateElementDatePicket;

    @FindBy(xpath = "//td[ contains(@aria-label,'27 June 2018')]")
    private WebElement selectStartDatePicker;

    @FindBy(xpath = "//td[ contains(@aria-label,'25 June 2018')]")
    private WebElement selectEndaDatePicker;

    public void openActiveOrganizationDetailView() {
        CommonEvents.clickButton(organizationDetailButton);
    }

    public void openNewOrganizationModalForm() {
        CommonEvents.clickButton(addOrganizationButton);
    }

    public String getAlertMessage() {
        return CommonEvents.getTextContent(messageAlert);
    }

    private void setOrgNameInputField(String organizationName) {
        CommonEvents.setDateInputField(nameElementNewOrgForm, organizationName);
    }

    private void setOrgDescriptionInputField(String organizationDescription) {
        CommonEvents.setDateInputField(descripitionElementNewOrgForm, organizationDescription);
    }

    private void setOrgCodeInputField(String organizationCode) {
        CommonEvents.setDateInputField(codeElementNewOrgForm, organizationCode);
    }

    private void setOrgGestionInputField(String organizationGestion) {
        CommonEvents.setDateInputField(gestionElementNewOrgForm, organizationGestion);
    }

    private void clickHierarchicalLevelSelect() {
        CommonEvents.clickButton(hierarchicalLevelSelectElementNewOrgForm);
    }

    private void clickHierarchicalLevelOption() {
        CommonEvents.clickButton(hierarchicalLevelOptionElementNewOrgForm);
    }

    private void clickStartDatePicker() {
        CommonEvents.clickButton(startDateElementDatePicket);
    }

    private void clickEndDatePicker() {
        CommonEvents.clickButton(endDateElementDatePicket);
    }


    private void clickStartDate() {
        CommonEvents.clickButton(selectStartDatePicker);
    }

    private void clickEndDate() {
        CommonEvents.clickButton(selectEndaDatePicker);
    }

    public void fillNewOrganizationForm(Organization organization) {
        setOrgNameInputField(organization.getAreaNameNewOrg());
        setOrgDescriptionInputField(organization.getDescriptionNewOrg());
        setOrgGestionInputField(organization.getGestionNewOrg());
        setOrgCodeInputField(organization.getCodeNewOrg());
        clickStartDatePicker();
        clickStartDate();
        clickEndDatePicker();
        clickEndDate();
        clickHierarchicalLevelSelect();
        clickHierarchicalLevelOption();
    }

    public void clickSaveOrganizationButton() {
        CommonEvents.clickButton(saveOrganizationButton);
    }
}