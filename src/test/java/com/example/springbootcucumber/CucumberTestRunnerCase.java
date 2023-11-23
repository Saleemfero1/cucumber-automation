package com.example.springbootcucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@SuppressWarnings("NewClassNamingConvention")
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"pretty", "json:target/cucumber-report.json", "html:test-output/html-report/cucumber-report.html"},
        monochrome = true,
        glue = {"com.example.springbootcucumber.cucumberglue"})
public class CucumberTestRunnerCase {
}
