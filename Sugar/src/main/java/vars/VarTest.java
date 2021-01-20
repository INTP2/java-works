package vars;

import java.io.*;
import java.net.*;

public class VarTest {

	public static void main(String[] args) throws Exception {
		
		int a1 = 5;
		float a2 = 0.25f;
		String a3 = "abc";
		URL a4 = new URL("https://github.com/");
		
		
		var b1 = 5;
		var b2 = 0.25;
		var b3 = "abc";
		var b4 = new URL("https://github.com/");		
		
		//var b0;              //error
		//b3 = 5;              //error
		//var b5=5,b6=6,b7=7;  //error
		//var b8=null;         //error
		
		int[] nums = new int[3];
		//var nums2 = {0,1,2};  error
		for(var i=0;i<nums.length;i++)
		{
			nums[i] = i*2;
		}
		
		for(var i:nums)
		{
			System.out.println(i);
		}
		
		//var���Ժ���Ԫ���������
		var a5 = a1>b1? 10:15;
		var b5 = a1+2<=b1? a1+10:b3;
		System.out.println(b5.getClass().getName());
		

		var obj = new Object(){ 
		    public void print(){
		        System.out.println("I can print"); 
		    }
		};		
		obj.print();
		

		var obj1 = new Father();
		var obj2 = new Son();
		obj1 = obj2;  

	}
	

/*
	public var f1(var a)
	{
		return 1;
	}
*/

}
