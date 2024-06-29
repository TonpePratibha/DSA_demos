package com.app.core;

import com.app.core.Node;

public class CircularLinkedlist {
     
	 private Node head;

	    public CircularLinkedlist() {
	        head = null;
	    }

	    public boolean insert(int data) {
	        Node newNode = new Node(data);
	        if (newNode == null) {
	            return false;
	        }

	        if (head == null) {
	            head = newNode;
	            head.setNext(head);
	            return true;
	        }

	        Node last = head;
	        while (last.getNext() != head) {
	            last = last.getNext();
	        }

	        last.setNext(newNode);
	        newNode.setNext(head);
	        return true;
	    }

	    public boolean insert(int data, int position) {
	        if ((head == null && position > 1) || position <= 0) {
	            return false;
	        }

	        Node newNode = new Node(data);

	        if (position == 1) {
	            if (head == null) {
	                head = newNode;
	                head.setNext(head);
	                return true;
	            }

	            Node last = head;
	            while (last.getNext() != head) {
	                last = last.getNext();
	            }

	            newNode.setNext(head);
	            head = newNode;
	            last.setNext(newNode);
	            return true;
	        }

	        Node prev = head;
	        for (int i = 1; i < position - 1; i++) {
	            prev = prev.getNext();
	            if (prev == head) {
	                return false;
	            }
	        }

	        newNode.setNext(prev.getNext());
	        prev.setNext(newNode);
	        return true;
	    }

	    public boolean deleteByVal(int data) {
	        if (head == null) {
	            return false;
	        }

	        if (head.getData() == data) {
	            if (head.getNext() == head) {
	                head = null;
	                return true;
	            }

	            Node last = head;
	            while (last.getNext() != head) {
	                last = last.getNext();
	            }
	            head = head.getNext();
	            last.setNext(head);

	            return true;
	        }

	        Node prev = head, del = head;
	        while (del.getData() != data) {
	            prev = del;
	            del = del.getNext();
	            if (del == head) {
	                return false;
	            }
	        }

	        prev.setNext(del.getNext());
	        return true;
	    }

	    public boolean deleteByPosition(int position) {
	        if (head == null || position <= 0) {
	            return false;
	        }

	        if (position == 1) {
	            if (head.getNext() == head) {
	                head = null;
	                return true;
	            }
	            Node last = head;
	            while (last.getNext() != head) {
	                last = last.getNext();
	            }

	            head = head.getNext();
	            last.setNext(head);

	            return true;
	        }

	        Node prev = head;
	        for(int i = 1; i < position - 1; i++) {
	            prev = prev.getNext();
	            //check if prev referring to last node
	            if(prev.getNext() == head) {
	                return false;
	            }
	        }

	        Node del = prev.getNext();
	        prev.setNext(del.getNext());

	        return true;
	    }

	    public void display() {
	        if (head == null) {
	            return;
	        }
	        Node temp = head;
	        do {
	            System.out.print(temp.getData() + " ");
	            temp = temp.getNext();
	        } while (temp != head);

	        System.out.println();
	    }
	    
		
	    public void findMaxElement() {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        Node temp = head;
	        int max = temp.getData();

	        do {
	            if (temp.getData() > max) {
	                max = temp.getData();
	            }
	            temp = temp.getNext();
	        } while (temp != head);

	        System.out.println("Maximum element in the circular linked list: " + max);
	    }

	    public void minelement() {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        Node temp = head;
	        int min = temp.getData();

	        do {
	            if (temp.getData() < min) {
	                min = temp.getData();
	            }
	            temp = temp.getNext();
	        } while (temp != head);

	        System.out.println("Minimum element in the circular linked list: " + min);
	    }



	


	    public int countnode() {
	        if (head == null) {
	            System.out.println("List is empty");
	            return 0;
	        }

	        Node temp = head;
	        int count = 0;

	        do {
	            count++;
	            temp = temp.getNext();
	        } while (temp != head);

	        System.out.println("Number of nodes in the circular linked list: " + count);
	        return count;
	    }

	    public void removedup() {
	        if (head == null) {
	            return;
	        }

	        Node current = head;

	        // Traverse the list
	        do {
	            Node runner = current;

	            // Inner loop to check for duplicates
	            while (runner.getNext() != current) {
	                if (runner.getNext().getData() == current.getData()) {
	                    // Remove the duplicate node
	                    runner.setNext(runner.getNext().getNext());
	                } else {
	                    runner = runner.getNext();
	                }
	            }

	            current = current.getNext();
	        } while (current != head);
	    }

	    public void sortListAsc() {
	        if (head == null || head.getNext() == head) {
	            return; // No need to sort if list has 0 or 1 element
	        }

	        Node current = head;

	        do {
	            Node min = current;
	            Node index = current.getNext();

	            while (index != head) {
	                if (index.getData() < min.getData()) {
	                    min = index;
	                }
	                index = index.getNext();
	            }

	            // Swap data between current and min if they are different
	            if (min != current) {
	                // Swap data
	                int temp = current.getData();
	                current.setData(min.getData());
	                min.setData(temp);
	            }

	            current = current.getNext();
	        } while (current != head);
	    }

	    
	    public void sortListDesc() {
	        if (head == null || head.getNext() == head) {
	            return; // No need to sort if list has 0 or 1 element
	        }

	        Node current = head;

	        do {
	            Node max = current;
	            Node index = current.getNext();

	            while (index != head) {
	                if (index.getData() > max.getData()) {
	                    max = index;
	                }
	                index = index.getNext();
	            }

	            // Swap data between current and max if they are different
	            if (max != current) {
	                // Swap data
	                int temp = current.getData();
	                current.setData(max.getData());
	                max.setData(temp);
	            }

	            current = current.getNext();
	        } while (current != head);
	    }

	    public boolean search(int key) {
	        if (head == null) {
	            return false; // List is empty
	        }

	        Node current = head;

	        // Traverse the circular linked list until we reach the head again
	        do {
	            if (current.getData() == key) {
	                return true; // Element found
	            }
	            current = current.getNext();
	        } while (current != head);

	        return false; // Element not found
	    }
	
	
}
