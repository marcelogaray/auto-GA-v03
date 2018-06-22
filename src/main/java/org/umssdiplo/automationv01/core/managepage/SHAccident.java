package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccident extends BasePage {

    @FindBy(id = "RegistrarAccidente")
    private WebElement registrarAccBtn;

    public SHAccidentFormModal clickRegistarAccBtn() {
        CommonEvents.waitUntil(2000);
        if (CommonEvents.isClickable(registrarAccBtn)) {
            CommonEvents.clickButton(registrarAccBtn);
        }
        return new SHAccidentFormModal();
    }

    public boolean isAccientePresent() {
        try {
            return nuevoRegistro.isDisplayed() ? CommonEvents.isPresent(nuevoRegistro) : false;
        } catch (NoSuchElementException nse) {
            return false;
        } catch (ExceptionHasMessage e) {
            return false;
        }
    }
}
