/**
 * ServicioContactoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviciocontacto;

public class ServicioContactoServiceLocator extends org.apache.axis.client.Service implements serviciocontacto.ServicioContactoService {

    public ServicioContactoServiceLocator() {
    }


    public ServicioContactoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicioContactoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServicioContacto
    private java.lang.String ServicioContacto_address = "http://localhost:8080/ServicioContacto/services/ServicioContacto";

    public java.lang.String getServicioContactoAddress() {
        return ServicioContacto_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicioContactoWSDDServiceName = "ServicioContacto";

    public java.lang.String getServicioContactoWSDDServiceName() {
        return ServicioContactoWSDDServiceName;
    }

    public void setServicioContactoWSDDServiceName(java.lang.String name) {
        ServicioContactoWSDDServiceName = name;
    }

    public serviciocontacto.ServicioContacto getServicioContacto() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicioContacto_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicioContacto(endpoint);
    }

    public serviciocontacto.ServicioContacto getServicioContacto(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            serviciocontacto.ServicioContactoSoapBindingStub _stub = new serviciocontacto.ServicioContactoSoapBindingStub(portAddress, this);
            _stub.setPortName(getServicioContactoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicioContactoEndpointAddress(java.lang.String address) {
        ServicioContacto_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (serviciocontacto.ServicioContacto.class.isAssignableFrom(serviceEndpointInterface)) {
                serviciocontacto.ServicioContactoSoapBindingStub _stub = new serviciocontacto.ServicioContactoSoapBindingStub(new java.net.URL(ServicioContacto_address), this);
                _stub.setPortName(getServicioContactoWSDDServiceName());
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
        if ("ServicioContacto".equals(inputPortName)) {
            return getServicioContacto();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://serviciocontacto", "ServicioContactoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://serviciocontacto", "ServicioContacto"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServicioContacto".equals(portName)) {
            setServicioContactoEndpointAddress(address);
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
