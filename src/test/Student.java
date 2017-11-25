package test;

public class Student implements SchoolInfo {

	private String stuName;
	private int stuAge;
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	public String toString() {
		return "StudentA [stuName = " + stuName + ", stuAge = " + stuAge + "]";
	}
	
	public void schoolName() {
		System.out.println("School Name is StudySchool");
	}
	
	public void schoolAddress() {
		System.out.println("School Address is Suwon");
	}
	
}
