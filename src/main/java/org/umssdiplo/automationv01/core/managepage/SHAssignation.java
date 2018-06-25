package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignation extends BasePage {

    @FindBy(name = "delete_assignment")
    private WebElement deleteElement;

    public SHAssignModalDelete clicViewModal (){
        CommonEvents.clickButton(deleteElement);
        return new SHAssignModalDelete();
    }
}