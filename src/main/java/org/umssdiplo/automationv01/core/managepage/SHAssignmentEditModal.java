package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHAssignmentEditModal extends BasePage{


        @FindBy(name = "save")
        private WebElement acceptNewAssignment;

        @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
        private WebElement Ok;

        @FindBy(name = "employee")
        private WebElement employeeKeyElement;

        @FindBy(name = "equipment")
        private WebElement equipmentKeyElement;

        @FindBy(name = "observations")
        private WebElement observationsElement;

        @FindBy(id = "mat-dialog-0")
        private WebElement employeeOption;

        @FindBy(id= "mat-option-13")
        private WebElement employeeSelect;

        @FindBy(id = "mat-dialog-0")
        private WebElement equipmentOption;

        @FindBy(id = "mat-option-100")
        private WebElement equipmentSelect;


        public void setData() {
            String observations = PropertyAccessor.getInstance().getSHDataProperty("observations");
            CommonEvents.jsClickElement(employeeKeyElement);
            CommonEvents.jsClickElement(employeeSelect);
            CommonEvents.jsClickElement(equipmentKeyElement);
            CommonEvents.jsClickElement(equipmentSelect);
            CommonEvents.setInputField(observationsElement, observations);
        }
        public void registerNewAssignment(){

            CommonEvents.jsClickElement(acceptNewAssignment);
        }
        public void registeredAssignment(){

            CommonEvents.jsClickElement(Ok);
        }
    }
}
