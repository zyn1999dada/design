package day01;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.equals(s2)) {
			System.out.println("0");
			return;
		}		
		int a1=s1.compareTo(s2);
		if(a1>0) {
			System.out.println("-1");
		}else {
			System.out.println("1");
		}
		
	}
	
}
