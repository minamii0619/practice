public class Book extends tangibleAsset{
	private String isbn;
	public Book (String name,int price, String color,String isbn){
		super (name,price,color);
		this.isbn=isbn;
	}
	public String gettlsbn(){return this.isbn;}
}
