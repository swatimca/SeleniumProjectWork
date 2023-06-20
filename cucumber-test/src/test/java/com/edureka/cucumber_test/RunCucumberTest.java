package com.edureka.cucumber_test;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
/*
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/edureka/cucumber_test")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")*/


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "D:\\SeleniumProj\\cucumber-test\\src\\test\\java\\com\\edureka\\cucumber_test\\Stepdefinition.java")

public class RunCucumberTest {
}