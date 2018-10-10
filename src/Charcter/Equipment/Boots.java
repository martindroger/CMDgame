package Charcter.Equipment;

public class Boots extends Armor {
	private int speed;
	public Boots(String name, int hp,int requiredLevel,int speed) {
		super(name, hp,requiredLevel);
		this.speed=speed;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Speed: "+speed);
	}
}
