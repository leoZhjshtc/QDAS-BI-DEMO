/**
 * IQdas_Web_ServiceserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.qdas.core.V11Webservice;

public class IQdas_Web_ServiceserviceLocator extends org.apache.axis.client.Service implements IQdas_Web_Serviceservice {
	private String IQdas_Web_ServicePort_address;
    public IQdas_Web_ServiceserviceLocator() {
    }
    public IQdas_Web_ServiceserviceLocator(String url) {
    	this.IQdas_Web_ServicePort_address=url;
    }

    public IQdas_Web_ServiceserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IQdas_Web_ServiceserviceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IQdas_Web_ServicePort
//   private java.lang.String IQdas_Web_ServicePort_address = "http://localhost:8161/QDASWebService/QdasWebService.dll/soap/IQdas_Web_Service";
    public String getIQdas_Web_ServicePortAddress() {
        return IQdas_Web_ServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private String IQdas_Web_ServicePortWSDDServiceName = "IQdas_Web_ServicePort";

    public String getIQdas_Web_ServicePortWSDDServiceName() {
        return IQdas_Web_ServicePortWSDDServiceName;
    }

    public void setIQdas_Web_ServicePortWSDDServiceName(String name) {
        IQdas_Web_ServicePortWSDDServiceName = name;
    }

    public IQdas_Web_Service getIQdas_Web_ServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IQdas_Web_ServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIQdas_Web_ServicePort(endpoint);
    }

    public IQdas_Web_Service getIQdas_Web_ServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            IQdas_Web_ServicebindingStub _stub = new IQdas_Web_ServicebindingStub(portAddress, this);
            _stub.setPortName(getIQdas_Web_ServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIQdas_Web_ServicePortEndpointAddress(String address) {
        IQdas_Web_ServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (IQdas_Web_Service.class.isAssignableFrom(serviceEndpointInterface)) {
                IQdas_Web_ServicebindingStub _stub = new IQdas_Web_ServicebindingStub(new java.net.URL(IQdas_Web_ServicePort_address), this);
                _stub.setPortName(getIQdas_Web_ServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("IQdas_Web_ServicePort".equals(inputPortName)) {
            return getIQdas_Web_ServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "IQdas_Web_Serviceservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "IQdas_Web_ServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("IQdas_Web_ServicePort".equals(portName)) {
            setIQdas_Web_ServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
