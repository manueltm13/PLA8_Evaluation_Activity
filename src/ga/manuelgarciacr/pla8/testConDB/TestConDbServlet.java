package ga.manuelgarciacr.pla8.testConDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestConDbServlet
 */
@WebServlet("/TestConDbServlet")
public class TestConDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cadConexion = "jdbc:mysql://localhost:3306/";
		String bd = "tm13contactos";
		String usuario = "root";
		String pass = "";
		
		try {
			cadConexion = "jdbc:mysql://localhost:3306/";
			bd = "tareas";
			usuario = "root";
			pass = "";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(cadConexion +
					bd+"?serverTimezone=UTC", usuario, pass);
			PrintWriter out =response.getWriter();
			out.println("Todo bien");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	

}
