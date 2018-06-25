package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class SHAccident extends BasePage {

    @FindBy(id = "RegistrarAccidente")
    private WebElement registrarAccBtn;

    @FindBy(className = "mat-list-text")
    private WebElement listElemet;

    public SHAccident() {
        CommonEvents.isClickable(registrarAccBtn);
    }

    public SHAccidentFormModal ClickRegistarAccBtn() {
        CommonEvents.clickButton(registrarAccBtn);
        return new SHAccidentFormModal();
    }

    public boolean verifyListelement(String accCode) {
        List<WebElement> elements = CommonEvents.findElementsClassName(listElemet);
        return CommonEvents.findWebElement(elements, accCode).getText().equals(accCode) ? true : false;
    }
}