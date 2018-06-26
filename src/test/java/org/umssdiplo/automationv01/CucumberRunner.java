package org.umssdiplo.automationv01;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;

@CucumberOptions(
        features = {"src/test/resources/smarthHouseFeatures/AccidenteCase9.feature"},
        format = {"pretty",
                "html:build/cucumber",
                "json:build/cucumber/cucumber.json",
                "junit:build/test-report.xml"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests{
    @AfterTest
    public void closeWebDriver() {
        ManageDriver.getInstance().getWebDriver().quit();
    }
}