package Charcter.Equipment;

public class Weapon {
	private String name;
	private int minDamage;
	private int maxDamage;
	private int requiredLevel;
	private int critialhit;
	
	
	
	public Weapon(String name,int minDamage,int maxDamage,int requiredLevel){
		if(minDamage>=maxDamage){
			throw new IllegalArgumentException("max damage must be bigger than min damage");
		}
		
		this.name=name;
		this.minDamage=minDamage;
		this.maxDamage=maxDamage;
		this.requiredLevel=requiredLevel;
		this.critialhit=maxDamage*2;
	}
	
	
	public void print(){
		System.out.println("Name: "+name);
		System.out.println("Damage: "+minDamage+"-"+maxDamage);
		System.out.println("Requiered Level: "+requiredLevel);
		System.out.println();
		
	}
	
	public int attack(){
		int damage=(int)(Math.random()*((maxDamage-minDamage)+1)+minDamage);
		
		if((int)(Math.random()*100)>=95){
			damage=critialhit;
		}
		System.out.println("Damage: "+damage);
		return  damage;
	}
	
}

