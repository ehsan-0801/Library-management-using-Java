package package1;

public class Teacher extends Patron{
	
	private String teacherId;
	private int officeRoomNo;

	public Teacher(String teacherId, String name, String departmentName,int officeRoomNo, String email, String contactNo, String address){
		super(name, departmentName, email, contactNo, address);
		this.teacherId=teacherId;
		this.officeRoomNo=officeRoomNo;
	}


	public void setTeacherId(String teacherId){
		this.teacherId=teacherId;
	}

	public String getTeacherId(){
		return teacherId;
	}

	public void setOfficeRoomNo(int officeRoomNo){
		this.officeRoomNo=officeRoomNo;
	}
	public int getOffceRoomNo(){
		return officeRoomNo;
	}

		public void showInfo(){
		System.out.println("Teacher Name:"+getName());
		System.out.println("Teacher ID: "+getTeacherId());
		System.out.println("Department: "+getDepartmentName());
		System.out.println("Office Room: "+getOffceRoomNo());
		System.out.println("Email: "+getEmail());
		System.out.println("Contact No: "+getContactNo());
		System.out.println("Address: "+getAddress());
	}

}