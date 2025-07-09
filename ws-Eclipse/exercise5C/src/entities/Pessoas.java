package entities;

public class Pessoas {
	private String[] vectName;
	private int[] vectAge;
	private double[] vectHeight;
	
	public Pessoas(String[] vectName, int[] vectAge, double[] vectHeight) {
		this.vectName = vectName;
		this.vectAge = vectAge;
		this.vectHeight = vectHeight;
	}
	
	public double avgHeight() {
		double sum = 0;
		for (int i=0; i<vectHeight.length; i++) {
			sum += vectHeight[i];
		}
		
		return sum/vectHeight.length;
	}
	
	public double under16() {
		double sum = 0.00;
		for (int i=0; i<vectAge.length; i++) {
			if (vectAge[i] < 16) {
				sum +=1;
			}
		}
		return ((sum/vectAge.length)*100);
	}
	
	public void namesUnder16() {
		for (int i=0; i<vectAge.length; i++) {
			if (vectAge[i] < 16) {
				System.out.println(vectName[i]);
			}
		}
	}
}
