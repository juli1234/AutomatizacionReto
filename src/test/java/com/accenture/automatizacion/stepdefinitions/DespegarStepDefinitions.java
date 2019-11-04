/**
 * 
 */
package com.accenture.automatizacion.stepdefinitions;

import org.apache.tools.ant.taskdefs.Sleep;
import org.hamcrest.core.Is;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.accenture.automatizacion.tasks.GoTo;
import com.accenture.automatizacion.tasks.OpenBrowser;
import com.accenture.automatizacion.tasks.SendKey;
import com.accenture.automatizacion.userinterfaces.DespegarPage;
import com.google.inject.Inject;
import com.accenture.automatizacion.questions.*;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.statematchers.IsEnabledMatcher;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.thucydides.core.annotations.Managed;

/**
 * @author Juliana
 *
 */
public class DespegarStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver driver;
	private DespegarPage despegarpage;
	private Actor juliana = Actor.named("juliana");

	@Before
	public void setUp() {

		juliana.can(BrowseTheWeb.with(driver));

	}

	@Given("^I need to go to the page despagar\\.com$")
	public void iNeedToGoToThePageDespagarCom() throws Exception {
		juliana.wasAbleTo(OpenBrowser.on(despegarpage));
	}

	@When("^I send the information for make the reservation, \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void iSendTheInformationForMakeTheReservation(String id, String nombre, String apellido, String nombrec, String email, String numero, String direccion, String codarea, String ciudadorigen, String ciudaddestino) throws Exception {

	
	juliana.attemptsTo(SendKey.called(ciudadorigen,ciudaddestino,nombre,apellido,id,direccion,email,codarea,numero));
		
		
				}

	
	@Then("^I validate if the information send to the form, \"([^\"]*)\", \"([^\"]*)\"$")
	public void iValidateIfTheInformationSendToTheForm(String nombre, String apellido) throws Exception {
	  
	juliana.should(seeThat(ValidateNameAndLastName.at(nombre, apellido)));
	}
}