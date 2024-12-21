package SOLID02;

import java.util.List;

abstract public class Pokemon extends Creature{

	private String type;    //Ÿ��
	private String classify;//�з�
	private String character;//Ư��
	private String introduction; //�Ұ�
	private List<ISkill> skillList;  //��ų
	
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
		System.out.println("��Ḧ �Դ´�.");
	}
	
	public void learnSkill(ISkill newSkill) {
		skillList.add(newSkill);
		
	}
}
