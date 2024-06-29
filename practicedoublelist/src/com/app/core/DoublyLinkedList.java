package com.app.core;

public class DoublyLinkedList {

	private Node head;

	public DoublyLinkedList() {

		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insert(int data) {
		Node newnode = new Node(data);
		if (newnode == null) {
			return false;

		}

		if (head == null) {
			head = newnode;

			return true;
		}
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();

		}
		temp.setNext(newnode);
		newnode.setPrev(temp);

		return true;
	}

	public boolean insertbypos(int data, int position) {

		Node newnode = new Node(data);
		if (newnode == null) {
			return false;
		}
		if ((head == null && position > 1) || position <= 0) {
			return false;
		}
		if(position==1) {
		if (head != null) 
			{
				newnode.setNext(head);
				head.setPrev(newnode);
			}
			head = newnode;
			return true;
		
		}

		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if(prev==null) {
				return false;
			}
		} 
		
		Node nextnode=prev.getNext();   
		newnode.setPrev(prev);    
		if(nextnode!=null) {
			newnode.setNext(nextnode);
			nextnode.setPrev(newnode);
		}
		prev.setNext(newnode);
		
           
		return true;
	}

	public void display() {
		Node temp = head;
		if (head == null) {
			return;
		}

		while (temp != null) {
			System.out.println(temp.getData() + " ");
			temp = temp.getNext();
		}

	}
	
	public boolean deletebyvalue(int data) {
		
		if(head==null) {
			return false;
		}
		
		if(head.getData()==data) {
			head=head.getNext();
			return true;
		}
		Node temp=head;
		while(temp.getData()!=data) {
			temp=temp.getNext();
			if(temp==null) {
				return false;
			}
		}
		Node prev=temp.getPrev();
		Node next=temp.getNext();
		
		prev.setNext(next);
		next.setPrev(prev);
		
		
		
		
		
		return true;
	}
	
	
	public boolean deletbypos(int position) {
		if(head==null ||position<=0){
			return false;
		}
		if(position==1) {
			head=head.getNext();
			if(head!=null) {
				head.setPrev(null);
			}
			
			return true;
		}
		
		Node del=head;
		for(int i=1;i<position;i++) {
			del=del.getNext();
			if(del==null) {
				return false;
			}
			
			
		}
		Node prev=del.getPrev();
		Node next=del.getNext();
		
		prev.setNext(next);
		if(next!=null) {
			next.setPrev(prev);
		}
		
		return true;
	}
	
	
	public void removedup() {
		if(head==null) {
			return ;
		}
		Node curr=head;
		while(curr!=null) {
			Node runner=curr;
			
			while(runner.getNext()!=null) {
				
				if(runner.getNext().getData()==curr.getData()) {
					Node duplicate=runner.getNext();
					runner.setNext(duplicate.getNext());
					if(duplicate.getNext()!=null) {
						duplicate.getNext().setPrev(runner);
					}
					
				}
				else {
					runner=runner.getNext();
				}
			}
			curr=curr.getNext();
		}
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
	            // Swap data
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
	        Node index = current.getNext();

	        while (index != null) {
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
	    }
	}

	
	
	   public boolean search(int key) {
	        Node current = head;

	        // Traverse forwards from the head
	        while (current != null) {
	            if (current.getData() == key) {
	                return true; // Element found
	            }
	            current = current.getNext();
	        }

	        return false; // Element not found
	    }
	
	
	

}
