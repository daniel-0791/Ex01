package service;

import java.sql.SQLException;
import java.util.List;

import dao.BooktDao;
import domain.Bookt;






public class BooktService {
	private  BooktDao booktDao = new BooktDao();
	
	public List<Bookt> getAllcart() throws SQLException {
		//�����ݿ⵱�л�ȡ���е�����
		List<Bookt> allBookt = booktDao.getAllcart();
		//�õ�����������Ϣ
		return allBookt;
	}
	public List<Bookt> getAllBookt() throws SQLException {
		//�����ݿ⵱�л�ȡ���е�����
		List<Bookt> allBookt = booktDao.getAllBookt();
		//�õ�����������Ϣ
		return allBookt;
	}
}
		