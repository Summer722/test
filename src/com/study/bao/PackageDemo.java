package com.study.bao;

import java.util.ArrayList;


public class PackageDemo {
	
	/*
	 *相同包下的类可以相互访问 
	 */
	
	/*
	 * 不同包下的类之间的相互访问 
	 * 使用类的全名  类的全名：包名+类名
	 * 使用关键字import将类导入   import java.util.*  *代表通配符，代表了导入这个包下的所有的类
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PackageDemo pd= new PackageDemo();//相同包下的类可以相互访问
		
		ArrayList al=new ArrayList();

	}

}
