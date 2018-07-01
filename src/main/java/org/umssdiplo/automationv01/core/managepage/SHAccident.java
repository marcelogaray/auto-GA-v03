package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class SHAccident extends BasePage {

    @FindBy(xpath = "//a[@id='RegistrarAccidente']")
    private WebElement registrarAccBtn;

    @FindBy(className = "mat-list-text")
    private WebElement listElemet;

    @FindBy(className = "mat-list-item-content")
    private WebElement listElementContent;

    public SHAccident() {
        CommonEvents.isClickable(registrarAccBtn);
    }

    public SHAccidentFormModal ClickRegistarAccBtn() {
        CommonEvents.jsClickElement(registrarAccBtn);
        return new SHAccidentFormModal();
    }

    public boolean verifyListelement(String accCode) {
        List<WebElement> elements = CommonEvents.findElementsClassName(listElemet);
        return CommonEvents.findWebElement(elements, accCode).getText().equals(accCode);
    }

    /***
     * click on first coincidence view
     */
    public SHAccidentVieWmodal clickViewModal(String accCode) {
        List<WebElement> elements = CommonEvents.findElementsClassName(listElementContent);
        int i = 1;
        for (WebElement ele : elements) {
            if (ele.getText().equals(accCode)) {
                CommonEvents.jsClickElement(ele.findElement(By.xpath("//mat-list-item[" + i + "]/div/a[1]")));
            }
            i = i + 1;
        }
        return new SHAccidentVieWmodal();
    }
}