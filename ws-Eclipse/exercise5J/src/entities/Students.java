package entities;

public class Students {
	private String[] name;
	private double[] grade1;
	private double[] grade2;

	public Students(String[] name, double[] grade1, double[] grade2) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
	}
	
	public void approved() {
		double aux = 0;
		for (int i=0; i<name.length; i++) {
			aux = (grade1[i] + grade2[i])/2;
			
			if (aux >= 6.00) {
				System.out.println(name[i]);
			}
		}
	}
	
}
