package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShAccidentVieWmodal extends BasePage {

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
}
