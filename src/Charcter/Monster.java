package Charcter;

public class Monster {
	private String name;
	private int health;
	private Species species;
	private boolean alive;
	
	public void setDamage(int damage) {
		this.health -=damage;
	}
	
	public boolean isAlive() {
		return alive;
	}
}


