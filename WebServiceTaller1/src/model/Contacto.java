package model;

import org.orm.PersistentException;

public class Contacto {

	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String rut;
	private String direccion;
	private int sexo;
	

	public Contacto(String nombre, String apellido, String email,
			String telefono, String rut, String direccion, int sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.rut = rut;
		this.direccion = direccion;
		this.sexo = sexo;
	}

	public static String agregarContacto(String nombre, String apellido, String mail, String telefono, String rut, String direccion, int sexo){
		Contacto nuevoContacto = new Contacto(nombre, apellido, mail, telefono, rut, direccion, sexo);
				try {
					String condicionContacto = "rut='" + nuevoContacto.getRut()+ "'";
					orm.Contacto lormContactoExiste = orm.ContactoDAO.loadContactoByQuery(condicionContacto, null);
					
					if (lormContactoExiste==null){
						orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
						lormContacto.setNombre(nuevoContacto.getNombre());
						lormContacto.setApellido(nuevoContacto.getApellido());;
						lormContacto.setMail(nuevoContacto.getEmail());
						lormContacto.setTelefono(nuevoContacto.getTelefono());
						lormContacto.setRut(nuevoContacto.getRut());
						lormContacto.setDireccion(nuevoContacto.getDireccion());
						lormContacto.setSexo(nuevoContacto.getSexo());
						orm.ContactoDAO.save(lormContacto);
						return "Contacto ingresado exitosamente";
					}else{
						return "El contacto ingresado ya existe";
					}	
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return null;
	}
	
	public static String editarContacto(String nombre, String apellido, String mail, String telefono, String rut, String direccion, int sexo){
		Contacto nuevoContacto = new Contacto(nombre, apellido, mail, telefono, rut, direccion, sexo);
		try {
			String condicionContacto = "rut='" + nuevoContacto.getRut()+ "'";
			orm.Contacto lormContactoExiste = orm.ContactoDAO.loadContactoByQuery(condicionContacto, null);
			if (lormContactoExiste!=null){
				lormContactoExiste.setNombre(nuevoContacto.getNombre());
				lormContactoExiste.setApellido(nuevoContacto.getApellido());;
				lormContactoExiste.setMail(nuevoContacto.getEmail());
				lormContactoExiste.setTelefono(nuevoContacto.getTelefono());
				lormContactoExiste.setRut(nuevoContacto.getRut());
				lormContactoExiste.setDireccion(nuevoContacto.getDireccion());
				lormContactoExiste.setSexo(nuevoContacto.getSexo());
				orm.ContactoDAO.save(lormContactoExiste);
				return "contacto editado";
			}else{
				return "no se puddo editar";
			}	
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static String eliminarContacto(String rutContacto){
		try {
			String condicionContacto = "rut='" + rutContacto + "'";
			orm.Contacto contactoExiste = orm.ContactoDAO.loadContactoByQuery(condicionContacto, null);
			if (contactoExiste!=null){	
			orm.ContactoDAO.delete(contactoExiste);
			return "contacto eliminado";
			} else {
				return "No se pudo eliminar el contacto";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Delete the persistent object
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	
}
