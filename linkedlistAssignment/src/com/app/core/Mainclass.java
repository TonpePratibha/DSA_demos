package com.app.core;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
	
	
	
	
	
	try(Scanner sc=new Scanner(System.in)){
		LinkedList l1=new LinkedList();
 System.out.println("options are 1.insert  data 2.insert data and position 3.display 4.displyreverse using recursion 5.5.displayreverse using stack 6.findmax element 7.findminelement 8.sumofeven 7.countnode ");	
 System.out.println("enter your choice");
 
		
        boolean exit=false;
		while(!exit) {
			switch(sc.nextInt()) {
			case 1:l1.insert(sc.nextInt());
			
				break;
			case 2:  l1.insert(2, 9);
				break;
			case 3:l1.display();
				break;
			case 4:l1.displayReverse(l1.getHead());
				break;
			case 5:l1.displayreverse();
			break;
			case 6:l1.findMaxElement();
				break;
				
			case 8:l1.minelement();
				break;
			case 9:l1.sumofEvenNum();
				break;
			case 10:
				l1.countnode();
				break;
			}
		}
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	}

}
