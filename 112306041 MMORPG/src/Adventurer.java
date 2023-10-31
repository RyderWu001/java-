
public class Adventurer {
	
	private String name ;
	private int atk ;
	private Weapon weapon = null ;
	
	public Adventurer(String name , int atk) {
		
		this.name = name;
		this.atk = atk;
	}
	
	public void attack(Monster m) {
		
		m.beAttack(atk);
		
	}
	public void setWeapon(Weapon w) {
		
		atk = atk + w.getAddAtk();
		
	}
	
	
}
