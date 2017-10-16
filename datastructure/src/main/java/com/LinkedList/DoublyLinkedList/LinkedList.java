package com.LinkedList.DoublyLinkedList;

public class LinkedList {
	
	public Node startNode;
	
	public Node endNode;
	
	public int size;
	
	
	public LinkedList(){
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
	 
	 public void insertAtStart(int data){
		 
		 Node newNode = new Node(data,null,null);
		 
		if(startNode == null){
			
			startNode = newNode;
			endNode = startNode;
			
		}else{
			
			
			
			startNode.setPrevNode(newNode);
			newNode.setNextNode(startNode);
			startNode =  newNode; 
		}
		size++;
		 
	 }
	 
	 public void insertAtLast(int data){
		 
		 Node newNode = new Node(data,null,null);
		 
			if(startNode == null){
				
				startNode = newNode;
				endNode = newNode;
				
			}else{
				newNode.setPrevNode(endNode);
				endNode.setNextNode(newNode);
				endNode =  newNode; 
			}
			size++;
			
			
		System.out.println("Enter at Last = "+endNode.getData()); 
	 }
	 
	 
	public void displayForward(){
		
		if (size == 0) {
	        System.out.print("empty\n");
	        return;
	    }  
		if(startNode.getNextNode() == null ){
			
			System.out.println("Node 1 : "+ startNode.getData());
			return;
		}
		
			
		Node disNode = startNode;
		System.out.print("Node 2: " + startNode.getData() +"<-->");
			
		disNode = startNode.getNextNode();
		while(disNode.getNextNode() != null){
		
			System.out.print(disNode.getData() +"<--> " );
			disNode = disNode.getNextNode();
		}
		 System.out.print(disNode.getData()+ "\n");
	}
	
	
	public void insterAtPOS(int data, int pos){
		
		
		Node newNode = new Node(data,null,null);
		
		if(pos == 1){
			
			insertAtStart(data);
			return;
			
		}
		
		//pos = pos - 1;
		
		Node ptr = startNode;
		
		for(int i =2 ;i <= size; i++){
			
			if(i == pos){
				System.out.println("1111111111111");
			
				Node temp = ptr.getNextNode();
				
				ptr.setNextNode(newNode);
				newNode.setPrevNode(ptr);
				newNode.setNextNode(temp);
				temp.setPrevNode(newNode);
				break;
			}
			ptr = ptr.getNextNode();
		}
		
		size++;
		
		
	}
	
public void deleteAtPOS( int pos){
		
		
		
		
		if(pos == 1){
			if(size ==1){
				
				startNode = null;
				endNode = null;
				size--;
				return;
				
			}
			
			startNode = startNode.getNextNode();
			startNode.setPrevNode(null);
			size--;
			return;
		}
		
		if(pos == size){
			
			endNode = endNode.getPrevNode();
			endNode.setNextNode(null);
			size--;
			return;
			
		}
		
		//pos = pos - 1;
		
		Node ptr = startNode.getNextNode();
		
		for(int i =2 ;i <= size; i++){
			
			if(i == pos){
				
			   
				Node temp = ptr.getNextNode();
				Node prevNode = ptr.getPrevNode();
				
				prevNode.setNextNode(temp);		
				temp.setPrevNode(prevNode);
				
				break;
			}
			ptr = ptr.getNextNode();
		}
		
		size--;
		
		
	}
	

}
