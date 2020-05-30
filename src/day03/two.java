package day03;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=new String[str.length()];
		for(int x=0;x<arr.length;x++) {
			arr[x]=String.valueOf(str.charAt(x));
		}
		name(arr);

	}
	public static void name(String[] arr) {
		
		for(int x=0;x<arr.length;x++) {
			char[] charArr=arr[x].toCharArray();
			int a=(int)charArr[0];		
			if(a>=65&&a<=90) {
				a=a+32;
				arr[x]=String.valueOf((char)a);
			}else {
				a=a-32;
				arr[x]=String.valueOf((char)a);
			}
			System.out.print(arr[x]);
		}
		
	}
	
}
