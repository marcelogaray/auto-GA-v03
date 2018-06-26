package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class SHAccident extends BasePage {

    @FindBy(id = "RegistrarAccidente")
    private WebElement registrarAccBtn;

    @FindBy(className = "mat-list-text")
    private WebElement listElemet;

    @FindBy(className = "mat-list-item-content")
    private WebElement listElementContent;

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

    public void verifyListelementContent() {
        List<WebElement> elements = CommonEvents.findElementsClassName(listElementContent);
        System.out.println("Nro Elementos: " + elements.size());
        int i = 1;
        for (WebElement ele : elements) {
            System.out.println(i);
            if (ele.getText().equals("Codigo")) {
                // CommonEvents.jsClickElement(ele.findElement(By.xpath("//mat-list-item["+i+"]/div/a[1]")));
                CommonEvents.jsClickElement(ele.findElement(By.xpath("//mat-list-item[" + i + "]/div/a[1]")));
                System.out.println(ele.getText() + " " + i);
            }
            i = i + 1;
        }
    }
}