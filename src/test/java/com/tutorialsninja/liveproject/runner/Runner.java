package com.tutorialsninja.liveproject.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:FeatureFiles/Register.feature"},
glue ={"classpath:com.tutorialsninja.liveproject.stepdef"},
        plugin = {
                "pretty",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html"},
tags= "@Register and @Four")
public class Runner {

}
