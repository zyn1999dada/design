package day01;

import java.util.Scanner;

//二分法查找
//一个满足题目要求的输入范例。
//例：
//1 2 3 4 5 6 7 8 9 10
//4
//样例输出
//与上面的样例输入对应的输出。
//例：
//3

public class erFen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		String s=scanner.nextLine();
		int a=scanner.nextInt();
		int[] arr=change(s);
		if(arr!=null) {
			 System.out.println(count(arr, a));
			 return;
		}else {
			System.out.println("您输入的格式有误");
		}		
	}
	//将字符串转变成数组
	private static int[] change(String s) {
		try {
			String[] sArr=null;
			sArr=s.split(" ");
			int[] arr=new int[sArr.length];
			for(int x=0;x<arr.length;x++) {
				arr[x]=Integer.parseInt(sArr[x]);
			}
			return arr;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	private static int count(int[] arr,int a) {
		try {
			for(int x=0,y=arr.length;x<y;) {
				int z=(x+y)/2;
				if(a==arr[z]) {
					return z;
				}else if(a<arr[z]) {
					y=z;
				}else if(a>arr[z]) {
					x=z+1;				
				}
			}
			return -1;
		} catch (Exception e) {
			// TODO: handle exception
			return -1;
		}
	}
}
