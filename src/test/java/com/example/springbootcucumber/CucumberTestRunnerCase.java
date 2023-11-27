package com.example.springbootcucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@SuppressWarnings("NewClassNamingConvention")
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {
                "pretty",
                "json:test-output/cucumberReport.json",
                "html:test-output/cucumberReport.html"
        },
        monochrome = true,
        glue = {"com.example.springbootcucumber.cucumberglue"})
public class CucumberTestRunnerCase {
}
