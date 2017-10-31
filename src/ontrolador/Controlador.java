package ontrolador;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	//public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	public void init() throws ServletException {
				// TODO Auto-generated method stub
				System.out.println("Ejecutando init");
				super.init();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String param1 = request.getParameter("x");
        String param2 = request.getParameter("y");
	    response.getWriter().append("Parametros:  x" + param1 +  " y : " + param2);
		//doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
