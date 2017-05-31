/**********************************************************************
Copyright (c) 2017 Annonymous: �OB, AG, IG & PV? 
 **********************************************************************/
package controller;

import java.rmi.RemoteException;

import serviceLocator.ServiceLocator;

public class GestorUsuario {
	
	//se crea un objeto de tipo serviceLocator
	//ya que, el Controller tiene relaci�n directa con �l
	public ServiceLocator serviceLocator;
	
	public GestorUsuario(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	public boolean login(String email, String contrase�a) {
		try {
			return this.serviceLocator.getService().login(email, contrase�a);
		} catch (RemoteException e) {
			System.err.println("# Error during login: " + e);
			return false;
		}
	}
}
