package day07;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		if(a>b) {
			System.out.println(a>c?a:c);
		}else {
			System.err.println(b>c?b:c);
		}
	}
}
