package control;
import java.rmi.RemoteException;

import serviciocontacto.ServicioContactoProxy;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioContactoProxy a = new ServicioContactoProxy();
		
		try {
			String res1 = a.agregarContacto("Pablo", "Valenzuela", "p@hotmail.cl", "2222", "167656787", "Labranza", 1);
			System.out.println(res1);
//			String res2 = a.editarContacto("Jose", "hidalgo", "jose@", "2222", "178657645", "Cajon", 0);
//			System.out.println(res2);
//			String res3 = a.eliminarContacto("178657645");
//			System.out.println(res3);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
