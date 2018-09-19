package test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import dao.BooktDao;
import domain.Bookt;



public class BooktDaoTest {
	private  BooktDao booktDao = new BooktDao();
	@Test
	public void testGetAllBookt() throws SQLException {
		
		List<Bookt> allBookt = booktDao.getAllBookt();
		System.out.println(allBookt);
	}
	
}
