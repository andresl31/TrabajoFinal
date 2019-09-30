package com.automation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) // con que se va a correr 
@CucumberOptions(features = "src/test/resources/features/BuscarEmpleo.feature", glue = "com.automation.stepdefinitions",snippets = SnippetType.CAMELCASE) // configuracion no se modifica

public class ElempleoRunner {

}
 