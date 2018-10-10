package Charcter.Equipment;


public class Equipment {
	private Weapon weapon;
	private Hat hat;
	private Shirt shirt;
	private Pants pants;
	private Boots boots;
	
	
	public Equipment(Weapon weapon,Hat hat,Shirt shirt,Pants pants,Boots boots){
		this.weapon=weapon;
		this.hat=hat;
		this.shirt=shirt;
		this.pants=pants;
		this.boots=boots;
		
	}
	public void print(){
		System.out.println("Weapon");
		if (weapon == null) {
			System.out.println("No weapon equipped");
		} else {
			weapon.print();
		}
		System.out.println("Hat");
		if (hat == null) {
			System.out.println("No hat equipped");
		} else {
			hat.print();
		}
		System.out.println("Shirt");
		if (shirt == null) {
			System.out.println("No shirt equipped");
		} else {
			shirt.print();
		}
		System.out.println("Pants");
		if (pants == null) {
			System.out.println("No pants equipped");
		} else {
			pants.print();
		}
		System.out.println("Boots");
		if (boots == null) {
			System.out.println("No boots equipped");
		} else {
			boots.print();
		}
	}
}
