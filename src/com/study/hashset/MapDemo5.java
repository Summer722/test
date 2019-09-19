package com.study.hashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map的第二種遍歷
 * @author G6017216
 *
 */
public class MapDemo5 {

	public static void main(String[] args) {
		//创建Map对象
		Map<String,String> map=new HashMap();
		//添加映射关系
	    map.put("三三", "张三");
		map.put("四四", "李四");
		map.put("五五", "王五");
		
		Set<Map.Entry<String,String>> entrys=map.entrySet();
		for (Map.Entry<String, String> entry : entrys) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+value);
		}

	}

}
