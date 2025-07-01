package entities;

public class Student {
	public double grade1;
	public double grade2;
	public double grade3;
	public String name;
	public double missing;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double situation() {
		if (finalGrade() < 60) {
			return 60 - finalGrade();
		}
		else {
			return 0.0;
		}
	}

}
