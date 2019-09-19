package com.study.hashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map第一种遍历方式：
 * 		首先召集所有的丈夫
 * 		遍历所有丈夫
 * 		获取每一个丈夫
 * 		让灭一个
 * @author G6017216
 *
 */
public class MapDemo4 {

	public static void main(String[] args) {
		//创建Map对象
		Map<String,String> map=new HashMap();
		//添加映射关系
		map.put("123", "张三");
		map.put("124", "李四");
		map.put("125", "王五");
		//遍历Map对象
		Set<String> keys=map.keySet();
		for (String string : keys) {
			String value=map.get(string);
			System.out.println(string+value);
		}
	}

}
