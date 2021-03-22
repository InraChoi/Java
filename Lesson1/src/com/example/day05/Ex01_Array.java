package com.example.day05;

public class Ex01_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] score = new float[3][3];
		
		score[0][0] = 100;
		score[0][1] = 80;
		score[0][2] = 90;
		
		
		score[1][0] = 50;
		score[1][1] = 40;
		score[1][2] = 30;
		
		score[2][0] = 60;
		score[2][1] = 50;
		score[2][2] = 80;
		
		
		float[] sum = new float[3];

		for (int i=0; i<score.length; i++) {
			float s_sum = 0 ,s_avg = 0;
			for (int j=0; j<score[i].length; j++) {
				s_sum += score[i][j];
				if( i == 0) {
					sum[0] += score[i][j];
					System.out.println(sum[0]);
				}else if( i == 1) {
					sum[1] += score[i][j];
					System.out.println(sum[1]);
				}else if( i == 2){
					sum[2] += score[i][j];
					System.out.println(sum[2]);
				}
			}
			
			
			s_avg = s_sum/3;
			System.out.println("학생"+i+"의 총점은 "+s_sum+"입니다");
			System.out.println("학생"+i+"의 평균은 "+s_avg+"입니다");
			System.out.println("-----------------------------------");
		}
		
		System.out.println("########################################");
		System.out.println("[과목별 합계 평균 결과]");
		System.out.println("########################################");
		for(int i=0; i<sum.length; i++) {
			System.out.println("과목"+i+"의 총점은 "+ sum[i]+"입니다.");
			System.out.println("과목"+i+"의 평균은 "+ (sum[i]/3) +"입니다.");
			System.out.println("-----------------------------------");
		}
		
		
		
	}

}
