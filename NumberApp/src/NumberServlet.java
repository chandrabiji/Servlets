

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NumberServlet
 */
public class NumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int n1 = Integer.parseInt(request.getParameter("t1"));
		int n2 = Integer.parseInt(request.getParameter("t2"));
		String button = request.getParameter("click");
		if(button.equals("ADD"))
		{
			out.println("Result : "+(n1+n2));
		}else{
			out.println("Result : "+(n1-n2));
		}
	}

}
