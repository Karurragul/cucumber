package Stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/2dMap.feature",glue="Stepdefinition",plugin="html:target")
public class testRunner {

}
