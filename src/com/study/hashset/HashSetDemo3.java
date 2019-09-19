package com.study.hashset;

import java.util.HashSet;

public class HashSetDemo3 {
	
	public static void main(String[] args){
		
		//创建集合对象
		HashSet<Student> hs=new HashSet<Student>();
		//创建元素对象
		Student s=new Student("a",11);
		Student s2=new Student("b",22);
		Student s3=new Student("b",22);
		//添加元素对象
		hs.add(s);
		hs.add(s2);
		hs.add(s3);
		//遍历集合对象
		for (Student student : hs) {
			System.out.println(student);
		}
		
	}
	
	

}
