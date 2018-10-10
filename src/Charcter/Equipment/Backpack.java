package Charcter.Equipment;

import java.util.LinkedList;
import java.util.Scanner;

public class Backpack {
	private int size;
	private LinkedList<Printer> storage;
	public Backpack(int size){
		this.size=size;
		storage=new LinkedList <>();
	}
	
	public void add(Printer object){
		if(storage.size()<=size){
			System.out.println("Your backpack is full");
		}else{
			System.out.println("Item added to your backpack");
		}
	}
	public Printer get(int i){
		return storage.get(i);
	}
	
	public void remove(int i){
		Printer p = storage.remove(i);
		System.out.println("The item has been removed");
	}
	
	
	
	public void print(){
		System.out.println("Backpack");
		System.out.println("Size: "+ size);
		System.out.println("Free Spaces: "+(size-storage.size()));
		if(!storage.isEmpty()) {
			int i=0;
			for (Printer p : storage) {
				System.out.println("Index: "+i);
				p.print();
				i++;
			}
		}else {
			System.out.println("Your backpack is empty");
		}
	}
	
	
	public void backpackMenu(Scanner msg){
		int i=0;
		while(i==0) {
			try {
				System.out.println("What do you want to do?");
				BackpackChoice next = BackpackChoice.valueOf(msg.next());
				switch (next) {
					case remove:
						System.out.println("Type the index of the item you want to remove");
						int temp = msg.nextInt();
						System.out.println("Are you sure?");
						if (BackpackChoice.valueOf(msg.next()) == BackpackChoice.yes) {
							remove(temp);
						}
						break;
					case close:
						i = 1;
						break;
					case help:
						System.out.println("Backpack helpmenu");
						System.out.println("------------------------------------------------------------");
						System.out.println("close     : closes the backpack");
						System.out.println("help      : opens this menu");
						System.out.println("remove    : removes an item from the backpack");
						System.out.println("------------------------------------------------------------");
						break;
				}
			}catch (IllegalArgumentException e){
				System.out.println("Not a valid input");
			}catch (IndexOutOfBoundsException e){
				System.out.println("There is no item at the chosen index");
			}
		}
	}
	
}
