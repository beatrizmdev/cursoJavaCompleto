package entities;

public class Numbers {
	private int[] vectNum;

	public Numbers(int[] vectNum) {
		this.vectNum = vectNum;
	}
	
	public void even() {
		for (int i=0; i<vectNum.length; i++) {
			if (vectNum[i]%2 == 0) {
				System.out.print(vectNum[i] + " ");
			}
		}
	}
	
	public int evenCount() {
		int count = 0;
		for (int i=0; i<vectNum.length; i++) {
			if (vectNum[i]%2 == 0) {
				count += 1;
			}
		}
		return count;
	}
}
