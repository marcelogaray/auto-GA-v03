package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SHViewAccident extends BasePage {

    @FindBy(id = "employee")
    private WebElement employee;

    @FindBy(id = "title")
    private WebElement title;

    @FindBy(id = "code")
    private WebElement code;

    @FindBy(id = "levelRisk")
    private WebElement levelRisk;

    @FindBy(id = "accidentType")
    private WebElement accidentType;

    @FindBy(id = "dateEvent")
    private WebElement dateEvent;

    @FindBy(id = "description")
    private WebElement description;

    @FindBy(id = "status")
    private WebElement status;

    public String getEmployeeValue() {
        return employee.getText();
    }

    public String getTitleValue() {
        return title.getText();
    }

    public String getCodeValue() {
        return code.getText();
    }

    public String getLevelRiskValue() {
        return levelRisk.getText();
    }

    public String getAccidentType() {
        return accidentType.getText();
    }

    public String getDateEvent() {
        return dateEvent.getText();
    }

    public String getDescription() {
        return description.getText();
    }

    public String getStatus() {
        return status.getText();
    }

}
