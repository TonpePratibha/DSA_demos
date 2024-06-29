package com.app.core;

import java.util.Stack;

public class LinkedList {
private Node head;
public LinkedList() {
	head=null;
}

public Node getHead() {
	return head;
}

public boolean insert(int data) 
{
	//initile node
	Node newnode=new Node(data);
	if(newnode==null) {
		return false;         //check if node is null
	}
	if(head==null) {
		head=newnode;
		return true;                 //hif list is empty put newnode into it
	}
	
	Node temp=head;                   //put head into temp
//	if(temp.getData()==data) {             //chck for duplicate data and return false;
//		return false;                 
//	}
	while(temp.getNext()!=null) {
		temp=temp.getNext();                    //check for next nodes present or not
//		if(temp.getData()==data) {                 
//			return false;
//		}
	}
	temp.setNext(newnode);
return true;		
}

public void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.getData()+" ");
		temp=temp.getNext();
	}
	System.out.println("");
}

public boolean insert(int data,int position) {
	if(position<=0 ||(head==null && position>1)) {  //jr postion negative asel ,jrlist empty asel ani postion 2 diliy tr false nahi inseert akru shakat 
		return false;
	}
	
	Node newNode=new Node(data);
	if(newNode==null)
	{
		return false;
	}
	if(position==1) {
		newNode.setNext(head);
		head=newNode;
		return true;
		
	}
	Node prev=head;
	for(int i=1;i<position-1;i++) {
		prev=prev.getNext();
		if(prev==null) {
			return false;
		}
	}
	newNode.setNext(prev.getNext());
	prev.setNext(newNode);
	return true;
	
	
	

			
			
}

public void displayReverse(Node temp) {
	if(temp==null) {
		return;
	}
	displayReverse(temp.getNext());
	System.out.println(temp.getData()+"  ");
}


public void displayreverse() {
	Stack<Node> s=new Stack<Node>();
	Node temp=head;	
	while(temp!=null) {
		s.push(temp);
		temp=temp.getNext();
	}
	while(!s.isEmpty()) {
		System.out.println(s.pop().getData()+" ");
		
	}
	System.out.println();
	
}
public void findMaxElement() {
	Node temp=head;
	 int max=temp.getData();
	 
	 while(temp!=null)	{	 
	  if(max<temp.getData()) {
		max=temp.getData();	
	}
	  
	  
	temp=temp.getNext();
	}
	 
	 System.out.println(max);
	 
}

public void minelement() {
	Node temp=head;
	int min=temp.getData();
	while(temp!=null) {
		if(min>temp.getData()) {
			min=temp.getData();
			
		}
		temp=temp.getNext();
	}
	System.out.println("min element is   \n"+ min);
}


public void sumofEvenNum() {
	Node temp=head;
	int sum=0;
	while(temp!=null) {
		if(temp.getData()%2==0) {
			sum+=temp.getData();
		}
		temp=temp.getNext();
	}
	System.out.println("sum of even numbers is \n"+sum);
}


public int countnode() {
	Node temp=head;
	int count=0;
	while(temp!=null) {
		count++;
		temp=temp.getNext();
	}
	System.out.println(count);
	return count;
}
 public void midelemet() {   //findmiddleelement
	 if(head==null) {
			
		return ;                 //hif list is empty put newnode into it
		}
	 Node prevptr=head;
	 Node nextptr=head;
	 while(nextptr!=null && nextptr.getNext()!=null) {
		 nextptr=nextptr.getNext().getNext();
		 prevptr=prevptr.getNext();
		 
	 }
	 
	 System.out.println(prevptr.getData());
 }
 
// public Node reverse(Node head) {
//	 Node curr=head;
//	 Node prev=null;
//	 while(curr!=null) {
//		 Node next=curr.getNext();
//		 curr.getNext()=prev;
//		 prev=curr;
//		 curr=next;
//	 }
//	 return prev;
// }
  
 public void addelemMid(int data) {
	 if(head==null) {
		 return;
	 }
	 
	 Node midPrev=null;
	 Node prevptr=head;
	 Node nextptr=head;
	 while(nextptr!=null &&nextptr.getNext()!=null) {
		 
		 nextptr=nextptr.getNext().getNext();
		 midPrev=prevptr;
		 prevptr=prevptr.getNext();
	 }
	 
	 Node newnode=new Node(data);
//	 for(int i=0;i<)
	 if(newnode!=null) {
		 
//		 newnode.setNext(prevptr.getNext());
//	prevptr.setNext(newnode);
	 newnode.setNext(prevptr);
     midPrev.setNext(newnode);	
	 }
		
		
			
	 
	 
	 
 }
 
 

 
 public void sortList() {
	    if (head == null || head.getNext() == null) {
	        return; // No need to sort if list has 0 or 1 element
	    }

	    Node current = head;

	    while (current != null) {
	        Node min = current;
	        Node runner = current.getNext();

	        while (runner != null) {
	            if (runner.getData() < min.getData()) {
	                min = runner;
	            }
	           runner = runner.getNext();
	        }

	        // Swap data between current and min if they are different
	        if (min != current) {
	            int temp = current.getData();
	            current.setData(min.getData());
	            min.setData(temp);
	        }

	        current = current.getNext();
	    }
	}

 public void sortListDesc() {
	    if (head == null || head.getNext() == null) {
	        return; // No need to sort if list has 0 or 1 element
	    }

	    Node current = head;

	    while (current != null) {
	        Node max = current;
	        Node runner = current.getNext();

	        while (runner != null) {
	            if (runner.getData() > max.getData()) {
	                max = runner;
	            }
	           runner = runner.getNext();
	        }

	        // Swap data between current and max if they are different
	        if (max != current) {
	            int temp = current.getData();
	            current.setData(max.getData());
	            max.setData(temp);
	        }

	        current = current.getNext();
	    }
	}

 public boolean search(int key) {
     Node current = head;

     // Traverse the list until we reach the end or find the element
     while (current != null) {
         if (current.getData() == key) {
             return true; // Element found
         }
         current = current.getNext();
     }

     return false; // Element not found
 }
 
 
 //remove nth node from end of lll
 
 public void nthelement(int position) {
	 
	
	 int count=countnode();
	 if(head==null) {
		 return;
	 }
	 Node temp=head;
	 Node prev=head;
	 for(int i=1;i<count-(position-1);i++) {
		 prev=temp;
		 temp=temp.getNext();
	 }
	 prev.setNext(temp.getNext());
	 
	 
 }
 
 //find 3rd node from end in sll
 public void findThirdElem() {          
	 Node temp=head;
	 int count=countnode();
	 
	 if(count<3) {            
		 return;
	 }
	 for(int i=1;i<count-2;i++) {
		 temp=temp.getNext();
	 }
	 System.out.println("third element is"+temp.getData());
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 

 
//remove dup from unsorted list
 public Node removeDuplicates() {
	    if (head == null) {
	        return null;
	    }
	    
	    Node curr = head;
	    
	    while (curr != null) {
	        Node runner = curr;
	        
	        // Remove all nodes with same value as current node
	        while (runner.getNext() != null) {
	        	
	            if (runner.getNext().getData() == curr.getData()) {
	                runner.setNext(runner.getNext().getNext());
	            } else {
	                runner = runner.getNext();
	            }
	        }
	        
	        curr = curr.getNext();  // Move to the next distinct element
	    }
	    
	    return head;
	}


 
 
 
//	1.Java Program To Merge A Linked List Into Another Linked List At Alternate Positions ..
//	10.How to merge two sorted linked list? ..
 
 public void mergelist(LinkedList l2) {
	 Node p_curr=head,q_curr=l2.head;
	 Node p_next,q_next;
	 
	 while(p_curr!=null && q_curr!=null) {
		 p_next=p_curr.getNext();
		 q_next=q_curr.getNext();
		 
		 if(p_next!=null) {
			 q_curr.setNext(p_next);
		 }
		 p_curr.setNext(q_curr);
		 
		 
		 p_curr=p_next;
		 q_curr=q_next;
		 
		 
	 }
 }
 
 


 // Method to perform binary search on the singly linked list
 public boolean binarySearch(int key) {
     if (head == null) {
         return false; // List is empty
     }

     Node left = head;
     Node right = null;
     Node middle = null;

     // Finding the end of the list to set the 'right' pointer
     Node current = head;
     while (current.getNext() != null) {
         current = current.getNext();
     }
     right = current;

     while (left != right && left.getNext() != right) {
         middle = findMiddle(left, right);
         if (middle.getData() == key) {
             return true;
         } else if (key < middle.getData()) {
             right = middle;
         } else {
             left = middle.getNext();
         }
     }

     // Check if the key is at the remaining 'left' or 'right' node
     return (left.getData() == key || (right != null && right.getData() == key));
 }

 // Helper method to find the middle node between 'left' and 'right'
 private Node findMiddle(Node left, Node right) {
     if (left == null) {
         return null;
     }

     Node slow = left;
     Node fast = left.getNext();

     while (fast != right && fast != null) {
         fast = fast.getNext();
         if (fast != right) {
             slow = slow.getNext();
             fast = fast.getNext();
         }
     }

     return slow;
 }
 
 
 
}
