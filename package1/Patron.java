package package1;

public abstract class Patron implements BasicOperations{
	
	private String id;
	private String name;
	private String departmentName; 
	private String email;
	private String contactNo;
	private String address;
	private double amount;

	public Patron(String name, String departmentName, String email, String contactNo, String address){
		this.name=name;
		this.departmentName=departmentName;
		this.email=email;
		this.contactNo=contactNo;
		this.address=address;
	}


	public void setId(String id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setDepartmentName(String departmentName){
		this.departmentName=departmentName;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setContactNo(String contactNo){
		this.contactNo=contactNo;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setAmount(double amount){
		this.amount=amount;
	}

	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getDepartmentName(){
		return departmentName;
	}
	public String getEmail(){
		return email;
	}
	public String getContactNo(){
		return contactNo;
	}
	public String getAddress(){
		return address;
	}
	public double getAmount(){
		return amount;
	}

	public abstract void showInfo();

	
	public void borrow(Patron p, Book b){
		System.out.println("name:"+p.getName());
		
		System.out.println("Borrowed Books are :"+b.getTitle());

	} 

	public void ret(Patron p, Book b){
		System.out.println("name:"+p.getName());
		
		System.out.println("returned Books are :"+b.getTitle());

	}
	public void fine(Patron p,double amount){
		p.setAmount(amount);
		System.out.println("name:"+p.getName());		
		System.out.println("fine:"+p.getAmount());

	}

}



