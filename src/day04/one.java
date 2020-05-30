package day04;

import java.util.Scanner;
//计算行列式
public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int [][] arr=new int[a][a];
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				arr[x][y]=sc.nextInt();
			}
		}
		if(a==1) {
			System.out.println(arr[0][0]);
			return;
		}else {
			System.out.println(laCountDao(arr));
		}

	}
	public static int laCountDao(int[][] arr) {
		// TODO Auto-generated method stub
		int ans=0;
		if(arr.length==2) {
			return arr[0][0]*arr[1][1]-arr[0][1]*arr[1][0];
		}else {
			for(int i=0;i<arr.length;i++) {
				ans=ans+(((2+i)%2)==0?1:-1)*arr[0][i]*laCountDao(yuArr(i, arr));
			}			
			return ans;		
		}				
	}
	public static int[][] yuArr(int i,int[][] arr){
		int[][] temp=new int[arr.length-1][arr.length-1];
		int a=0;
		for(int x=1;x<arr.length;x++) {
			int b=0;
			//读取每一行的数
			for(int y=0;y<arr[x].length;y++) {
				//如果列相等，跳出该列
				if(y==i) {
					continue;
				}else {					
						temp[a][b]=arr[x][y];
						b++;
					}
			}
			a++;
		}			
		return temp;
	}
}
