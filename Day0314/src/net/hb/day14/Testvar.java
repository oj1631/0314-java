package net.hb.day14;

public class Testvar {
	public static void main(String[] args) {
		int hap=0;
		int kor=90; //지역변수는 초기값 있는 상태 연산 및 출력		
		hap=hap + kor; //The local variable kor may not have been
		System.out.println("길동씨 국어=" + kor);
	}
}//class END
