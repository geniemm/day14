package generic;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl05 implements Service05{
	private ArrayList<DTO05> member;
	public ServiceImpl05() {
		member = new ArrayList<>();
	}
	private int register(String name,String addr) {
		DTO05 dto = new DTO05();
		dto.setName(name); dto.setAddr(addr);
		member.add(dto);
		/*
		 if 문을 통해서 저장이 잘되면 1을 돌려주고
		 실패하면 0을 돌려준다.
		 */ 
		return 1; 
	}
	public void memberView() {
		System.out.println("-------------");
		System.out.println("이름\t주소");
		System.out.println("-------------");
		for(int i=0;i<member.size();i++) {
			DTO05 dto = member.get(i);
				System.out.println(dto.getName()+"\t"+dto.getAddr());
				System.out.println("-------------");
	
		}
		System.out.println("=== foreach ===");
		for(DTO05 d : member) {
			System.out.println(d.getName()+"\t"+d.getAddr());
			System.out.println("-------------");
		}
	}
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		String name=null ,addr = null;
		int result = 0;
		System.out.println("======회원관리======");
		while(true) {
			System.out.println("1) 회원 저장");
			System.out.println("2) 모든 회원 보기");
			System.out.println("3) MAIN 이동");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("이름: ");
				name=sc.next();
				System.out.println("주소: ");
				addr=sc.next();
				result = register(name,addr);
				if(result==1) {
					System.out.println("등록되었습니다.");
				}else {
					System.out.println("문제가 발생했습니다.");
				}
				break;
			case 2:
				memberView();
				break;
			case 3: return;
			}
		}
	}
	
}




