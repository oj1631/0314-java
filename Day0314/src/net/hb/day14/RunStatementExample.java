package net.hb.day14;

public class RunStatementExample {

	public static void main(String[] args) {//42페이지
		//1바이트Byte=8bit 4*8=32bit형
		//변수이름 소문자시작_혹은 숫자
		//50페이지 기본타입=primitive타입 double, byte,char,short,int,long,float,boolean
		//접근지정 private,protected자식까지 가능,  public
		//50페이지 예외처리 try{실행중에러및문법에러}catch(Exception ex){해결}
		int score ; //선언
		score=90; //값대입
		//int score = 90; //선언및값대입 초기화
		
		int x=1; //지역변수 x 4바이트=int정수형 나이,점수,번호
		int y=2; //지역변수 y 4바이트=int정수형 나이,점수,번호
		int result=x+y; //지역변수 result 4바이트int정수형 나이,점수,번호
		System.out.println("합계는=" + result);
		

	}
}//class END
