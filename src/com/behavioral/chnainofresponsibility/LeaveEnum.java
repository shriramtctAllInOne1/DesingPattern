package com.behavioral.chnainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class LeaveEnum {

	
	public static void main(String [] args ){
		/*List<Integer> obj = null;
		List<Integer> obj1 = new ArrayList();
		System.out.println(obj1.size());*/
		
		
		String s1="ram";
		String s2="RAM";
		String s3="ram";
		String s4= new String("ram");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s4==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s4.equals(s3));
		
	}
}
