package net.hb.day14;

public class Testdouble {

	public static void main(String[] args) {
		//실수=소수점있는경우,자바에서 실수타입은 double권장=8Byte 3.14
		//실수=소수점있는경우,자바에서 실수타입은 float권장=4Byte  3.14f
		double piA=3.1415;
		double rateA=1023.75; //환율
		System.out.println(piA);//출력
		System.out.println(rateA);//출력
		System.out.println();
		
		float piB=3.1415f;
		float rateB=1023.75F; //환율
		System.out.println(piB);//출력
		System.out.println(rateB);//출력
		
		System.out.println();
		System.out.println("우리나라");
		System.out.println("금수강산");
		System.out.println("화려강산");
	}

}//class END
