package com.xdyy.serviceImpl;

public class WebServiceInterfaceImplProxy implements com.xdyy.serviceImpl.WebServiceInterfaceImpl {
  private String _endpoint = null;
  private com.xdyy.serviceImpl.WebServiceInterfaceImpl webServiceInterfaceImpl = null;
  
  public WebServiceInterfaceImplProxy() {
    _initWebServiceInterfaceImplProxy();
  }
  
  public WebServiceInterfaceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceInterfaceImplProxy();
  }
  
  private void _initWebServiceInterfaceImplProxy() {
    try {
      webServiceInterfaceImpl = (new com.xdyy.serviceImpl.WebServiceInterfaceImplServiceLocator()).getWebServiceInterfaceImpl();
      if (webServiceInterfaceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceInterfaceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceInterfaceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceInterfaceImpl != null)
      ((javax.xml.rpc.Stub)webServiceInterfaceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.xdyy.serviceImpl.WebServiceInterfaceImpl getWebServiceInterfaceImpl() {
    if (webServiceInterfaceImpl == null)
      _initWebServiceInterfaceImplProxy();
    return webServiceInterfaceImpl;
  }
  
  public java.lang.String funcResult(java.lang.String xmlstr) throws java.rmi.RemoteException{
    if (webServiceInterfaceImpl == null)
      _initWebServiceInterfaceImplProxy();
    return webServiceInterfaceImpl.funcResult(xmlstr);
  }
  
  
}