/**
 * 
 */
package com.accenture.automatizacion.questions;

import com.accenture.automatizacion.userinterfaces.DespegarPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * @author 1020491006
 *
 */
public class ValidateNameAndLastName implements Question<Boolean> {

	private DespegarPage despegar;
	private static String nombre;
	private static String apellido;
	
	

	public ValidateNameAndLastName(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido=apellido;
	}

	@Override
	public Boolean answeredBy(Actor actor) {

		String name = Text.of(despegar.VAL_NAME).viewedBy(actor).asString();
		System.out.println(name);
		String apellido = Text.of(despegar.VAL_LAST_NAME).viewedBy(actor).asString();
		System.out.println(apellido);
		
	
		
		  if(name.equalsIgnoreCase(name)&&apellido.equalsIgnoreCase(apellido))
		 {
		  
		 
		 System.out.print("La informacion del pasajero coincide");
		
		return true; 
		} 
		  System.out.print("La informacion no coincide");
		  return false;
		 
		
		
	}

	public static ValidateNameAndLastName at(String nombre, String apellido) {
		return new ValidateNameAndLastName(nombre,apellido);
	}
}
