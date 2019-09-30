package com.automation.stepdefinitions;

import com.automation.steps.TrabajoSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ElempleoStepdefinitions {
	
	@Steps
	TrabajoSteps trabstep;
	
	
	@Dado("^que estoy en la pagina del empleo\\.com$")
	public void queEstoyEnLaPaginaDelEmpleoCom() {
	    trabstep.abrirurl();
	}

	@Cuando("^ingreso los datos de (.*) y (.*) del formulario de consulta de empleo$")
	public void ingresoLosDatosDeContYBogotaDelFormularioDeConsultaDeEmpleo(String cargo, String ciudad)  {
	    trabstep.ingresardatos(cargo, ciudad);
	    
	}

	@Entonces("^puedo visulizar las ofertas disponibles$")
	public void puedoVisulizarLasOfertasDisponibles() throws InterruptedException {
		trabstep.filtrosm();
		trabstep.listadoOfertas();
		trabstep.screen();
	}


}
