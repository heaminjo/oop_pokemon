package SOLID02;

//스킬 추상 클래스
abstract public class Skill implements ISkill{
	private String name;  //스킬이름
	private int power;	  //공격력
	private String type;  //타입
	
	@Override
	public void attack() {
		System.out.println(name+"공격!");
	}
	
	@Override
	public void upgrade() {
		System.out.println("공격력이"+power+"에서"+ (power+10)+"으로 올랐습니다.");
		power += 10;
	}
	
	public String getName() {
		return this.name;
	}
}
