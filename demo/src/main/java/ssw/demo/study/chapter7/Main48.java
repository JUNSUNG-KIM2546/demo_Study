package ssw.demo.study.chapter7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main48 {
	 public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		 int[][] paper = new int[100][100];
		 int count = Integer.parseInt(br.readLine());
			
		 // count 수 만큼 입력받기
		 for (int i = 0; i < count; i++) {
			 String input[] = br.readLine().split(" ");
			 int a = Integer.parseInt(input[0]); // 열 가로
			 int b = Integer.parseInt(input[1]); // 행 세로
			 for (int j = a; j < a + 10; j++) {
			 // 사각형 부분에 1을 넣어주기
				 for (int k = b; k < b + 10; k++) {
			          paper[k][j] = 1;
				 }
			 }
			
		 }
			
		// 2차원 배열 출력. 1인 숫자만 더하기.
		int res = 0;
		for (int i = 0; i < 100; i++) {
			 for (int j = 0; j < 100; j++) {
			      if (paper[i][j] == 1) {
			          res += paper[i][j];
			      }
			 }
		}
		bw.write(Integer.toString(res)); // 값 할당
		bw.flush(); //출력
		br.close(); //종료
		bw.close(); //종료
	 }
}
/*
		//for(int tot : list) {
    	//	ma = Math.max(tot, ma);
    	//	mi = Math.min(tot, mi);
	    //}
	    
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//list1[i] = Integer.parseInt(br.readLine());
		//String s = br.readLine();
		//bw.write(co); // 할당
		//bw.write(Arrays.toString(list)); // 리스트 할당
		//bw.newLine(); // 줄바꿈
		//bw.flush(); //출력
		//bw.close(); //종료
		//String li = Arrays.toString(list);	// 정수형 배열을 문자열 배열로 변환
		//int B = Integer.parseInt(st.nextToken());
		//list[j] = Integer.parseInt(st.nextToken());
		
		//StringTokenizer st = new StringTokenizer(input, " ");	// 토큰라이저
		//Arrays.sort(list1);	// list1 오림차순 
		//Arrays.sort(list);	// list1 오림차순
		// 배열의 중복 제거 (배열을 stream 객체화 후 중복제거)
	    //int result[] = Arrays.stream(list1).distinct().toArray();
*/