package Junit;

import static org.junit.Assert.*;
import model.Contacto;

import org.junit.Test;

public class ContactoTest {

//	@Test
//	public void testAgregarContacto() {
//		String resultado = Contacto.agregarContacto("Cesar", "Uribe", "Cesar@hotmail.cl", "68287900", "189938543", "Santa carolina", 1);
//		assertTrue(resultado=="Contacto ingresado exitosamente");
//	}

//	@Test
//	public void testEditarContacto() {
//		String resultado = Contacto.editarContacto("Cesar", "Uribe", "Cesar@hotmail.cl", "68287900", "189938543", "Troyo", 0);
//		assertTrue(resultado=="contacto editado");
//	}

	@Test
	public void testEliminarContacto() {
		String resultado = Contacto.eliminarContacto("189938314");
		assertTrue(resultado=="contacto eliminado");
	}

}
