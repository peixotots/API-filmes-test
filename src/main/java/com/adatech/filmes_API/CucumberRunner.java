package com.adatech.filmes_API;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports", "pretty"},
        features = "src/main/resources/features"
)

public class CucumberRunner {

}