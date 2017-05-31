/**********************************************************************
Copyright (c) 2017 Annonymous: ¿OB, AG, IG & PV? 
 **********************************************************************/
package main;

import controller.GestorUsuario;
import serviceLocator.ServiceLocator;
import gui.TralalaWindow;

public class MainTralalaCliente {
	
	public static void main(String[] args) {
		
		ServiceLocator serviceLocator = new ServiceLocator();
		serviceLocator.setService(args[0], args[1], args[2]);
		
		GestorUsuario loginController = new GestorUsuario(serviceLocator);
		//tenemos solo una ventana de interfaz para usuario
		//y tres controllers... la llamada tendrá que ser a un controller de canciones
		//se llama al SongController cuando lo creemos para que este muestre las canciones, álbumes y artistas al usuario
		TralalaWindow tralala= new TralalaWindow(/*songController*/);
		//tralala.getCanciones();
		//tralala.getArtistas();
		//... todas las llamadas para mostrar información en la interfaz de usuario inicial
	}
}
