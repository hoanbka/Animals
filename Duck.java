package oop;

public class Duck implements Behaviour {
	private String name;
	private int weight;

	
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else
			throw new IllegalArgumentException();
	}

	@Override
	public void talk() {
		for (int i = 0; i < weight; i++) {
			System.out.println("O o o...");
		}

	}

	@Override
	public void move() {
		System.out.println("moving by 2 legs, and flying time to time");
	}

	public void produceEgg() {
		System.out.println("chicken produces gold eggs");
	}

}
