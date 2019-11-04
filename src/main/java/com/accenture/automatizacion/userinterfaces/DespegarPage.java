/**
 * 
 */
package com.accenture.automatizacion.userinterfaces;



import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * @author Juliana
 *
 */
@DefaultUrl("https://www.despegar.com.co/vuelos/	")
public class DespegarPage extends PageObject {
	

	
	public static final Target IMPUT_ORIGEN = Target.the("origen").located(By.xpath("//*[@placeholder=\"Ingresa desde dónde viajas\" or class=\"input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-origin-input sbox-primary sbox-places-first places-inline\" ]"));
	public static final Target OPTION_DATE1 = Target.the("opcion").located(By.xpath("/html/body/div[4]/div/div[5]/div[2]/div[4]/span[1]"));
	public static final Target IMPUT_DESTINO = Target.the("destino").located(By.xpath("//*[@placeholder=\"Ingresa hacia dónde viajas\" or  class=\"input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline\"]"));
	public static final Target VUELOS = Target.the("vuelos").located(By.xpath("//*[@class=\"button-circle-label\"]"));
	public static final Target DATE1 = Target.the("date1").located(By.xpath("//*[@class=\"input-container sbox-bind-event-click-start-date\"]"));
	public static final Target OPTION_DATE2 = Target.the("date2").located(By.xpath("/html/body/div[4]/div/div[5]/div[2]/div[4]/span[8]"));
	public static final Target BUTTON_BUSCAR = Target.the("buscar").located(By.xpath("//*[@class=\"sbox-button -ml3-l -mt5-l\"]"));
	public static final Target BUTTON_SELECCIONAR = Target.the("seleccionar").located(By.xpath("//*[@class=\"-md eva-3-btn -primary\" or href=\"javascript:;\" ]"));
	
	
	public static final Target POPAP = Target.the("popap").locatedBy("//*[@class=\"dreck-modal-keep\"]");
	public static final Target BUTTON_EQUIPAJE= Target.the("equipaje").locatedBy("//*[@class=\"eva-3-btn -lg -primary btn-yes\" ]");
	public static final Target RADIO_PSE = Target.the("pse").locatedBy("//*[@for=\"payment-method-2\"]");
	public static final Target RADIO_PSE2= Target.the("pse2").locatedBy("//*[@for=\"payment-method-5\"]");
	public static final Target PSE_VALIDATE =Target.the("validate").locatedBy("//*[@id=\"checkout-content\"]/div[1]/payment-component/payment-method-selector/div/ul/li[3]/p/label/span[2]");
	public static final Target DROP_BANCO = Target.the("banco").located(By.id("card-selector-0"));
	
	public static final Target IMPUT_NAME = Target.the("name").locatedBy("//*[@name=\"formData.paymentData.cashPayments[0].invoice.firstName\" ]");
	public static final Target IMPUT_LAST_NAME = Target.the("lastname").locatedBy("//*[@id=\"invoice-last-name-0\" ]");
	public static final Target IMPUT_CEDULA = Target.the("cedula").locatedBy("//*[@id=\"invoice-fiscal-identification-number-0\" ]");
	public static final Target IMPUT_DEPART = Target.the("departamento").locatedBy("//*[@id=\"invoice-fiscal-address-state-0\"]");
	public static final Target IMPUT_CIUDAD = Target.the("ciudad").locatedBy("//*[@id=\"invoice-fiscal-address-city-CASH_TRANSFER_BOG-0\"]");
	public static final Target IMPUT_DIRECCION = Target.the("direccion").locatedBy("//*[@class=\"input-tag invoice-fiscal-address-street ng-untouched ng-pristine ng-invalid\"]");
	
	public static final Target IMPUT_NAME2= Target.the("name2").locatedBy("//*[@class=\"input-tag traveler-first-name ng-untouched ng-pristine ng-invalid\"]");
	public static final Target PAIS_RESIDENT= Target.the("pais").locatedBy("//*[@name=\"formData.travelers[0].nationality\"]");
	public static final Target IMPUT_LAST_NAME2= Target.the("apellido2").locatedBy("//*[@class=\"input-tag traveler-last-name ng-untouched ng-pristine ng-invalid\"]");
	public static final Target IMPUT_CEDULA2=Target.the("cedula2").locatedBy("//*[@name=\"formData.travelers[0].identifications[0].number\"]");
	public static final Target IMPUT_EMAIL=Target.the("email").locatedBy("//*[@class=\"input-tag contact-email ng-untouched ng-pristine ng-invalid\"]");
	public static final Target IMPUT_CONFIRM_EMAIL=Target.the("email2").locatedBy("//*[@placeholder=\"Ingresa tu email\"]");
	public static final Target IMPUT_COD_AREA=Target.the("codigoArea").locatedBy("//*[@placeholder=\"Ingresa un código de área\"]");
	public static final Target INPUT_NUM=Target.the("numero").locatedBy("//*[@class=\"input-tag phone-number-code ng-untouched ng-pristine ng-invalid\"]");
	
	public static final Target VAL_NAME=Target.the("validacion1").locatedBy("//*[@class=\"eva-3-body-2 value\"]");
	public static final Target VAL_LAST_NAME=Target.the("validacion2").locatedBy("//*[@id=\"checkout-content\"]/div[1]/buy-component/div/flight-data-revision/div/ul/li/div/div[2]/span");
	
	
}





