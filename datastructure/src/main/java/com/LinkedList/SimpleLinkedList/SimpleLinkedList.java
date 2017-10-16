package com.LinkedList.SimpleLinkedList;

public class SimpleLinkedList {
	
	
	
	public Node startNode;
	
	public Node endNode ;
	
	public int size;
	
	public SimpleLinkedList(){
		
		startNode = null;
		endNode = null;
		size = 0;
		
	}
	
	 public boolean isEmpty() {
	        return startNode == null;
	 }
	  
	 public int getSize(){
	        return size;
	}  
	
	 //Insert At First
	public void insertAtStart(int data){
		
		Node newNode = new Node(data,null);
		size++;
		
		
		if(startNode == null){
			startNode = newNode;
			endNode = startNode;
			
		}else{
			newNode.setLink(startNode);
			startNode = newNode;
		}
	}
	//Insert At last
	
	public void insertAtLast(int data){
		
		Node newNode = new Node(data, null);
		size++;
		
		 if(startNode == null) 
	        {
			 startNode = newNode;
			 endNode = startNode;
	        }
	        else 
	        {
	        	endNode.setLink(newNode);
	        	endNode = newNode;
	        }
		
	}
	
	//Insert at position
	
	public void insertAtPOS(int data, int pos){
		
		Node newNode = new Node(data, null);
		
		pos = pos - 1 ;
		
		Node ptr = startNode;
		
		for(int i = 1 ; i < size ; i++){
			
			if(i == pos){
				
				Node tempNode = ptr.getLink();
				ptr.setLink(newNode);
				newNode.setLink(tempNode);
				break;
			}
			
			ptr = ptr.getLink();
			
		}
		size++;
		
	}
	
	//delete at postion
	
public void deleteAtPOS(int pos){
		
		//Node newNode = new Node(data, null);
		
		
		
		Node ptr = startNode;
		
		if(pos == 1){
			
			startNode = startNode.getLink();
			size--;
			return;
		}
		
		
		if(pos == size){
			
			Node s = startNode;
			Node t = startNode;
			
			while(s != endNode){
				t = s;
				s = s.getLink();
				
				
			}
			t.setLink(null);
			endNode = t;
			size--;
			return;
			
		}
		
		pos = pos - 1 ;
		for(int i = 1 ; i < size ; i++){
			
			if(i == pos){
				
				Node tempNode = ptr.getLink();
				
				Node nextNode = tempNode.getLink();
				
				ptr.setLink(nextNode);
				break;
			}
			
			ptr = ptr.getLink();
			
		}
		size--;
		
	}


	public void display()
	{
	    System.out.print("\nSingly Linked List = ");
	    
	    if (size == 0) {
	        System.out.print("empty\n");
	        return;
	    }    
	    
	    if (startNode.getLink() == null) {
	        System.out.println(startNode.getData() );
	        return;
	    }
	    
	    Node ptr = startNode;
	    System.out.print(startNode.getData()+ "->");
	    
	    ptr = startNode.getLink();
	    
	    System.out.println(ptr.getLink());
	    
	    while (ptr.getLink() != null){
	        System.out.print(ptr.getData()+ "->");
	        ptr = ptr.getLink();
	    }
	    System.out.print(ptr.getData()+ "\n");
	}

	
	
}
