import Charcter.Equipment.Backpack;
import Charcter.Equipment.Equipment;
import Charcter.Gender;
import Charcter.Player;
import Charcter.Species;

import java.util.Scanner;

public class Game {
	public static void main(String[]args){
		Scanner msg=new Scanner(System.in);
		Player player=new Player();
		Equipment equipment=new Equipment(null,null,null,null,null);
		Backpack backpack=new Backpack(10);
		player.setEquipment(equipment);
		player.setBackpack(backpack);
		intro(msg,player);
		while (player.isAlive()){
			System.out.println();
			System.out.println("What to do next?");
			System.out.println();
			try {
				Choice next = Choice.valueOf(msg.next());
				switch (next) {
					case status:
						player.print();
						break;
					case help:
						helpmenu();
						break;
					case kill:
						player.setAlive(false);
						break;
					case equipment:
						player.getEquipment().print();
						break;
					case backpack:
						player.getBackpack().print();
						
						backpack.backpackMenu(msg);
				}
			}catch (IllegalArgumentException e){
				System.out.println("This is not a valid input please type help for list of possible commands");
			}
			
			
		}
		System.out.println("You are dead, the game has ended");
		
		
		
	}
	
	public static void intro(Scanner msg, Player player){
		System.out.println("Welcome,traveller.");
		int i=0;
		while(i==0) {
			
			System.out.println("Please enter your name");
			player.setName(msg.next());
			System.out.println("Please enter your age");
			player.setAge(Integer.parseInt(msg.next()));
			System.out.println("Please your gender");
			player.setGender(Gender.valueOf(msg.next()));
			System.out.println("Please enter your speices");
			player.setSpecies(Species.valueOf(msg.next()));
			System.out.println();
			System.out.println();
			System.out.println("Hello " + player.getName());
			System.out.println("You are " + player.getAge() + " years old");
			System.out.println("Your gender is " + player.getGender().toString());
			System.out.println("Your speices is " + player.getSpecies().toString());
			System.out.println("Is the infomation correct? yes/no");
			if((Choice.valueOf(msg.next())==Choice.yes)){
				i=1;
				
				
			}
			else{
				System.out.println("Please try again");
				System.out.println();
			}
			
		}
		
	}
	public static void helpmenu(){
		System.out.println("Help menu");
		System.out.println("------------------------------------------------------------");
		System.out.println("equipment : Gives you a list of things curretly equipped");
		System.out.println("help      : Gives this list");
		System.out.println("kill      : Kill yourself, will end the game");
		System.out.println("status    : Gives the status of your player");
		System.out.println("------------------------------------------------------------");
	}
}
