package ru.gb.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(features = "src/test/resources/features", glue = {"src/test/java/ru.gb/cucumber/steps"})
    public class RunnerTest extends AbstractTestNGCucumberTests {

}