package Charcter;

import Charcter.Equipment.Backpack;
import Charcter.Equipment.Equipment;
import Charcter.Equipment.Equipment;

public class Player {
	private boolean alive;
	private String name;
	private int age;
	private Gender gender;
	private Species species;
	private int health;
	private int xp;
	private int level;
	private Equipment equipment;
	private Backpack backpack;
	
	public Player() {
		health=100;
		alive=true;
		level=0;
		xp=0;
	}
	public void print(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Species: "+species);
		System.out.println("Health: "+health);
		System.out.println("Level: "+level);
		System.out.println("XP: "+xp);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Species getSpecies() {
		return species;
	}
	public void setSpecies(Species species) {
		this.species = species;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public Backpack getBackpack() {
		return backpack;
	}
	public void setBackpack(Backpack backpack) {
		this.backpack = backpack;
	}
}