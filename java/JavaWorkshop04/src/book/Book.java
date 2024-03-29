package book;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	// getDiscountBookPrice():double
	public double getDiscountBookPrice() {  // 인하된 책 가격을 리턴
		return bookPrice-(bookPrice * bookDiscountRate);
	}
	
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	
}
