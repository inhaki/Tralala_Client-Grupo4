/**********************************************************************
Copyright (c) 2017 Annonymous: ¿OB, AG, IG & PV? 
 **********************************************************************/
package controller;

import java.rmi.RemoteException;

import serviceLocator.ServiceLocator;

public class GestorUsuario {
	
	//se crea un objeto de tipo serviceLocator
	//ya que, el Controller tiene relación directa con él
	public ServiceLocator serviceLocator;
	
	public GestorUsuario(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	public boolean login(String email, String contraseña) {
		try {
			return this.serviceLocator.getService().login(email, contraseña);
		} catch (RemoteException e) {
			System.err.println("# Error during login: " + e);
			return false;
		}
	}
}
