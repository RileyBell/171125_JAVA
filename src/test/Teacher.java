package test;

public class Teacher implements SchoolInfo {

	private String teacherName;
	private int teacherAge;
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTeacherAge() {
		return teacherAge;
	}
	public void setTeacherAge(int teacherAge) {
		this.teacherAge = teacherAge;
	}
	
	public String toString() {
		return "Teacher [teacherName = " + teacherName + ", teacherAge = " + teacherAge + "]";
	}
	
	
	public void schoolName() {
		System.out.println("School Name is HighSchool");
		
	}
	@Override
	public void schoolAddress() {
		// TODO Auto-generated method stub
		System.out.println("School Address is seoul");
	}
}
