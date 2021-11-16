package package2;
import package1.*;

public interface TeacherOperations{
	
	void insertTeacher(Teacher[] t);
	void removeTeacher(int t);
	Teacher getTeacher(int teacherId);
	void showAllTeachers();	

}
