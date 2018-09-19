package web;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;

import dao.BooktDao;

import java.sql.Connection;


import util.JdbcUtil;


@WebServlet("/BuyServlet")
public class BuyServlet extends HttpServlet {
	
	private QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	JdbcUtil jdbcUtil = new JdbcUtil();

	ResultSet rs;
	BooktDao bookdao=new BooktDao();
	public BuyServlet() {
		super();
	}


	@Override
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	     doPost(request, response);
	}


	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Connection conn =jdbcUtil. buildConnect();
		
		int book_ID=Integer.parseInt(request.getParameter("book_ID"));	
		String str="select * from bookt where book_ID=?";
		try {
			
			
			PreparedStatement sql=conn.prepareStatement(str);
			sql.setInt(1,book_ID);
			
			rs=sql.executeQuery();
			
			if(rs.next())
			{
				 String str1="≤Â»Î≥…π¶";				
					request.setAttribute("name", str1);
					//courseDAO.save(stu_id,course_id);
					bookdao.save(book_ID);
					request.getRequestDispatcher("BooktServlet").forward(request, response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
