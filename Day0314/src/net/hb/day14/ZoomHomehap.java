package net.hb.day14;

public class ZoomHomehap {

	public static void main(String[] args) {
		String info="안내", msg="", result="안내";
		int kor=0, eng=0, hap=0;
		double avg=0.0;
		
		kor=90; eng=85;
		hap=kor + eng;
		avg=hap/2;
		
		if(avg>=70) {
			msg="합격입니다";
			System.out.println("총점="+hap+ "\n"+ "평균="+avg +"\n"+ msg);
		}else {
			msg="불합격입니다";
			System.out.println("총점="+hap+ "\n"+ "평균="+avg +"\n"+ msg);
		}
		
	}

}//class END
