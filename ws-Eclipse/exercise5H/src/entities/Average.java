package entities;

public class Average {
	private int[] num;

	public Average(int[] num) {
		this.num = num;
	}
	
	public void avg() {
		int n = 0;
		double sum = 0;		
		
		for (int i=0; i<num.length; i++) {
			
			if (num[i] %2 == 0) {
				sum += num[i];
				n += 1;
			}
			
		}
		
		//double avg = sum/n;
		
		if (sum > 0) {
			System.out.printf("%nMédia dos pares = %.1f%n", sum/n);
		}
		else {
			System.out.println();
			System.out.println("Nenhum número par.");
		}
	}
	
}
