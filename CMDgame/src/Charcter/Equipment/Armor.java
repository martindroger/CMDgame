package Charcter.Equipment;

public abstract class Armor implements Printer {
	private String name;
	private int hp;
	private boolean destroyed;
	private int requiredLevel;
	
	public Armor(String name,int hp,int requiredLevel){
		this.name=name;
		this.hp=hp;
		this.requiredLevel=requiredLevel;
	}
	
	public boolean isDestroyed() {
		return destroyed;
	}
	
	public void takeDamage(int damage) {
		hp=-damage;
	}
	
	public void print(){
		System.out.println("Name: "+name);
		System.out.println("Protection: "+hp);
		System.out.println("Required Level: "+requiredLevel);
	}
}
