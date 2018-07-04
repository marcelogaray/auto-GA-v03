package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHEquiposSegurModalView extends BasePage {

    @FindBy(id = "mat-dialog-0")
    private WebElement tipoEqipoModal;

    @FindBy(name = "closeX")
    private WebElement closeX;

    @FindBy(id = "cerrartipo")
    private WebElement close;

    @FindBy(id = "nameTipo")
    private WebElement nametipo;

    @FindBy(className = "mat-list-text")
    private WebElement equipmentName;

    public boolean isModalDialogPresent() {return tipoEqipoModal.isDisplayed();}

    public void clickclose() {
        CommonEvents.clickButton(close);
    }

    public String getTipoEquipo() {
        return nametipo.getText();
    }

    public void isButtonCloseVisible() {
        CommonEvents.waitWebElementIsVisible(close);
    }

    public void closeModalView() {
        isButtonCloseVisible();
        CommonEvents.clickButton(close);
    }
}






