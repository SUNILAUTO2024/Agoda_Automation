package com.agoda.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/",
        glue = "com.agoda",
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber.json"},
        tags = "",
        monochrome = false

)


        public class TestRunner {

}
