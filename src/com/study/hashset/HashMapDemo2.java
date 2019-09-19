package com.study.hashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		//创建Map对象
		Map<Student,String> hm=new HashMap<Student,String>();
		//创建key对象
		Student s=new Student("zhangsan",18);
		Student s2=new Student("lisi",8);
		//添加映射关系
		hm.put(s, "123");
		hm.put(s2, "124");
		//方式1：遍历map对象
		Set<Student> keys=hm.keySet();
		for (Student student : keys) {
			String value=hm.get(student);
			System.out.println(student+"="+value);
		}
		//
		Set<Map.Entry<Student, String>> entrys=hm.entrySet();
		for (Map.Entry<Student, String> entry : entrys) {
			Student key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key +"="+value);
		}

	}

}
