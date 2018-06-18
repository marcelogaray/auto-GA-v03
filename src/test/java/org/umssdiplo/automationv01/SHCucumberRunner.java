package org.umssdiplo.automationv01;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/smartHouseFeatures/Mod3Case2"},
        format = {"pretty",
                "html:build/cucumber",
                "json:build/cucumber/cucumber.json",
                "junit:build/test-report.xml"}
)
public class SHCucumberRunner extends AbstractTestNGCucumberTests{
}
