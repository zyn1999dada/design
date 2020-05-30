package day04;

import java.util.Scanner;

public class two2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[][] arr=new int[a][2];
		//存放巧克力
		for(int x=0;x<a;x++) {
			for(int y=0;y<2;y++) {
				arr[x][y]=sc.nextInt();
			}
		}
		int temp=name(arr, b);
		System.out.println(temp);
	}
	public static int name(int [][]arr,int b) {
		int a=0;//标准
		//确定最大标准数
		for(int x=0;x<arr.length;x++) {		
			int y=arr[x][0]>arr[x][1]?arr[x][1]:arr[x][0];
			a=a>y?a:y;
		}
		int i=1;//游标
		int w=0;//返回值
		for(;!(w==a||a-w==1);) {
			int y=(a+i)/2;
			if(kits(arr,y)>=b) {
				i=y;
				w=y;
				y=(a+i)/2;				
			}else {
				a=y-1;
			}
		}
//		System.out.println("我是标准"+w);
//		System.out.println("我能分出"+kits(arr, w)+"块巧克力");
		if(kits(arr, w+1)>=b) {
//			System.out.println("123");
			return w+1;
		}
		else {
			return w;
		}	
	}
	//按标准切一块巧克力获得的块数
	public static int kit(int[] arr,int c) {
		int x=arr[0]/c;
		int y=arr[1]/c;		
		return x*y;
	}
	//按标准切很多块巧克力获得的块数
	public static int kits(int[][] arr,int y) {
		int temp=0;
		for(int x=0;x<arr.length;x++) {
			temp=temp+kit(arr[x], y);		
		}
		return temp;
	}

}
//
//儿童节那天有K位小朋友到小明家做客。小明拿出了珍藏的巧克力招待小朋友们。
//小明一共有N块巧克力，其中第i块是Hi x Wi的方格组成的长方形。
//
//
//为了公平起见，小明需要从这 N 块巧克力中切出K块巧克力分给小朋友们。切出的巧克力需要满足：
//
//
//1. 形状是正方形，边长是整数
//2. 大小相同
//
//
//例如一块6x5的巧克力可以切出6块2x2的巧克力或者2块3x3的巧克力。
//
//
//当然小朋友们都希望得到的巧克力尽可能大，你能帮小Hi计算出最大的边长是多少么？
//输入格式
//第一行包含两个整数N和K。(1 <= N, K <= 100000)
//以下N行每行包含两个整数Hi和Wi。(1 <= Hi, Wi <= 100000)
//输入保证每位小朋友至少能获得一块1x1的巧克力。
//输出格式
//输出切出的正方形巧克力最大可能的边长。
//样例输入
//2 10
//6 5
//5 6
//样例输出
//2