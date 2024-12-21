package SOLID02;

import java.util.List;

abstract public class Pokemon extends Creature{

	private String type;    //타입
	private String classify;//분류
	private String character;//특성
	private String introduction; //소개
	private List<ISkill> skillList;  //스킬
	
	public Pokemon(String name, double height, double weight, String gender, String type, String classify,
			String character, String introduction) {
		super(name, height, weight, gender);
		this.type = type;
		this.classify = classify;
		this.character = character;
		this.introduction = introduction;
	}
	
	abstract public void sound();
	@Override
	public void eat() {
		System.out.println("사료를 먹는다.");
	}
	
	public void learnSkill(ISkill newSkill) {
		skillList.add(newSkill);
		
	}
}
