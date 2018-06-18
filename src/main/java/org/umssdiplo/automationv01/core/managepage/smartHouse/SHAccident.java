package org.umssdiplo.automationv01.core.managepage.smartHouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccident {
    @FindBy(id = "accidentLink")
    private WebElement btnAccidentMenu; //Button to access accident options

    @FindBy(id = "btnNewAccident")
    private WebElement btnNewAccident; //Button to open accident form

    @FindBy(id = "btnClose")
    private WebElement btnClose; //Button to close dialog from header

    @FindBy(id = "btnCancel")
    private WebElement btnCancel; //Button to close dialog from cancel option

    public void accesTabAccidents() {
        CommonEvents.clickButton(btnAccidentMenu);
    }

    public void openModalRegister() {
        CommonEvents.clickButton(btnNewAccident);
    }

    public void closeFromXButtonHeader() {
        CommonEvents.clickButton(btnClose);
    }

    public void closeFromCancelButton() {
        CommonEvents.clickButton(btnCancel);
    }
}
