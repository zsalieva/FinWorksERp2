package com.cybertek.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports"
        },
          tags = {"@about"},
        features = {"src/test/resources/features" //to specify where are the features
        },
        //feature contains scenarios
        //every scenario is like a test
        //where is the implementation for features
        glue = {"src/test/java/com/cybertek/step_definitions"},
        //dry run - to generate step definitions automatically
        //you will see them in the console output
        dryRun = false

)
public class CukesRunner {

}