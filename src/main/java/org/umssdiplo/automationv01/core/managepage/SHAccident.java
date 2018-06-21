package org.umssdiplo.automationv01.core.managepage;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccident extends BasePage {
    @FindBy(id = "RegistrarAccidente")
    private WebElement registrarAccBtn;
    @FindBy(xpath = "/html/body/app-root/app-accident/div/div/div[2]/div/mat-list/mat-list-item[2]/div/div[2]/h3")
    private WebElement nuevoRegistro;


    /**
     * wait until  "Accidentes" button from tabnav is clicleable
     * then make a click on the button
     * returns From modal "Registro accidente"
     */
    public SHAccidentFomModal ClickRegistarAccBtn() {
        if (CommonEvents.isClickable(registrarAccBtn)) {
            CommonEvents.clickButton(registrarAccBtn);
        }
        return new SHAccidentFomModal();
    }

    /**
     * check  if an accident  is present on the list of accidents
 * */
    public boolean isAccientePresent() {
        try {
            if (nuevoRegistro.isDisplayed()) {
                return CommonEvents.isPresent(nuevoRegistro);
            }
        } catch (ExceptionHasMessage e) {

        }
        return false;
    }


}
