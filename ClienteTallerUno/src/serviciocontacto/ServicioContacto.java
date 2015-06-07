/**
 * ServicioContacto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviciocontacto;

public interface ServicioContacto extends java.rmi.Remote {
    public java.lang.String eliminarContacto(java.lang.String rutContacto) throws java.rmi.RemoteException;
    public java.lang.String editarContacto(java.lang.String nombre, java.lang.String apellido, java.lang.String mail, java.lang.String telefono, java.lang.String rut, java.lang.String direccion, int sexo) throws java.rmi.RemoteException;
    public java.lang.String agregarContacto(java.lang.String nombre, java.lang.String apellido, java.lang.String mail, java.lang.String telefono, java.lang.String rut, java.lang.String direccion, int sexo) throws java.rmi.RemoteException;
}
