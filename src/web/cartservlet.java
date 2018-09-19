package web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Bookt;
import service.BooktService;

/**
 * Servlet implementation class bookservlet
 */
@WebServlet("/cartservlet")
public class cartservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cartservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			System.out.println("teat5");
	//System.out.println("list" );
	//1.调用服务层
	BooktService booktService = new BooktService();
		
		List<Bookt> allcart = null;
		try {
			allcart = booktService.getAllcart();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//所有书名信息
		//对集合进行反转
		//Collections.reverse(allcart);
		//把数据写到request域 
		request.setAttribute("allcart", allcart);
		//转发	
		System.out.println("test2");
		
		request.getRequestDispatcher("cart.jsp").forward(request, response);
	
	
	

}
	

}
