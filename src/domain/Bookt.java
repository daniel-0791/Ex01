package domain;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Bookt {
	private String book_ID;
	private String book_ISBN;
	private String book_Name;
	public String getBook_ID() {
		return book_ID;
	}
	public void setBook_ID(String book_ID) {
		this.book_ID = book_ID;
	}
	public String getBook_ISBN() {
		return book_ISBN;
	}
	public void setBook_ISBN(String book_ISBN) {
		this.book_ISBN = book_ISBN;
	}
	public String getBook_Name() {
		return book_Name;
	}
	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}
	public String getBook_Author() {
		return book_Author;
	}
	public void setBook_Author(String book_Author) {
		this.book_Author = book_Author;
	}
	public String getBookType_ID() {
		return bookType_ID;
	}
	public void setBookType_ID(String bookType_ID) {
		this.bookType_ID = bookType_ID;
	}
	public String getPublishing_ID() {
		return publishing_ID;
	}
	public void setPublishing_ID(String publishing_ID) {
		this.publishing_ID = publishing_ID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBook_Publish_Time() {
		return book_Publish_Time;
	}
	public void setBook_Publish_Time(String book_Publish_Time) {
		this.book_Publish_Time = book_Publish_Time;
	}
	public String getBook_Num() {
		return book_Num;
	}
	public void setBook_Num(String book_Num) {
		this.book_Num = book_Num;
	}
	public String getBook_SaleNum() {
		return book_SaleNum;
	}
	public void setBook_SaleNum(String book_SaleNum) {
		this.book_SaleNum = book_SaleNum;
	}
	private String book_Author;
	private String bookType_ID;
	private String publishing_ID;
	private int price;
	private String book_Publish_Time;
	private String book_Num;
	private String book_SaleNum;
	@Override
	public String toString() {
		return "Bookt [book_ID=" + book_ID + ", book_ISBN=" + book_ISBN + ", book_Name=" + book_Name + ", book_Author="
				+ book_Author + ", bookType_ID=" + bookType_ID + ", publishing_ID=" + publishing_ID + ", price=" + price
				+ ", book_Publish_Time=" + book_Publish_Time + ", book_Num=" + book_Num + ", book_SaleNum="
				+ book_SaleNum + "]";
	}
	
	
	

}
