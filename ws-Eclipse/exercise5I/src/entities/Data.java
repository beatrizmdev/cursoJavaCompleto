package entities;

public class Data {
	private String[] name;
	private int[] age;
	
	public Data(String[] name, int[] age) {
		this.name = name;
		this.age = age;
	}
	
	public String older() {
		int older = 0;
		String person = name[0];
		
		for (int i=0; i<name.length; i++) {
			if (age[i] > older) {
				older = age[i];
				person = name[i];
			}
		}
		
		return person;
	}
}
