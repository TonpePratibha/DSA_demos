package com.app.core;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedlist cll = new CircularLinkedlist();

        cll.display();

        cll.insert(10);
        cll.display();
        cll.insert(20);
        cll.display();
        cll.insert(30);
        cll.display();
        cll.insert(40);
        cll.display();
        cll.insert(50);
        cll.insert(50);
        cll.insert(50);
        cll.display();

        cll.insert(60, 1);
        cll.display();
        cll.insert(70, 4);
        cll.display();
        cll.insert(80, 8);
        cll.display();
        cll.insert(90, 12);
        cll.display();

        cll.deleteByPosition(1);
        cll.display();
        cll.deleteByPosition(4);
        cll.display();
        cll.deleteByPosition(6);
        cll.display();
        cll.deleteByPosition(6);
        cll.display();

        
        
        
        
        
        cll.countnode();
        cll.minelement();
        cll.findMaxElement();
        
        cll.removedup();
        cll.display();
        
        cll.sortListAsc();
        cll.display();
        System.out.println("in desc");
        cll.sortListDesc();
        cll.display();
        
        System.out.println(cll.search(40));
	}

}
