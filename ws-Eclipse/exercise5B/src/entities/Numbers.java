package entities;

public class Numbers {
	private double[] vect;

	public Numbers(double[] vect) {
		this.vect = vect;
	}
	
	public void printing() {
		System.out.print("Valores: ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
	}
	
	public double sum() {
		double sum = 0;
		for (int i=0; i<vect.length; i++) {
			 sum += vect[i];
		}
		
		return sum;
	}
	
	public double avg() {
		return sum()/vect.length;
	}
}
