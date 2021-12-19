package com.workz.pattern;
import java.util.Scanner;
public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    long num;
    int i, count=0;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a number:");
    num=s.nextLong();
    for(i=2;i<num;i++) {
    	if(num%i==0) {
    		count++;
    		break;
    	}
    }
    if(count==0)
    	System.out.println("It is a prime number");
    else
    	System.out.println("It is  not a prime number");	
    
	}

}
