package SOLID02;

//����ü
abstract public class Creature {
	private String name;
	private double height;
	private double weight;
	private String gender;
	
	
	public Creature(String name, double height, double weight, String gender) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}


	public abstract void eat();
}
