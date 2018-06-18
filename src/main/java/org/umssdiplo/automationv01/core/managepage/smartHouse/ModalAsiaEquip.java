package org.umssdiplo.automationv01.core.managepage.smartHouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ModalAsiaEquip extends BasePage {

    @FindBy(name = "Assignation_equips")
    private WebElement AsignacionEquipos;

    public void setCredenciales() {
        CommonEvents.clickButton(AsignacionEquipos);
    }

}
