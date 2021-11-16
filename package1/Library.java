package package1;
import package2.*;
                
public class Library implements StudentOperations, TeacherOperations, BookOperations{

	public String libraryName="ABCD Library";
	private String Address="ABCF";
	
	Student students[]=new Student[10];
	Teacher teachers[]=new Teacher[10];
	Book books[]=new Book[10];
	//Patron p[]=new Patron[10];
	
	public static int noOfBooks=0;
	
	public void insertStudent(Student[] s){
		for(int i=0;i<2;i++){
			students[i]=s[i];
			students[i]=s[i];
		}
	}

	public void removeStudent(int s){
		int n=s-1;
		for(int i=n;i<2;i++){
			students[i]=students[i+1];
		}

	}

	public Student getStudent(int studentID){
		return students[studentID];
	}

	public void showAllStudents(){
		for(int i=0;i<2;i++){
			students[i].showInfo();
			System.out.println(" ");
		}
	}


	public void insertTeacher(Teacher[] t){
		for(int i=0;i<2;i++){
			teachers[i]=t[i];
			teachers[i]=t[i];
		}
	}

	public void removeTeacher(int t){
		int n=t-1;
		for(int i=n;i<2;i++){
			teachers[i]=teachers[i+1];
		}

	}

	public Teacher getTeacher(int teacherId){
		return teachers[teacherId];
	}

	public void showAllTeachers(){
		for(int i=0;i<2;i++){
			teachers[i].showInfo();
			System.out.println(" ");
		}
	}

	public void insertBook(Book[] b){
		for(int i=0;i<2;i++){
			books[i]=b[i];
		//    noOfBooks+=1;
		}
		
	}

	public void removeBook(int b){
		int n=b-1;
		for(int i=n;i<2;i++){
			books[i]=books[i+1];
		}

	}

	public Book getBook(int bookId){
		return books[bookId];
	}

	public void showAllBooks(){
		for(int i=0;i<2;i++){
			books[i].showInfo();
			System.out.println(" ");
		}
	}




	
}

