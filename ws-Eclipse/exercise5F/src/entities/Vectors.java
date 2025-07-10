package entities;

public class Vectors {
	private int[] vectA;
	private int[] vectB;
	private int n;
	
	public Vectors(int[] vectA, int[] vectB) {
		this.vectA = vectA;
		this.vectB = vectB;
	}
		
	public void vectC() {
		n = vectA.length;
		int[] vectC = new int[n];
		for (int i=0; i<vectA.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
	}
}
