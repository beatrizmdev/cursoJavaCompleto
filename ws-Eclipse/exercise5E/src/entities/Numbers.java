package entities;

public class Numbers {
	private double[] vect;

	public Numbers(double[] vect) {
		this.vect = vect;
	}
	
	public double highest() {
		double highest = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i] > highest) {
				highest = vect[i];
			}
		}
		return highest;
	}
	
	public int highID() {
		double highest = 0;
		int id = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i] > highest) {
				highest = vect[i];
				id = i;
			}
		}
		return id;
	}
	
}
