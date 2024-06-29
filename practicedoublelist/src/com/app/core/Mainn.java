package com.app.core;

public class Mainn {

	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.insert(45);
		dll.insert(58);
		dll.insert(89);
		dll.insert(23);
		dll.insert(23);
		dll.insert(23);
		dll.insert(90);
		dll.insert(56);
		dll.insert(43);
		dll.display();
		dll.insertbypos(2, 12);
		dll.insertbypos(4, 12);
		dll.insertbypos(1, 56);
		dll.display();
//System.out.println("delete by valeu");
//		dll.deletebyvalue(45);
//		dll.display();
		System.out.println("delete by pos");	
		
		dll.deletbypos(3);
		dll.display();
		
		System.out.println("remove dup");
		dll.removedup();
		dll.display();
		
		
		
		dll.countnode();
		dll.findMaxElement();dll.minelement();
		
		dll.sortList();
		dll.display();
		System.out.println("in desc");
		dll.sortListDesc();
		dll.display();
		
		
		System.out.println(	dll.search(569));
		dll.search(569);
		
	}

}
