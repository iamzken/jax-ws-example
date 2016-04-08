package com.bill99.ws;


@javax.jws.WebService(targetNamespace = "http://ws.bill99.com/", serviceName = "FileWSService", portName = "FileWSPort", wsdlLocation = "WEB-INF/wsdl/FileWSService.wsdl")
public class FileWSDelegate {

	FileWS fileWS = new FileWS();

	public byte[] getDroolsScript(String userName, String password) {
		return fileWS.getDroolsScript(userName, password);
	}

}