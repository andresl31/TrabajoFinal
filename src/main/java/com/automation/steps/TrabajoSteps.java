package com.automation.steps;

import com.automation.pages.BuscarEmpleoPage;
import com.automation.pages.OfertasPage;

import net.thucydides.core.annotations.Step;

public class TrabajoSteps {
	
	BuscarEmpleoPage empleopage;
	OfertasPage oferpage;
	
	@Step
	public void abrirurl () {
		empleopage.open();
	}
	
	@Step
	public void ingresardatos (String cargo, String ciudad) {
		empleopage.buscarempleo(cargo, ciudad);
	}
	
	@Step
	public void filtrosm () throws InterruptedException {
		oferpage.Filtros();
	}
	
	@Step
	public void listadoOfertas() {
		oferpage.listado();
	}
	
	@Step
	public void screen() {
		oferpage.fullScreenShot();
	}
	
}
