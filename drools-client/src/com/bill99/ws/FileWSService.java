package com.bill99.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * FileWSService service = new FileWSService();
 * FileWSDelegate portType = service.getFileWSPort();
 * portType.getDroolsScript(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "FileWSService", targetNamespace = "http://ws.bill99.com/", wsdlLocation = "http://localhost:8080/drools-ws/FileWSPort?wsdl")
public class FileWSService extends Service {

	private final static URL FILEWSSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.bill99.ws.FileWSService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.bill99.ws.FileWSService.class.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:8080/drools-ws/FileWSPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/drools-ws/FileWSPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		FILEWSSERVICE_WSDL_LOCATION = url;
	}

	public FileWSService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public FileWSService() {
		super(FILEWSSERVICE_WSDL_LOCATION, new QName("http://ws.bill99.com/",
				"FileWSService"));
	}

	/**
	 * 
	 * @return returns FileWSDelegate
	 */
	@WebEndpoint(name = "FileWSPort")
	public FileWSDelegate getFileWSPort() {
		return super.getPort(new QName("http://ws.bill99.com/", "FileWSPort"),
				FileWSDelegate.class);
	}

}