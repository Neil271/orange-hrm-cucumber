package com.orangehrmlive.demo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/orangehrmlive/demo/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html", //default cucumber plug in
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",  // extent report plug in
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@sanity"
)

public class RunCukeSanityTest extends AbstractTestNGCucumberTests {

}
