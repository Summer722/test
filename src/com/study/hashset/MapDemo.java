package com.study.hashset;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		//创建Map对象
		Map<String,String> map=new HashMap();
		//V put（K key,V value）将key映射到value的功能，如果key存在，则覆盖value,并返回原有的value，如果不存在，则返回null
		System.out.println(map.put("123", "张三"));
		System.out.println(map.put("124", "李四"));
		System.out.println(map.put("123", "王五"));
		System.out.println(map);
		//清空
		//map.clear();
		//判断指定的key是否存在，返回ture or false
		/*System.out.println(map.containsKey("123"));
		//判断指定的value是否存在，返回ture or false
		System.out.println(map.containsValue("王五"));
		//判断是否有对应关系
		System.out.println(map.isEmpty());*/
		//返回对应关系的个数
		System.out.println(map.size());
		//根据指定的key返回对应的value
		System.out.println(map.get("123"));
	}

}
