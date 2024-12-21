package SOLID02;

import java.util.List;

public class Pikachu extends Pokemon{

	
	public Pikachu(String name, double height, double weight, String gender, String type, String classify,
			String character, String introduction) {
		super(name, height, weight, gender, type, classify, character, introduction);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sound() {
		System.out.println("피카피카");
	}
}
