package generic;

import java.util.ArrayList;

/*
 	generic
 	- 유동적으로 자료형을 부여해 사용할 수 있다.
 	- wrapper 자료형으로 부여해야한다.
 	wrapper 
 	- int : Integer, double : Double / char : Character 
 	- boolean, byte, char, short, int, long, float, double
 	-> 나머지는 대문자로 변경하면 끝난다
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num = 100;
		Integer num2 = 200;
		// ->둘다 정수를 나타내는 자료형이여서 어느것을 사용해도 상관없다.
		num=num2;
		double d01 = 1.123;
		Double d02 = 2.234;
		// 일반적인 자료형을 클래스타입으로 변경한것
		ArrayList<String> arr; // E : element
	}
}
