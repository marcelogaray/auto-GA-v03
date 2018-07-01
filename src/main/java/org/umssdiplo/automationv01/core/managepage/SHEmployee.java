package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHEmployee extends BasePage {
    @FindBy(name = "new_employee_button")
    private WebElement addEmployeeButton;

    public SHEmployee() {
        CommonEvents.waitWebElementIsVisible(addEmployeeButton);
    }

    public SHNewEmployeeForm clickNewEmployeeButton() {
        CommonEvents.clickButton(addEmployeeButton);
        return new SHNewEmployeeForm();
    }
}