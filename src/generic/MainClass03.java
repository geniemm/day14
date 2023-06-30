package generic;

import java.util.ArrayList;

class Test03< T >{
	public void sumFunc(T n1,T n2) {
		System.out.println(n1+","+n2);
		// T > type : 어떠한 자료형을 쓰더라도 사용할수있다.
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		Test03< Integer > t = new Test03();
		t.sumFunc(100, 200);
		// <> 안에 자료형을 클래스타입으로 넣으면 그 자료형형식의 값으로 받겠다고 선언하는것
		// 부여하는 타입으로 변경된다 ~ 
		Test03< String > t02 = new Test03();
		t02.sumFunc("바", "보");
		
		ArrayList < Integer >arr = new ArrayList<>();
		arr.add(100);
		System.out.println(arr.get(0));
		// 위에처럼 쓰는거면 자료형이 필요없어서 상관없지만 
		// 값을 꺼내올때는 자료형이 필요하기 때문에 형변환을 해야한다.
		
		
	}
}
