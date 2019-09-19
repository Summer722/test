package com.study.hashset;

public class Student {
	
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		/**
		 * 当hashcode 方法永远返回整数1是，所有对象的hash值都是一样的
		 * 有一些对象的其他成员变量完全不同，但是他们还需要进行hash和equals的方法比较
		 * 如果们可以让成员变量不同的对象，他们的hash值也不同
		 * 
		 */
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		//向下转型
		System.out.println("-----------");
		Student p=(Student)obj;
		
		if(!this.name.equals(p.name)){
			return false;
		}
		if(this.age!=(p.age)){
			return false;
		}
		return true;
	}
	
	

}
