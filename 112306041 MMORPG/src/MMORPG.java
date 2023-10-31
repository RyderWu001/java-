
public class MMORPG {

	public static void main(String[] args) {
		
		Adventurer a1 =  new Adventurer("Alan",10);
		Adventurer a2 =  new Adventurer("Amy",15);
		Weapon w1 = new Weapon("bubble gum", 10);
		
		a1.setWeapon(w1);
		
		Monster m1 = new Monster("Lab Monster", 30); 
		Monster m2 = new Monster("Assignment Monster", 35);
		
		a1.attack(m1);
		a2.attack(m1);
		a1.attack(m1); 
		
		System.out.println("-".repeat(40));
		
		AdventureTeam team = new AdventureTeam(a1, a2); 
		
		team.teamAttack(m2);
		team.teamAttack(m2);
		
		
	}

}
