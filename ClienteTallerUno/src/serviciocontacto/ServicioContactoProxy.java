package serviciocontacto;

public class ServicioContactoProxy implements serviciocontacto.ServicioContacto {
  private String _endpoint = null;
  private serviciocontacto.ServicioContacto servicioContacto = null;
  
  public ServicioContactoProxy() {
    _initServicioContactoProxy();
  }
  
  public ServicioContactoProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicioContactoProxy();
  }
  
  private void _initServicioContactoProxy() {
    try {
      servicioContacto = (new serviciocontacto.ServicioContactoServiceLocator()).getServicioContacto();
      if (servicioContacto != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicioContacto)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicioContacto)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicioContacto != null)
      ((javax.xml.rpc.Stub)servicioContacto)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public serviciocontacto.ServicioContacto getServicioContacto() {
    if (servicioContacto == null)
      _initServicioContactoProxy();
    return servicioContacto;
  }
  
  public java.lang.String eliminarContacto(java.lang.String rutContacto) throws java.rmi.RemoteException{
    if (servicioContacto == null)
      _initServicioContactoProxy();
    return servicioContacto.eliminarContacto(rutContacto);
  }
  
  public java.lang.String editarContacto(java.lang.String nombre, java.lang.String apellido, java.lang.String mail, java.lang.String telefono, java.lang.String rut, java.lang.String direccion, int sexo) throws java.rmi.RemoteException{
    if (servicioContacto == null)
      _initServicioContactoProxy();
    return servicioContacto.editarContacto(nombre, apellido, mail, telefono, rut, direccion, sexo);
  }
  
  public java.lang.String agregarContacto(java.lang.String nombre, java.lang.String apellido, java.lang.String mail, java.lang.String telefono, java.lang.String rut, java.lang.String direccion, int sexo) throws java.rmi.RemoteException{
    if (servicioContacto == null)
      _initServicioContactoProxy();
    return servicioContacto.agregarContacto(nombre, apellido, mail, telefono, rut, direccion, sexo);
  }
  
  
}