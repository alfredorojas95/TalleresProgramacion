/**
 * ServicioSumaFactorialServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviciosumafactorial;

public class ServicioSumaFactorialServiceLocator extends org.apache.axis.client.Service implements serviciosumafactorial.ServicioSumaFactorialService {

    public ServicioSumaFactorialServiceLocator() {
    }


    public ServicioSumaFactorialServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicioSumaFactorialServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServicioSumaFactorial
    private java.lang.String ServicioSumaFactorial_address = "http://localhost:8080/UpdateServicioSumaFactorial/services/ServicioSumaFactorial";

    public java.lang.String getServicioSumaFactorialAddress() {
        return ServicioSumaFactorial_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicioSumaFactorialWSDDServiceName = "ServicioSumaFactorial";

    public java.lang.String getServicioSumaFactorialWSDDServiceName() {
        return ServicioSumaFactorialWSDDServiceName;
    }

    public void setServicioSumaFactorialWSDDServiceName(java.lang.String name) {
        ServicioSumaFactorialWSDDServiceName = name;
    }

    public serviciosumafactorial.ServicioSumaFactorial getServicioSumaFactorial() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicioSumaFactorial_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicioSumaFactorial(endpoint);
    }

    public serviciosumafactorial.ServicioSumaFactorial getServicioSumaFactorial(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            serviciosumafactorial.ServicioSumaFactorialSoapBindingStub _stub = new serviciosumafactorial.ServicioSumaFactorialSoapBindingStub(portAddress, this);
            _stub.setPortName(getServicioSumaFactorialWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicioSumaFactorialEndpointAddress(java.lang.String address) {
        ServicioSumaFactorial_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (serviciosumafactorial.ServicioSumaFactorial.class.isAssignableFrom(serviceEndpointInterface)) {
                serviciosumafactorial.ServicioSumaFactorialSoapBindingStub _stub = new serviciosumafactorial.ServicioSumaFactorialSoapBindingStub(new java.net.URL(ServicioSumaFactorial_address), this);
                _stub.setPortName(getServicioSumaFactorialWSDDServiceName());
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
        if ("ServicioSumaFactorial".equals(inputPortName)) {
            return getServicioSumaFactorial();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://serviciosumafactorial", "ServicioSumaFactorialService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://serviciosumafactorial", "ServicioSumaFactorial"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServicioSumaFactorial".equals(portName)) {
            setServicioSumaFactorialEndpointAddress(address);
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
