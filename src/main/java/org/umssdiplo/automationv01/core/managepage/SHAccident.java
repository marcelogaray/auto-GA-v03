package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccident extends BasePage {
    @FindBy(id = "accidentLink")
    private WebElement btnAccidentMenu; //Button to access accident options

    @FindBy(id = "RegistrarAccidente")
    private WebElement btnRegistrarAccidente; //Button to open accident form

    @FindBy(id = "btnClose")
    private WebElement btnClose; //Button to close dialog from header

    @FindBy(id = "btnCancel")
    private WebElement btnCancel; //Button to close dialog from cancel option

    public void accesTabAccidents() {
        CommonEvents.isPresent(btnAccidentMenu);
        CommonEvents.clickButton(btnAccidentMenu);
    }

    public void openModalRegister() {
        CommonEvents.waitUntil(2000);
        if(btnRegistrarAccidente.isEnabled()) {
            if(CommonEvents.isClickable(btnRegistrarAccidente)) {
                CommonEvents.clickButton(btnRegistrarAccidente);
            }
        }
    }

    public void closeFromXButtonHeader() {
        WebElement waitElement = (new WebDriverWait(webDriver, 20))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("btnClose")));
        CommonEvents.clickButton(btnClose);
    }

    public void closeFromCancelButton() {
        WebElement waitElement = (new WebDriverWait(webDriver, 20))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("btnCancel")));
        CommonEvents.clickButton(btnCancel);
    }
}
