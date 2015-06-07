package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Contacto;

/**
 * Servlet implementation class Formulario
 */
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		
		
		//if((nombre!="")){
		
		out.println(" Nombre "+ nombre);
		out.println(" Apellido "+ apellido);
		out.println(" Email "+ email);
		out.println(" Teléfono "+ telefono);
		

		//request.setAttribute("mensaje", " Hola tu nombre es "+ nombre + ". Saludos!!!");
		//request.getRequestDispatcher("/Formulario.jsp").forward(request, response);
		
		
			
		ArrayList<Contacto> oContactoLista = new ArrayList<Contacto>();
		
		//oContactoLista.add(new Contacto("Victor","Aravena","victor.aravena@ufrontera.cl","111111"));
		//oContactoLista.add(new Contacto("Patricio","Gonzalez","pg@algo.cl","111111"));
		
		oContactoLista.add(new Contacto(nombre, apellido,email,telefono));
		request.setAttribute("listaContacto", oContactoLista);
		request.getRequestDispatcher("/formulario.jsp").forward(request, response);
		//}else{
			//out.print("Debes ingresar algo en los campos de texto");
			
		//}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
