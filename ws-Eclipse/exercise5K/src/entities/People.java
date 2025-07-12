package entities;

public class People {
	private double[] height;
	private char[] gender;
	
	public People(double[] height, char[] gender) {
		this.height = height;
		this.gender = gender;
	}
	
	public double lowest() {
		double lowest = height[0];
		for (int i=0; i<height.length; i++) {
			
			if (height[i] < lowest) {
				lowest = height[i];
			}
		}
		
		return lowest;
	}
	
	public double higher() {
		double higher = 0.00;
		for (int i=0; i<height.length; i++) {
			
			if (height[i] > higher) {
				higher = height[i];
			}
		}
		
		return higher;
	}
	
	public double avg() {
		double sum = 0.00;
		int count = 0;
		
		for (int i=0; i<height.length; i++) {
			
			if (gender[i] == 'F' || gender[i] == 'f') {
				sum += height[i];
				count += 1;
			}
		}		
		
		return sum/count;
	}
	
	public int men() {
		int count = 0;
		for (int i=0; i<gender.length; i++) {
			
			if (gender[i] == 'M' || gender[i] == 'm') {
				count += 1;
			}
		}
		
		return count;
	}
	
}
