	package com.study.datastructures;

public class LinkedList<E> {
	private class Node{
		public E e;
		public Node next;
		
		public Node(E e, Node next) {
			//super();
			this.e = e;
			this.next = next;
		}
		
		public Node(E e){
			this(e,null);
		}
		
		public Node(){
			this(null,null);
		}

		@Override
		public String toString() {
			return e.toString();
		}
	
	}
	
	private Node dummyHead;
	int size;
	
	public LinkedList(){
		dummyHead=new Node(null,null);
		size=0;
	}
	//获取链表中元素的个数
	public int getSize(){
		return size;
	}
	//返回链表是否为空
	public boolean isEmpty(){
		return size==0;
	}
	
	//在链表头添加新的元素e
//	public void addFirst(E e){
////		Node node=new Noed(e);
////		node.next=head;
////		head=node;
//		
//		head=new Node(e,head);
//		size++;
//	}	
	
	//在链表的index位置添加新的元素
	public void add(int index,E e){
		
		if(index<0||index>size){
			throw new IllegalArgumentException("Add Fail");
		}
		
			Node prev=dummyHead;
			for(int i=0;i<index;i++){
				prev=prev.next;
				prev.next=new Node(e,prev.next);
				size++;
			}
			
		}
		
	//在链表的头添加
		public void addFirst(E e){
			add(0,e);
		}
	
	//在链表的末尾添加
	public void addLast(E e){
		add(size,e);
	}
	
	public E get(int index){
		if(index<0||index>size){
			throw new IllegalArgumentException("Add Fail");
		}
		
		Node cur=dummyHead.next;
		for(int i=0;i<index;i++){
			cur=cur.next;
		}
		return cur.e;
	}
	
	public E getFirst(){
		return get(0);
	}
	
	public E getLast(){
		return get(size-1);
	}
	//修改
	public void set(int index,E e){
		if(index<0||index>size){
			throw new IllegalArgumentException("set Fail");
		}
		Node cur=dummyHead.next;
		for(int i=0;i<index;i++){
			cur=cur.next;
			cur.e=e;
		}
	}
	//查找
	public boolean contains(E e){
		Node cur=dummyHead.next;
	    while(cur!=null){
	    	if(cur.e.equals(e))
	    		return true;
	    	cur=cur.next;
	    }
	    return false;
	}
	
	//删除
	public E remove(int index){
		if(index<0||index>size){
			throw new IllegalArgumentException("set Fail");
		}
		Node prev=dummyHead;
		for(int i=0;i<index;i++){
			prev=prev.next;
		}
		Node retNode=prev.next;
		prev.next=retNode.next;
		retNode.next=null;
		size--;
		return retNode.e;
	}
	
	@Override
	public String toString() {
		StringBuilder res =new StringBuilder();
		Node cur=dummyHead.next;
		while(cur!=null){
			res.append(cur+"-->");
			cur=cur.next;
		}
		res.append("NULL");
		
		return res.toString();
    }
	
	
	
}
