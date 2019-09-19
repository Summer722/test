package com.study.shuzu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//创建集合对象
		Set<String> set =new HashSet<String>();
		
	    //添加元素对象
		set.add("hello");
		set.add("world");
		set.add("java");
		
		//遍历集合对象
		//method(set);
		
		//Method2(set);
		
		Method3(set);
		
		
		
	

	}

	private static void Method3(Set<String> set) {
		for(String s :set){
			System.out.println(s);
		}
	}

	private static void Method2(Set<String> set) {
		Iterator<String> it =set.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
	}

	private static void method(Set<String> set) {
		
		Object[] obj=set.toArray();
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}

}
