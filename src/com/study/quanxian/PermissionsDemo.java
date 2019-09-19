package com.study.quanxian;

public class PermissionsDemo {
	
	/*
	 * 权限修饰符：
	 * public 当前类  相同包下不同的类  不同包下的类
	 * default 当前类
	 * private 当前类 相同包下不同的类
	 * protected 当前类 相同包下不同的类
	 * 
	 * default 当前包下使用
	 * protected 让子类对象使用
	 */
	
	public void publicMethod()
	{
		System.out.println("publicmethod");
	}
	
	void defualtMethod()
	{
		System.out.println("defualtmethod");
	}
	private void privateMethod()
	{
		System.out.println("privatemethod");
	}
	protected void protectedMethod()
	{
		System.out.println("protectedmethod");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PermissionsDemo pd=new PermissionsDemo();
		
		pd.publicMethod();
		pd.defualtMethod();
		pd.privateMethod();
		pd.protectedMethod();
		

	}

}
