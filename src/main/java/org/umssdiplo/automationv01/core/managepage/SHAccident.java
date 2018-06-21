package org.umssdiplo.automationv01.core.managepage;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccident extends BasePage {
    @FindBy(id = "RegistrarAccidente")
    private WebElement registrarAccBtn;
    @FindBy(xpath = "mat-dialog-4")
    private WebElement nuevoRegistro;

    public SHAccidentFormModal clickRegistarAccBtn() {
        if (CommonEvents.isClickable(registrarAccBtn)) {
            CommonEvents.clickButton(registrarAccBtn);
        }
        return new SHAccidentFormModal();
    }

    public boolean isAccientePresent() {
        try {
            return nuevoRegistro.isDisplayed() ? CommonEvents.isPresent(nuevoRegistro) : false;
        } catch (ExceptionHasMessage e) {
            return false;
        }
    }
}
