package com.automation.pages;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class OfertasPage extends PageObject{
	WebDriver driver = getDriver();
	
	@FindBy(id="salary3")
	WebElementFacade checsalary;
	
	@FindBy(xpath = "/html/body/div[8]/div[4]/div[2]/div[1]/div/div[3]/div/div[2]/label")
	WebElementFacade checpubli;
	
	@FindBy(xpath="//*[@id=\"WorkAreaFilter1\"]")
	WebElementFacade selarea;
	
	@FindBy(xpath = "//*[@class=\"text-ellipsis\"]")
	List <WebElementFacade> listOfer;
	
	@FindBy(xpath = "//*[@class=\"info-company-name\"]")
	List <WebElementFacade> listempre;
	
	public void Filtros () throws InterruptedException  {
		checsalary.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		checpubli.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		
		Select area = new Select(selarea);
		area.selectByValue("2");
		
		Thread.sleep(2000);
		
	}
	
	public void listado (){
		
		//FileWriter fw = new FileWriter("ofertasyempresas.txt");
		File data = new File("data.txt");
		FileWriter fw;
		int cantidadlist = listOfer.size();
		try {
			fw = new FileWriter(data);
			BufferedWriter br = new BufferedWriter(fw);
			PrintWriter pr = new PrintWriter(br);
					
					for (int i = 0; i < cantidadlist; i++) {
						pr.write(listOfer.get(i).getText()+"||"+listempre.get(i).getText()+"\n");
						//System.out.println(listOfer.get(i).getText()+"||"+listempre.get(i).getText());
					}
			
			pr.close();
			br.close();
		} catch (Exception e) {
			
		}
		
	}
	
	public void fullScreenShot () {
		try {                 
			//Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(getDriver());
			File screenshotfile = new File ("target/captura.png");
			BufferedImage image = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(getDriver()).getImage();
			ImageIO.write(image, "PNG",screenshotfile);
		//ImageIO.write(screenshot.getImage(),"PNG",new File("target/captura.png"));             
			} catch (IOException e) {                 // TODO Auto-generated catch block                 
			  e.printStackTrace();         
			  }                                           
			}               
	}
	

