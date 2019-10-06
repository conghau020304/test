package core;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		try {
			n = scan.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			//System.out.println("===========");
			for(int i = 1; i<= n ; i++) {
				for(int j = 1; j <=n ; j++) {
					if(j >= i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		//	System.out.println("============");
			for(int i = n ; i >= 1; i--) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
			for(int i = n; i >=1  ; i--) {
				for(int j = 1; j <=n ; j++) {
					if(j >= i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
			
		} catch (Exception e) {
			System.out.println("Vui long nhap so:");
		}
		
	}

}
