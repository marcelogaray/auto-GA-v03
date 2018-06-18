package org.umssdiplo.automationv01.core.managepage.smartHouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHOrganization extends BasePage {

    @FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/a[3]")
    private WebElement organizationTab;

    @FindBy(name = "org_1")
    private WebElement organizationDetailButton;

    @FindBy(name = "newOrganization_button")
    private WebElement addOrganizationButton;

    public void openOrganizationForm() {
        CommonEvents.clickButton(organizationTab);
        CommonEvents.clickButton(organizationDetailButton);
        CommonEvents.clickButton(addOrganizationButton);
    }

    @FindBy(name = "name")
    private WebElement nameElement;

    @FindBy(name = "description")
    private WebElement descriptionElement;

    @FindBy(name = "gestion")
    private WebElement gestionElement;

    @FindBy(name = "code")
    private WebElement codeElement;

    @FindBy(name = "start")
    private WebElement startElement;

    @FindBy(name = "end")
    private WebElement endElement;

    @FindBy(name = "hierarchicalLevelKey")
    private WebElement hierarchicalLevelKeyElement;

    @FindBy(xpath = "//*[@id=\"mat-option-2\"]")
    private WebElement HierarchicalLevelOption;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-organization-form/form/mat-dialog-content/p/mat-input-container[7]/div/div[1]")
    private WebElement HierarchicalLevelSelect;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-organization-form/form/mat-dialog-actions/button[2]")
    private WebElement CreateOrganization;

    public void setOrganizationForm() {
        String name = PropertyAccessor.getInstance().getSHDataProperty("name");
        String description = PropertyAccessor.getInstance().getSHDataProperty("description");
        String gestion = PropertyAccessor.getInstance().getSHDataProperty("gestion");
        String code = PropertyAccessor.getInstance().getSHDataProperty("code");
        String start = PropertyAccessor.getInstance().getSHDataProperty("start");
        String end = PropertyAccessor.getInstance().getSHDataProperty("end");
        String hierarchicalLevelKey = PropertyAccessor.getInstance().getSHDataProperty("hierarchicalLevelKey");

        CommonEvents.setInputField(nameElement, name);
        CommonEvents.setInputField(descriptionElement, description);
        CommonEvents.setInputField(gestionElement, gestion);
        CommonEvents.setInputField(codeElement, code);
        CommonEvents.setInputField(startElement, start);
        CommonEvents.setInputField(endElement, end);
        CommonEvents.jsClickElement(HierarchicalLevelSelect);
        CommonEvents.jsClickElement(HierarchicalLevelOption);

        CommonEvents.clickButton(CreateOrganization);
    }

}
