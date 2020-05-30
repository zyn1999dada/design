package day06;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int x = 1; x <= a; x++) {
			for (int y = 1; y <=a; y++) {
				int q = 0;
				if (x <= a / 2 && y < a / 2) {
					q = x > y ? y : x;
					if (q % 2 == 1) {
						System.out.print("* ");
					} else {
						System.err.print("_ ");
					}
				} else if (x <= a / 2 && y > a / 2) {
					q = x - 1 > a - y ? a - y : x - 1;
					if (q % 2 == 1) {
						System.out.print("_ ");
					} else {
						System.err.print("* ");
					}
				} else if (x > a / 2 && y <= a / 2) {
					q = a - x > y - 1 ? y - 1 : a - x;
					if (q % 2 == 1) {
						System.out.print("_ ");
					} else {
						System.err.print("* ");
					}
				} else {
					q = a - x > a - y ? a - y : a - x;
					if (q % 2 == 1) {
						System.out.print("* ");
					} else {
						System.err.print("_ ");
					}
				}
			}
			System.out.println();
		}
		return;
	}

}

//给定正方形边长width，如图按规律输出层层嵌套的正方形图形。
//注意，为让选手方便观看，下图和样例输出均使用“_”代替空格，请选手输出的时候使用空格而不是“_”。
//
//width=6：
//
//******
//
//*____*
//
//*_**_*
//
//*_**_;........LL............*
//
//*____*
//
//******
//输入格式
//仅一行一个整数width。
//输出格式
//按规律输出图形，不要输出多余空格。
//样例输入
//10
//样例输出
//**********
//*________*
//*_******_*
//*_*____*_*
//*_*_**_*_*
//*_*_**_*_*
//*_*____*_*
//*_******_*
//*________*
//**********