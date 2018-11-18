package canadian.rookies.servlets.business;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import canadian.rookies.model.Login;

import canadian.rookies.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ERROR_PAGE = "errorPage.jsp";
	private static final String INDEX_PAGE = "login/login.jsp";
	private static final String BSNS_INDEX_PAGE = "business/bsnsList.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(INDEX_PAGE).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String responsePage = ERROR_PAGE;
		try {
			LoginService service = new LoginService();
//			List<Login> loginList = LoginService.getInstance().getLogin();
			List<Login> loginList = service.getLogin();
			
			String userName=request.getParameter("userName");
			String password=request.getParameter("password");
			for (Login login : loginList) {
				if(login.getUserName().equals(userName)&&login.getPassword().equals(password)) {
					request.setAttribute("userName", login.getUserName());
					responsePage =BSNS_INDEX_PAGE;
					
				}else {
					responsePage = INDEX_PAGE;
				}
				
			}
			
			
			
		} catch (Exception e) {
			request.setAttribute("errorMessage", e.getMessage());
		} finally {
			request.getRequestDispatcher(responsePage).forward(request, response);
		}
		return;
	}

}
