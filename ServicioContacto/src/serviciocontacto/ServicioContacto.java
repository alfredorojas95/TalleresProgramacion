package serviciocontacto;

import model.Contacto;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioContacto {

	
	/**
	 * Este método agrega un nuevo contacto a la base de datos
	 * @param nuevoContacto
	 * @return
	 */

	public String agregarContacto(String nombre, String apellido, String mail, String telefono, String rut, String direccion, int sexo){
		return Contacto.agregarContacto(nombre, apellido, mail, telefono, rut, direccion, sexo);
	}
	
	/**
	 * Este método edita un contacto existente en la base de datos
	 * @param NuevoContacto
	 * @return
	 */
	public String editarContacto(String nombre, String apellido, String mail, String telefono, String rut, String direccion, int sexo){
		return Contacto.editarContacto(nombre, apellido, mail, telefono, rut, direccion, sexo);
	}
	
	/**
	 * Este método elimina un contacto en la base de datos
	 * @param rutContacto
	 * @return
	 */
	public String eliminarContacto(String rutContacto){
		return Contacto.eliminarContacto(rutContacto);
	}
}
