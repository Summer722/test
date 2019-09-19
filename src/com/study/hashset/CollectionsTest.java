package com.study.hashset;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 模拟斗地主发牌
 * @author G6017216
 *
 */
public class CollectionsTest {

	public static void main(String[] args) {
		//买牌
		ArrayList<String> box=new ArrayList<String>();
		//添加每张牌
		String[] arr={"黑桃","红桃","方片","梅花"};
		String[] arr2={"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				box.add(arr[i]+arr2[j]);
				
			}
			
		}
		
		box.add("大王");
		box.add("小王");
		
		//洗牌
		Collections.shuffle(box);
		//System.out.println(box);
		//发牌
		ArrayList<String> Jay=new ArrayList<String>();
		ArrayList<String> Kris=new ArrayList<String>();
		ArrayList<String> David=new ArrayList<String>();
		
		//留三张底牌给地主
		for (int i = 0; i < box.size()-3; i++) {
			if(i%3==0){
				Jay.add(box.get(i));
			}
			else if(i%3==1){
				Kris.add(box.get(i));
			}
			else if(i%3==2){
				David.add(box.get(i));
			}
		}
		System.out.println("Jay:"+Jay);
		System.out.println("Kris:"+Kris);
		System.out.println("David:"+David);
		
		System.out.println(box.get(box.size()-1));
		System.out.println(box.get(box.size()-2));
		System.out.println(box.get(box.size()-3));
	
	}

}
