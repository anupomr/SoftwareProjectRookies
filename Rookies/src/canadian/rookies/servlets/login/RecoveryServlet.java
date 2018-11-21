package canadian.rookies.servlets.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import canadian.rookies.service.LoginService;

/**
 * Servlet implementation class RecoveryServlet
 */
@WebServlet("/forget")
public class RecoveryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ERROR_PAGE = "errorPage.jsp";
	private static final String NEXT_PAGE = "login/recoverdPassword.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecoveryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String responsePage = NEXT_PAGE;
		HttpSession session=request.getSession();
		try {
			LoginService service = new LoginService();
			String userName = request.getParameter("userName");			
			session.setAttribute("userName", userName);
			String password=service.passwordRecovery(userName);
			session.setAttribute("password", password);
		} catch (Exception e) {
			responsePage = ERROR_PAGE;
			request.setAttribute("errorMessage", e.getMessage());
		} finally {
			request.getRequestDispatcher(responsePage).forward(request, response);
		}
		return;
	}

}
