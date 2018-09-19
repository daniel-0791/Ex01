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



@WebServlet("/BooktServlet")
public class BooktServlet extends HttpServlet {


		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			//System.out.println("list" );
			//1.���÷����
			BooktService booktService = new BooktService();
			
				List<Bookt> allBookt = null;
				try {
					allBookt = booktService.getAllBookt();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//����������Ϣ
				//�Լ��Ͻ��з�ת
				//Collections.reverse(allBookt);
				//������д��request�� 
				request.setAttribute("allBookt", allBookt);
				//ת��	
				System.out.println("test1");
				
				request.getRequestDispatcher("list.jsp").forward(request, response);
			
			

	}
}

		