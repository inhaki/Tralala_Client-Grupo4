/**********************************************************************
Copyright (c) 2017 Annonymous: �OB, AG, IG & PV? 
 **********************************************************************/
package serviceLocator;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import remoteFa�ade.IRemoteFa�ade;



public class ServiceLocator {
	
	private IRemoteFa�ade service;
	
	//establecer Servicio, con una direcci�n ip, puerto y nombre del servidor v�lidos
	//tienen relaci�n con el WorkBench me parece!!!
	public void setService(String ip, String port, String serverName) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		
		try {		
			String URL = "//" + ip + ":" + port + "/" + serverName;
			this.service = (IRemoteFa�ade) Naming.lookup(URL);
		} catch (Exception ex) {
			System.err.println("# Error locating remote fa�ade: " + ex);
		}		
	}

	public IRemoteFa�ade getService() {
		return this.service;
	}
}
