package com.tutorialsninja.liveproject.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:FeatureFiles/Search.feature"},
glue ={"classpath:com.tutorialsninja.liveproject.stepdef"},
        plugin = {
                "pretty",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html"},
tags= "@Search and @Two")
public class TestRunner {

}
