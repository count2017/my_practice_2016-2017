/**
 * WebServiceInterfaceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xdyy.serviceImpl;

public class WebServiceInterfaceImplServiceLocator extends org.apache.axis.client.Service implements com.xdyy.serviceImpl.WebServiceInterfaceImplService {

    public WebServiceInterfaceImplServiceLocator() {
    }


    public WebServiceInterfaceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceInterfaceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceInterfaceImpl
    private java.lang.String WebServiceInterfaceImpl_address = "http://localhost:8080/hisinterface/services/WebServiceInterfaceImpl";

    public java.lang.String getWebServiceInterfaceImplAddress() {
        return WebServiceInterfaceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceInterfaceImplWSDDServiceName = "WebServiceInterfaceImpl";

    public java.lang.String getWebServiceInterfaceImplWSDDServiceName() {
        return WebServiceInterfaceImplWSDDServiceName;
    }

    public void setWebServiceInterfaceImplWSDDServiceName(java.lang.String name) {
        WebServiceInterfaceImplWSDDServiceName = name;
    }

    public com.xdyy.serviceImpl.WebServiceInterfaceImpl getWebServiceInterfaceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceInterfaceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceInterfaceImpl(endpoint);
    }

    public com.xdyy.serviceImpl.WebServiceInterfaceImpl getWebServiceInterfaceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xdyy.serviceImpl.WebServiceInterfaceImplSoapBindingStub _stub = new com.xdyy.serviceImpl.WebServiceInterfaceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getWebServiceInterfaceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceInterfaceImplEndpointAddress(java.lang.String address) {
        WebServiceInterfaceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xdyy.serviceImpl.WebServiceInterfaceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xdyy.serviceImpl.WebServiceInterfaceImplSoapBindingStub _stub = new com.xdyy.serviceImpl.WebServiceInterfaceImplSoapBindingStub(new java.net.URL(WebServiceInterfaceImpl_address), this);
                _stub.setPortName(getWebServiceInterfaceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServiceInterfaceImpl".equals(inputPortName)) {
            return getWebServiceInterfaceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://serviceImpl.xdyy.com", "WebServiceInterfaceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://serviceImpl.xdyy.com", "WebServiceInterfaceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceInterfaceImpl".equals(portName)) {
            setWebServiceInterfaceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
