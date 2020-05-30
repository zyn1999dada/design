package day02;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] arr=new int[a];
		for(int x=0;x<arr.length;x++) {
			arr[x]=x+1;
		}
		n(arr, b);		
	}
	public static void n(int[] arr,int b) {
		int c=b;
		if(arr.length==1) {
			System.out.println(arr[0]);
			return;
		}else {
			int[] arr1=new int[arr.length-1];
			for(int x=0;x<arr.length-1;x++) {			
				if(b<=arr.length) {
					if(b==arr.length) {
						b=0;
					}
					arr1[x]=arr[b];
					b++;
				}else {
					
					b=b%arr.length;
					if(b==arr.length) {
						b=0;
					}
					arr1[x]=arr[b];
					b++;
				}		
			}

			n(arr1,c);
		}
	
	}

}
//
//
//北大附中书院有m个同学，他们每次都很民主地决策很多事情。按罗伯特议事规则，需要一个主持人。
//同学们民主意识强，积极性高，都想做主持人，当然主持人只有一人。为了选出主持人，他们想到了一个办法并认为很民主。方法是：
//大家围成一圈，从1到m为每个同学编号。然后从1开始报数， 数到n的出局。剩下的同学从下位开始再从1开始报数。最后剩下来的就是主持人了。
//现在已经把同学从1到m编号，并约定报数为n的出局，请编程计算一下，哪个编号的同学将会成为主持人。