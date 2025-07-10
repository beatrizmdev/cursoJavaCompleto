package entities;

public class Grades {
	private double[] num;

	public Grades(double[] num) {
		this.num = num;
	}
	
	public double avg() {
		double sum = 0;
		for (int i=0; i<num.length; i++) {
			sum += num[i];
		}
		return sum/num.length;
	}
	
	public void bellowAvg() {
		double sum = 0;
		for (int i=0; i<num.length; i++) {
			sum += num[i];
		}
		double avg = sum/num.length;
		
		for (int i=0; i<num.length; i++) {
			if (num[i] < avg) {
				System.out.printf("%.1f%n", num[i]);
			}
		}
		
	}
}
