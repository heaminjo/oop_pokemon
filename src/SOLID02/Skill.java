package SOLID02;

//��ų �߻� Ŭ����
abstract public class Skill implements ISkill{
	private String name;  //��ų�̸�
	private int power;	  //���ݷ�
	private String type;  //Ÿ��
	
	@Override
	public void attack() {
		System.out.println(name+"����!");
	}
	
	@Override
	public void upgrade() {
		System.out.println("���ݷ���"+power+"����"+ (power+10)+"���� �ö����ϴ�.");
		power += 10;
	}
	
	public String getName() {
		return this.name;
	}
}
