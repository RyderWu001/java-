
public class Monster {
	
	private String name;
	private int hp ;
	public Monster(String name , int hp) {
		
		this.name = name;
		this.hp = hp;
		
	}
	public void beAttack(int damage) {
		
		if (hp<=0) {
			System.out.println(name+" is dead;you cannot attack it.");
			
		}else if(hp>0) {
			hp = hp - damage;
			System.out.println(name+" lose "+damage+" health points.");
			
			if (hp<=0) {
				System.out.println(name+" is dead.");
			}
		
		}
		
	}

}
