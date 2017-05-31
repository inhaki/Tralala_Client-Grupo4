/**********************************************************************
Copyright (c) 2017 Annonymous: ¿OB, AG, IG & PV? 
 **********************************************************************/
package gui;

import controller.GestorUsuario;

public class TralalaWindow {

	public GestorUsuario uController;
	//añadir los demás controllers
	
	//Se puede crear un usuario para pasar por parámetros
	//que coincida con alguno de los ya registrados y nos devuelva "true"
	//para comprobar que el login es correcto
	private String email = "inhaki@gmail.com";
	private String contraseña = "1234";
	
	/* ¿Llamada a varios controllers?
	 * ¿es posible?
	public TralalaWindow("controller"){
	
	}*/
	
	public void login(){
		
		System.out.println(" - Login into the server: '" + email + "' - '" + contraseña + "'");
		
		boolean loginResult = uController.login(email, contraseña);
		
		System.out.println("    * Login result: " + loginResult);
	}
}
