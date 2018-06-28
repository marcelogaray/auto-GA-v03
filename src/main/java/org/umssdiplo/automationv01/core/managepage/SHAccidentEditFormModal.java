package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccidentEditFormModal extends BasePage {

    @FindBy(id = "editAccidentTitle")
    private WebElement editTitleModal;

    @FindBy(name = "employee")
    private WebElement employeeAuto;

    @FindBy(name = "title")
    private WebElement title;

    @FindBy(name = "code")
    private WebElement code;

    @FindBy(name = "levelRisk")
    private WebElement levelRisk;

    @FindBy(name = "accidentTypeKey")
    private WebElement accidentTypeSelect;

    @FindBy(name = "dateEvent")
    private WebElement dateEvent;

    @FindBy(name = "describeIssue")
    private WebElement description;

    @FindBy(name = "status")
    private WebElement statusSelect;

    public boolean isEditModalPresent() {
        return editTitleModal.isDisplayed();
    }

    public String getEmployeeValue() {
        return employeeAuto.getAttribute("value");
    }

    public String getTitleValue() {
        return title.getAttribute("value");
    }

    public String getCodeValue() {
        return code.getAttribute("value");
    }

    public String getLevelRiskValue() {
        return levelRisk.getAttribute("value");
    }

    public String getAccidentTypeValue() {
        return accidentTypeSelect.getAttribute("value");
    }

    public String getDateEventValue() {
        return dateEvent.getAttribute("value");
    }

    public String getDescriptionValue() {
        return description.getAttribute("value");
    }

    public String getStatusValue() {
        return statusSelect.getAttribute("value");
    }
}