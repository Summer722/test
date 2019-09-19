package com.study.iofile;

import java.io.File;
import java.io.IOException;

/**
 * File(File parent, String child) 
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。 
File(String pathname) 
          通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。 
File(String parent, String child) 
          根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。 

 * @author G6017216
 *
 */

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		//File(String pathname) :将指定的路径名称转换为一个file对象
		File f=new File("D:\\JAVAStudy\\b.txt");
		//File(File parent, String child) :根据指定的父路径和文件路径创建File对象
//		File f2=new File("D:\\JAVAStudy","b.txt");
//		
//		File f4=new File("c\\d\\e");
//		System.out.println(f4.mkdirs());
//		System.out.println(f4.delete());
		
		File f1=new File("a.txt");
		File f2=new File("c");
		//f.createNewFile();
		//System.out.println(f.exists());
		//System.out.println(f.isAbsolute());//是否是绝对路径
		//System.out.println(f2.isDirectory());//是否是文件夹
		//System.out.println(f.isFile());//是否是文件
	}

}
