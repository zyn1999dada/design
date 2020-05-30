package day03;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String sr=String.valueOf(a);
		String [] arr=new String[sr.length()];
		for(int x=0;x<sr.length();x++) {
			arr[x]=String.valueOf(sr.charAt(x));
		}
		String s=name(arr);
		System.out.println(s);
		
	}
	public static String name(String[] arr) {
		String s="";
		if(arr.length==1) {
			return s+arr[0]+"-";
		}else {
			String[] sarr=new String[arr.length-1];
			s=arr[arr.length-1]+"-";
			for(int x=0;x<sarr.length;x++) {
				sarr[x]=arr[x];
			}
			s=name(sarr)+s;
		}
		return s;

	}

}

//编写递归函数，将组成整数的所有数字逐个输出，每个数字后面加上一个减号“-”，例如对于整数123，该函数将输出1-2-3- 。编写主函数测试该递归函数。
//样例输入
//一个满足题目要求的输入范例。
//例：
//123
//样例输出
//与上面的样例输入对应的输出。
//例：
//1-2-3-
