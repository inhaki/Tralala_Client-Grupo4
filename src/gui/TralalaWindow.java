/**********************************************************************
Copyright (c) 2017 Annonymous: ¿OB, AG, IG & PV? 
 **********************************************************************/
package gui;

import controller.UsuarioController;

public class TralalaWindow {

	public UsuarioController uController;
	//añadir los demás controllers
	
	//Se puede crear un usuario para pasar por parámetros
	//que coincida con alguno de los ya registrados y nos devuelva "true"
	//para comprobar que el login es correcto
	private String email = "sample@gmail.com";
	private String contraseña = "12345";
	
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
