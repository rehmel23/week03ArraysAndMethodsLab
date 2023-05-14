package week03Arrays;

public class Student {
	String fullName = "";
	int[] grades;
	
	public Student(String fname, int[] grades) {
		this.fullName = fname;
		this.grades = grades;
	}
	
	public void describe() {
		System.out.println("Student: " + this.fullName);
		System.out.println("Grades:");
		for (int grade : this.grades) {
			System.out.println("\t" + grade + " ");
		}
		System.out.println();
	}
}
