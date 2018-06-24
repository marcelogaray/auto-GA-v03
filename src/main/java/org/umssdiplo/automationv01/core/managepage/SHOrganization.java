package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHOrganization extends BasePage {

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

    public String getInitDateBigerEndDateMessage() {
        String message = String.format(PropertyAccessor.getInstance().getMessageErrorInitdateBigerEnddate(), PropertyAccessor.getInstance().getInitDateNewOrg(), PropertyAccessor.getInstance().getEndDateNewOrg());
        return message;
    }

    public String getAlertMessage() {
        return CommonEvents.getTextContent(messageAlert);
    }

    private void setOrgNameInputField() {
        CommonEvents.setDateInputField(nameElementNewOrgForm, PropertyAccessor.getInstance().getNameNewOrg());
    }

    private void setOrgDescriptionInputField() {
        CommonEvents.setDateInputField(descripitionElementNewOrgForm, PropertyAccessor.getInstance().getDescNewOrg());
    }

    private void setOrgCodeInputField() {
        CommonEvents.setDateInputField(codeElementNewOrgForm, PropertyAccessor.getInstance().getCodeNewOrg());
    }

    private void setOrgGestionInputField() {
        CommonEvents.setDateInputField(gestionElementNewOrgForm, PropertyAccessor.getInstance().getGestionNewOrg());
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

    public void fillNewOrganizationForm() {
        setOrgNameInputField();
        setOrgDescriptionInputField();
        setOrgGestionInputField();
        setOrgCodeInputField();
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