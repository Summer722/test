package com.study.hashset;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		//创建map对象
		Map<String,String> map=new HashMap();
		map.put("123", "张三");
		map.put("124", "李四");
		map.put("125", "王五");
		
		//Set
		//Set<String> keys = method(map);
		
		Collection<String> values=map.values();
		for (String string : values) {
			System.out.println(string);
		}
	}

	private static Set<String> method(Map<String, String> map) {
		Set<String> keys=map.keySet();
		for (String string : keys) {
			System.out.println(string);
		}
		return keys;
	}

}
