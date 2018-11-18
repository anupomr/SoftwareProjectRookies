package canadian.rookies.servlets.business;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import canadian.rookies.model.BusinessCategory;
import canadian.rookies.service.BusinessService;

/**
 * Servlet implementation class BusinessServlet
 */
@WebServlet("/business")
public class BusinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String ERROR_PAGE = "errorPage.jsp";
	private static final String BSNS_INDEX_PAGE = "business/bsnsList.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusinessServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String responsePage = ERROR_PAGE;
		try {
			BusinessService service = new BusinessService();
			
			List<BusinessCategory> categoryList = service.getBusinessCategory();
			request.setAttribute("categoryList", categoryList);
			responsePage = BSNS_INDEX_PAGE;
			
		} catch (Exception e) {
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
//		doGet(request, response);
	}

}
