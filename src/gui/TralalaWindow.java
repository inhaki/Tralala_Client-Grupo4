/**********************************************************************
Copyright (c) 2017 Annonymous: �OB, AG, IG & PV? 
 **********************************************************************/
package gui;

import controller.GestorUsuario;

public class TralalaWindow {

	public GestorUsuario uController;
	//a�adir los dem�s controllers
	
	//Se puede crear un usuario para pasar por par�metros
	//que coincida con alguno de los ya registrados y nos devuelva "true"
	//para comprobar que el login es correcto
	private String email = "inhaki@gmail.com";
	private String contrase�a = "1234";
	
	/* �Llamada a varios controllers?
	 * �es posible?
	public TralalaWindow("controller"){
	
	}*/
	
	public void login(){
		
		System.out.println(" - Login into the server: '" + email + "' - '" + contrase�a + "'");
		
		boolean loginResult = uController.login(email, contrase�a);
		
		System.out.println("    * Login result: " + loginResult);
	}
}
