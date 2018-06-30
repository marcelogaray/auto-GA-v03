package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignModalEdit extends BasePage {

    @FindBy(id = "mat-dialog-1" )
    private WebElement modalEdit;

    public boolean isModalEditDisplayed(){
        CommonEvents.isPresent(modalEdit);
    }










}