package package1;

public class Book{

	private int Id;

	private String title;
	private String subtitle;
	private String authorName;
	private String publisherName;
	private double price;
	private int noOfCopy;


	public void setId(int id){
		this.Id=id;
	} 
	public void setTitle(String title){
		this.title=title;
	}
	public void setSubTitle(String subtitle){
		this.subtitle=subtitle;
	}
	public void setAuthorName(String authorName){
		this.authorName=authorName;
	}
	public void setPublisherName(String publisherName){
		this.publisherName=publisherName;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void setNoOfCopy(int noOfCopy){
		this.noOfCopy=noOfCopy;
	}

	public int getId(){
		return Id;
	}
	public String getTitle(){
		return title;
	}
	public String getSubTitle(){
		return subtitle;
	}
	public String getAuthorName(){
		return authorName;
	}
	public String getPublisherName(){
		return publisherName;
	} 
	public double getPrice(){
		return price;
	}
	public int getNoOfCopy(){
		return noOfCopy;
	}

	public void showInfo(){
		System.out.println("Book ID: "+getId());
		System.out.println("Book Title: "+getTitle());
		System.out.println("Book Sub-Title: "+getSubTitle());
		System.out.println("Author Name: "+getAuthorName());
		System.out.println("Publisher Name: "+getPublisherName());
		System.out.println("Book Price: "+getPrice());
		System.out.println("No of Copy: "+getNoOfCopy());
	} 



}
