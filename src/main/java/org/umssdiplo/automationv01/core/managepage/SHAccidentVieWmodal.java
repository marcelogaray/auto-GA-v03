package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccidentVieWmodal extends BasePage {

    @FindBy(id = "mat-dialog-0")
    private WebElement viewModal;
    @FindBy(id = "employee")
    private WebElement employee;
    @FindBy(id = "title")
    private WebElement title;
    @FindBy(id = "code")
    private WebElement code;
    @FindBy(id = "levelRisk")
    private WebElement levelRisk;
    @FindBy(id = "accidentType")
    private WebElement acidentType;
    @FindBy(id = "dateEvent")
    private WebElement dateEvent;
    @FindBy(id = "description")
    private WebElement description;
    @FindBy(id = "status")
    private WebElement status;
    @FindBy(id = "close")
    private WebElement closeBtn;
    @FindBy(id = "cerrar")
    private WebElement cerrarBtn;

    public String getEmployee() {
        return CommonEvents.getTextContent(employee);
    }

    public String getTitle() {
        return CommonEvents.getTextContent(title);
    }

    public String getCode() {
        return CommonEvents.getTextContent(code);
    }

    public String getLevelRisk() {
        return CommonEvents.getTextContent(levelRisk);
    }

    public String getAcidentType() {
        return CommonEvents.getTextContent(acidentType);
    }

    public String getDateEvent() {
        return CommonEvents.getTextContent(dateEvent);
    }

    public String getDescription() {
        return CommonEvents.getTextContent(description);
    }

    public String getStatus() {
        return CommonEvents.getTextContent(status);
    }
}
