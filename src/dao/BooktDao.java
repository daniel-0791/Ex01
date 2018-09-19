package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Bookt;
import util.JdbcUtil;

public class BooktDao {
	JdbcUtil jdbcUtil = new JdbcUtil();
	ResultSet rs;
	//连接数据库
		private QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		//1.从数据库当中查询所有商品列表
		public List<Bookt> getAllBookt() throws SQLException{
			
			//1.查询操作
			String sql = "select * from bookt";
			//2执行sql
			List<Bookt> allbookt = null;
			//得到所有书名信息
			allbookt = qr.query(sql, new BeanListHandler<Bookt>(Bookt.class));
		
			return allbookt;
		}
		
	public List<Bookt> getAllcart() throws SQLException{
			
			//1.查询操作
			String sql = "select * from bookt a , cartt b where a.book_ID=b.book_ID";
			//2执行sql
			List<Bookt> allbookt = null;
			//得到所有书名信息
			allbookt = qr.query(sql, new BeanListHandler<Bookt>(Bookt.class));
		
			return allbookt;
		}
		public void save(int book_ID) throws SQLException {  
			Connection conn =jdbcUtil. buildConnect();
			System.out.println("test31");
		String str = "insert into cartt(book_ID,qty)  values(?,1)";
		PreparedStatement sql=conn.prepareStatement(str);
		sql.setInt(1,book_ID);
		
	System.out.println("test3");
		sql.executeUpdate();//执行更新操作
		


             }

	}
			