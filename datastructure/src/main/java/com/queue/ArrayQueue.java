package com.queue;

public class ArrayQueue {
	
	
	public int Queue [];
	
	int front,rear,queuesize,len;
	
	public ArrayQueue(int n){
		
		queuesize = n;
		len = 0;
		front = -1	;
		rear = -1;
		Queue = new int[queuesize];
	}
	
	public boolean isEmpty(){
		
		if(front == -1)
			return true;
		return false;
	}
	
	
	public boolean isFull() 
    {
        return front==0 && rear == queuesize -1 ;
    } 
	
	public int peek() throws Exception{
		
		if(isEmpty())
			throw new Exception("Queue is empty");
		return Queue[front];
	}
	
	
	public void queueInsert(int data) throws Exception{
		
		
		if(rear == -1){
			
			front =0;
			rear = 0;
			Queue[rear] = data;
		}else if( rear + 1 >= queuesize){
			throw new IndexOutOfBoundsException("Queue Overflow");
			
		}else if(rear + 1 < queuesize){
			
			Queue[++rear] = data;
		}
		len++;
		
		
	}
	
	public int queueremove(){
		
		len--;
		int element = Queue[front];
		if(front == rear){
			
			front = -1;
			rear = -1;
		}else{
			front++;
			
		}
		return element;
	}
	
	
	
	public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(Queue[i]+" ");
        System.out.println();        
    }
	

	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
