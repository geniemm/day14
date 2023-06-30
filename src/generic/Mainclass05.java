package generic;

import java.util.Scanner;

public class Mainclass05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		ServiceImpl05 mem =new ServiceImpl05();
		
		while(true) {
			System.out.println("[1] 회원관리");
			System.out.println("[2] 종료");
			num = sc.nextInt();
			switch(num) {
			case 1: 
				mem.display();
				break;
			case 2: 
				return;
			}
		}
		
	}
}
