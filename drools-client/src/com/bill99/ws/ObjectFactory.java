package com.bill99.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.bill99.ws package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _GetDroolsScriptResponse_QNAME = new QName(
			"http://ws.bill99.com/", "getDroolsScriptResponse");
	private final static QName _GetDroolsScript_QNAME = new QName(
			"http://ws.bill99.com/", "getDroolsScript");
	private final static QName _GetDroolsScriptResponseReturn_QNAME = new QName(
			"", "return");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.bill99.ws
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link GetDroolsScript }
	 * 
	 */
	public GetDroolsScript createGetDroolsScript() {
		return new GetDroolsScript();
	}

	/**
	 * Create an instance of {@link GetDroolsScriptResponse }
	 * 
	 */
	public GetDroolsScriptResponse createGetDroolsScriptResponse() {
		return new GetDroolsScriptResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDroolsScriptResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.bill99.com/", name = "getDroolsScriptResponse")
	public JAXBElement<GetDroolsScriptResponse> createGetDroolsScriptResponse(
			GetDroolsScriptResponse value) {
		return new JAXBElement<GetDroolsScriptResponse>(
				_GetDroolsScriptResponse_QNAME, GetDroolsScriptResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetDroolsScript }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.bill99.com/", name = "getDroolsScript")
	public JAXBElement<GetDroolsScript> createGetDroolsScript(
			GetDroolsScript value) {
		return new JAXBElement<GetDroolsScript>(_GetDroolsScript_QNAME,
				GetDroolsScript.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetDroolsScriptResponse.class)
	public JAXBElement<byte[]> createGetDroolsScriptResponseReturn(byte[] value) {
		return new JAXBElement<byte[]>(_GetDroolsScriptResponseReturn_QNAME,
				byte[].class, GetDroolsScriptResponse.class, ((byte[]) value));
	}

}
