package com.app.core;

public class Main {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.insert(89);
		l1.insert(89);
		l1.insert(89);
		l1.insert(45,2);
		l1.insert(93);
		l1.insert(78);
		l1.insert(400);
		l1.insert(100);
		l1.insert(300);
		l1.display();
		
		l1.findMaxElement();
		l1.minelement();
//		System.out.println("mid element is");
//		l1.midelemet();
//		System.out.println();
////l1.removedup();
////l1.display();
//
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//
//l1.addelemMid(23);
//l1.display();
//
//System.out.println("after sorting");
//l1.sortlist();
//l1.display();
//System.out.println("after removing duplictes");
//l1.removeDuplicates();
////l1.removedup();
//l1.display();
//System.out.println("remove nth eleemnt from last");
//l1.nthelement(6);
//l1.display();
//
//l1.findThirdElem();
//
//
//
//LinkedList l2=new LinkedList();
//l2.insert(5);
//l2.insert(6);
//l2.insert(7);
//l2.insert(8);
//l2.insert(9);
//l1.mergelist(l2);
//l1.display();
		l1.sortList();
		l1.display();
		l1.sortListDesc();
		l1.display();
		l1.search(78);
		System.out.println(l1.search(400));
		 System.out.println(l1.binarySearch(400));
		
		
	}

}
