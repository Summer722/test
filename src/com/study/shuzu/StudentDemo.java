package com.study.shuzu;


/*
 * 创建一个学生数组，存储三个对象并遍历
 * 
 *A.定义学生类
  B.创建学生数组
  C.创建学生对象
  D.把学生对象作为元素赋值给学生数组
  E.遍历学生数组
 */
public class StudentDemo {
	
	public static void main(String[] args) {
	//创建学生数组
	Student[] students=new Student[3];
	
	//创建学生对象
	Student s1=new Student("lala",11);
	Student s2=new Student("hehe",12);
	Student s3=new Student("xixi",13);
	
	//把学生对象作为元素赋值给学生数组
	students[0]=s1;
	students[1]=s2;
	students[2]=s3;
	
	for(int i=0;i<3;i++)
	{
		System.out.println(students[i].getName());
	}
	
	
	}

}
