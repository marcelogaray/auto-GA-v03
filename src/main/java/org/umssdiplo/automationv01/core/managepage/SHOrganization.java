package org.umssdiplo.automationv01.core.managepage;

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

    @FindBy(xpath = "//td[contains(@aria-label,'27 July 2018')]")
    private WebElement selectStartDatePicker;

    @FindBy(xpath = "//td[contains(@aria-label,'25 July 2018')]")
    private WebElement selectEndaDatePicker;

    @FindBy(name = "org_1")
    private WebElement organizationGgDetailButton;

    @FindBy(name = "org_4")
    private WebElement organizationPrdDetailButton;

    @FindBy(name = "org_12")
    private WebElement organizationVtsDetailButton;

    @FindBy(name = "org_41")
    private WebElement organizationMktDetailButton;

    @FindBy(name = "del_org_41")
    private WebElement removeOrganizationButton2;

    @FindBy(className = "swal2-confirm")
    private WebElement okButtonMessageAlert;

    @FindBy(name = "newItem_button")
    private WebElement newItemButton;

    @FindBy(name = "code")
    private WebElement codeFieldInputElement;

    @FindBy(name = "cityKey")
    private WebElement citySelectElement;

    @FindBy(id = "mat-option-156")
    private WebElement cityOptionElement;

    @FindBy(name = "positionKey")
    private WebElement positionSelectElement;

    @FindBy(id = "mat-option-5")
    private WebElement positionOptionElement;

    @FindBy(name = "salaryScaleKey")
    private WebElement salarialScaleSelectElement;

    @FindBy(id = "mat-option-1155")
    private WebElement salarialScaleOptionElement;

    @FindBy(name = "typeContractKey")
    private WebElement typeContractSelectElement;

    @FindBy(id = "mat-option-0")
    private WebElement typeContractOptionElement;

    @FindBy(name = "save_new_item")
    private WebElement saveItemButton;

    @FindBy(xpath = ".//h3[contains(text(),'ITM-050')]")
    private WebElement newItem;

    @FindBy(className = "swal2-confirm")
    private WebElement acceptButtonMessageConfirmation;

    @FindBy(xpath = "//td[contains(@aria-label,'25 July 2018')]")
    private WebElement selectDStartDatePicker;

    @FindBy(xpath = "//td[contains(@aria-label,'28 July 2018')]")
    private WebElement selectDEndaDatePicker;

    @FindBy(xpath = "//h3[contains(text(),'Codigo: ORG-01345')]")
    private WebElement newOrganizationElement;

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

    private void clickStartDateC() {
        CommonEvents.clickButton(selectDStartDatePicker);
    }

    private void clickEndDate() {
        CommonEvents.clickButton(selectEndaDatePicker);
    }

    private void clickEndDateC() {
        CommonEvents.clickButton(selectDEndaDatePicker);
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

    public void fillNewOrganizationFormCorrectly(Organization organization) {
        setOrgNameInputField(organization.getAreaNameNewOrg());
        setOrgDescriptionInputField(organization.getDescriptionNewOrg());
        setOrgGestionInputField(organization.getGestionNewOrg());
        setOrgCodeInputField(organization.getCodeNewOrg());
        clickStartDatePicker();
        clickStartDateC();
        clickEndDatePicker();
        clickEndDateC();
        clickHierarchicalLevelSelect();
        clickHierarchicalLevelOption();
    }

    public void clickSaveOrganizationButton() {
        CommonEvents.clickButton(saveOrganizationButton);
    }

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

    public void removeOrganization2() {
        CommonEvents.clickButton(removeOrganizationButton2);
    }

    public void clickOkButtonMessageAlert() {
        CommonEvents.clickButton(okButtonMessageAlert);
        CommonEvents.waitUntil(3);
    }

    public void navigateToLegalOrg() {
        openOrganizationGGDetailView();
        openOrganizationGAFDetailView();
        openOrganizationVtsDetailView();
    }

    public void clickNewItemButton() {
        CommonEvents.clickButton(newItemButton);
    }

    public void clickSaveItemButton() {
        CommonEvents.clickButton(saveItemButton);
    }

    private void setCodeItemInputField(String itemCode) {
        CommonEvents.setInputField(codeFieldInputElement, itemCode);
    }

    private void clickPositionSelectElement() {
        CommonEvents.clickButton(positionSelectElement);
    }

    private void clickPositionOptionElement() {
        CommonEvents.clickButton(positionOptionElement);
    }

    private void clickSalaryScaleSelectElement() {
        CommonEvents.clickButton(salarialScaleSelectElement);
    }

    private void clickSalaryScaleOptionElement() {
        CommonEvents.clickButton(salarialScaleOptionElement);
    }

    private void clickTypeContractSelectElement() {
        CommonEvents.clickButton(typeContractSelectElement);
    }

    private void clickTypeContractOptionElement() {
        CommonEvents.clickButton(typeContractOptionElement);
    }

    private void clickCitySelectElement() {
        CommonEvents.clickButton(citySelectElement);
    }

    private void clickCityOptionElement() {
        CommonEvents.clickButton(cityOptionElement);
    }

    public void clickAcceptButtonMessage() {
        CommonEvents.clickButton(acceptButtonMessageConfirmation);
    }

    public boolean isNewItemVisible() {
        return CommonEvents.isVisible(newItem);
    }

    public void fillNewItemForm(String itemCode) {
        setCodeItemInputField(itemCode);
        clickCitySelectElement();
        clickCityOptionElement();
        clickPositionSelectElement();
        clickPositionOptionElement();
        clickSalaryScaleSelectElement();
        clickSalaryScaleOptionElement();
        clickTypeContractSelectElement();
        clickTypeContractOptionElement();
    }

    public boolean isNewOrganizationVisible() {
        return CommonEvents.isVisible(newOrganizationElement);
    }
}