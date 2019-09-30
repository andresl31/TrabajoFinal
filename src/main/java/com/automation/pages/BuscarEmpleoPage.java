package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.elempleo.com/co/")
public class BuscarEmpleoPage extends PageObject{
	
	@FindBy(xpath ="//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]")
	WebElementFacade botcookie;
	
	@FindBy(xpath= "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/div/div[1]/div/span[1]/input[2]")
	WebElementFacade txtcargo;
	
	@FindBy(xpath= "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/div/div[1]/div/span[1]/div/div/div[1]")
	WebElementFacade selcargo;
	
	@FindBy(xpath="/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/div/div[2]/div/span[1]/input[2]")
	WebElementFacade txtciudad;
	
	@FindBy(xpath="/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/div/div[3]/span/button")
	WebElementFacade botbuscar;
	
	public void buscarempleo (String cargo, String ciudad) {
		
		botcookie.click();
		txtcargo.sendKeys(cargo);
		selcargo.click();
		txtciudad.sendKeys(ciudad);
		botbuscar.click();
	}
	
}
