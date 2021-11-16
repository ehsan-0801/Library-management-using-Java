import package1.*;


public class Librarian{
	String name;
	String id;
	double salary;
	int age;

	public void setName(String name){
		this.name=name;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public void setAge(int age){
		this.age=age;
	}

	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public double getSalary(){
		return salary;
	}
	public int age(){
		return age;
	}

	public void generateFine(Patron p,double amount)
	{
		p.setAmount(amount);
		System.out.println("For id:"+p.getId());
		System.out.println("The amount of Fine is:"+amount);
		

	}


}