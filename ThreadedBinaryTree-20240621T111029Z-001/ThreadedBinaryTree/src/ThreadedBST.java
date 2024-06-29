public class ThreadedBST {

    private Node root;

    public ThreadedBST() {
        root = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(root == null) {
            root = newNode;
            return true;
        }

        Node parent = root;
        while(true) {
            if(parent.getData() == data) {
                return false;
            }

            if(data < parent.getData()) {
                //to left
                if(parent.getlFlag() == 'T') {
                    //parent does not have a left child, so newnode will become the left child of the parent
                    newNode.setRight(parent);
                    newNode.setLeft(parent.getLeft());
                    parent.setLeft(newNode);
                    parent.setlFlag('L');
                    return true;

                }
                parent = parent.getLeft();
            }
            else {
                //right
                if(parent.getrFlag() == 'T') {
                    //new node become the right child of parent
                      newNode.setLeft(parent);  //thread
                      newNode.setRight(parent.getRight());
                      parent.setRight(newNode);
                      parent.setrFlag('L');
                      return true;
                }
                parent = parent.getRight();
            }
        }
    }

    public void inOrder() {
        System.out.println("Inorder: ");
        Node temp = root;
        char flag = 'L';

        while(temp != null) {
            while(temp.getlFlag() == 'L' && flag == 'L') {
                temp = temp.getLeft();
            }

            System.out.print(temp.getData() + " ");
            flag = temp.getrFlag();
            temp = temp.getRight();
        }
        System.out.println();
    }
    
    
    public void preOrder() {
    	Node temp=root;
    	char flag='L';
    	while(temp!=null) {
    		while(temp.getlFlag()=='L' && flag=='L') {
    			System.out.println(temp.getData()+"");
    			temp=temp.getLeft();
    		}
    		if(flag=='L') {
    			System.out.println(temp.getData()+" ");
    			
    		}
    		
    		flag=temp.getlFlag();
    		temp=temp.getRight();
    	}
    	System.out.println();
    }
    
   public void postOrder() {
	   Node temp=root;
	   char flag='L';
	   
	   System.out.println("postorder");
	   
	   while(temp!=null) {
		   while(temp.getlFlag()=='L'&& flag=='L') {
			   temp=temp.getLeft();
		   }
		   flag=temp.getrFlag();
		   if(flag=='L') {
			   temp=temp.getRight();
		   }
		   else {
			   while(true) {
				   System.out.println(temp.getData()+"");
				   if(isRightChild(temp)) {
					   while(temp.getlFlag()=='L') {
						   temp=temp.getLeft();
					   }
					   temp=temp.getLeft();
				   }
				   else {
					   while(temp.getrFlag()=='L') {
						   temp=temp.getRight();
					   }
					   temp=temp.getRight();
					   break;
				   }
				   
				   
			   }
		   }
	   }
	   System.out.println();
	   }
   
    private boolean isRightChild(Node node) {
    	if(node==root) {
    		return false;
    	}
    	Node temp=root;
    	while(true) {
    		if(node.getData()<temp.getData()) {
    			temp=temp.getLeft();
    			if(temp==node) {
    				return false;
    			}
    		}
    		else {
    			temp=temp.getRight();
    			if(temp==node) {
    				return true;
    			}
    		}
    	}
    }
    
    
    public boolean delete(int data) {
    	if(root==null) {
    		return false;
    	}
    	Node parent=root;
    	Node del=root;
    	while(true) {
    		if(del.getData()==data) {
    			break;
    		}
    		parent=del;
    		if(data<del.getData()) {
    			if(del.getlFlag()=='T') {
    				return false;
    			}
    			del=del.getLeft();
    		}
    		else {
    			if(del.getrFlag()=='T') {
    				return false;
    			}
    			del=del.getRight();
    		}
    	}
    	
    	while(true) {
    		if(del.getlFlag()=='T' && del.getrFlag()=='T') {
    			if(del==root) {
    				root=null;
    				return true;
    			}
    			
    			if(parent.getLeft()==del)
    			{
    				parent.setLeft(del.getLeft());
    				parent.setlFlag('T');
    			}
    			else {
    				parent.setRight(del.getRight());
    				parent.setrFlag('T');
    			}
    			return true;
    		}
    		if(del.getlFlag()=='L') {
    			Node max=del.getLeft();
    			parent=del;
    			while(max.getrFlag()=='L') {
    				parent=max;
    				max=max.getRight();
    			}
    			int temp=del.getData();
    			del.setData(max.getData());
    			max.setData(temp);
    			del=max;
    		}
    		else {
    			Node min=del.getRight();
    			parent=del;
    			while(min.getlFlag()=='L') {
    				parent=min;
    				min=min.getLeft();
    			}
    			
    			int temp=del.getData();
    			del.setData(min.getData());
    			min.setData(temp);
    			del=min;
    			
    		}
    		
    		
    		
    		
    	}
    }
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

