/**********************************************************************
Copyright (c) 2017 Annonymous: ¿OB, AG, IG & PV? 
 **********************************************************************/
package serviceLocator;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import remoteFaçade.IRemoteFaçade;



public class ServiceLocator {
	
	private IRemoteFaçade service;
	
	//establecer Servicio, con una dirección ip, puerto y nombre del servidor válidos
	//tienen relación con el WorkBench me parece!!!
	public void setService(String ip, String port, String serverName) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		
		try {		
			String URL = "//" + ip + ":" + port + "/" + serverName;
			this.service = (IRemoteFaçade) Naming.lookup(URL);
		} catch (Exception ex) {
			System.err.println("# Error locating remote façade: " + ex);
		}		
	}

	public IRemoteFaçade getService() {
		return this.service;
	}
}
