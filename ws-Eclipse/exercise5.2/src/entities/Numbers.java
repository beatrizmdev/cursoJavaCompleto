package entities;

public class Numbers {
	
	private int[] vect;
	
	public Numbers(int[] vect) {
		this.vect = vect;
	}
	
	public void negatives() {
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
	}
	
	
	
}
