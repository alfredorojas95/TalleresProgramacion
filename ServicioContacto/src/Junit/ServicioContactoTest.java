package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Contacto;

public class ServicioContactoTest {

	@Test
	public void testAgregarContacto() {
		String resultado = Contacto.agregarContacto("Heber", "Arratia", "Heber@hotmail.cl", "68287900", "179876754", "Traiguen", 1);
		assertTrue(resultado=="Contacto ingresado exitosamente");
	}

//	@Test
//	public void testEditarContacto() {
//	String resultado = Contacto.editarContacto("Cesar", "Uribe", "Cesar@hotmail.cl", "68287900", "189938543", "Troyo", 0);
//	assertTrue(resultado=="contacto editado");
//	}

	
//	@Test
//	public void testEliminarContacto() {
//		String resultado = Contacto.eliminarContacto("189938512");
//		assertTrue(resultado=="contacto eliminado");
//	}

}
