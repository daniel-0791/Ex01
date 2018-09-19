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
	//1.���÷����
	BooktService booktService = new BooktService();
		
		List<Bookt> allcart = null;
		try {
			allcart = booktService.getAllcart();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//����������Ϣ
		//�Լ��Ͻ��з�ת
		//Collections.reverse(allcart);
		//������д��request�� 
		request.setAttribute("allcart", allcart);
		//ת��	
		System.out.println("test2");
		
		request.getRequestDispatcher("cart.jsp").forward(request, response);
	
	
	

}
	

}
