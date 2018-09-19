package service;

import java.sql.SQLException;
import java.util.List;

import dao.BooktDao;
import domain.Bookt;






public class BooktService {
	private  BooktDao booktDao = new BooktDao();
	
	public List<Bookt> getAllcart() throws SQLException {
		//从数据库当中获取所有的数据
		List<Bookt> allBookt = booktDao.getAllcart();
		//得到所有书名信息
		return allBookt;
	}
	public List<Bookt> getAllBookt() throws SQLException {
		//从数据库当中获取所有的数据
		List<Bookt> allBookt = booktDao.getAllBookt();
		//得到所有书名信息
		return allBookt;
	}
}
		