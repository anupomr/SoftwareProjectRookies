package canadian.rookies.servlets.login;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import canadian.rookies.service.LoginService;


/**
 * Servlet implementation class newUser
 */
@WebServlet("/newUser")
public class newUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ERROR_PAGE = "errorPage.jsp";
	private static final String NEXT_PAGE = "login/login.jsp";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String responsePage = NEXT_PAGE;
		try {
			LoginService service = new LoginService();
			String userName=request.getParameter("userName");
			String password=request.getParameter("password");
			String userType=request.getParameter("userType");

			 service.saveNewUser(userName, password, userType);			
			
			
			
		} catch (Exception e) {
			responsePage = ERROR_PAGE;
			request.setAttribute("errorMessage", e.getMessage());
		} finally {
			request.getRequestDispatcher(responsePage).forward(request, response);
		}
		return;
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
