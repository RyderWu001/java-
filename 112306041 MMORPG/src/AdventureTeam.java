
public class AdventureTeam {
	private Adventurer a1, a2;
	
	public AdventureTeam(Adventurer a1, Adventurer a2) {
		
		this.a1 = a1;
		this.a2 = a2;
		
		
	}
	
	public void teamAttack(Monster m) {
		
		a1.attack(m);
		a2.attack(m);
		
		
	}

}
