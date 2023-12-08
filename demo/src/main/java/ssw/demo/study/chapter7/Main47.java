package ssw.demo.study.chapter7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;

public class Main47 {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    String[][] listResult;
	    int result = 0;
	    int co = 0;
	    
	    // 배열 크기 설정
	    listResult = new String[5][15];
	    
	    // listResult리스트에 입력 값 넣기
		for(int i=0; i<listResult.length;i++) {
			String input[] = br.readLine().split(" ");
			listResult[i] = new String[input.length];
			for(int j=0; j<listResult[i].length; j++) {
				listResult[i][j] = input[j];
			}
			co = Math.max(co, listResult[i].length);
		}
		
		// 값 할당
		for(int i=0; i<co; i++) {
			for(int j=0; j<co; j++) {
				bw.write(listResult[i][j]); // 리스트 할당
			}
		}
		
		
		// 답 출력
		bw.flush(); //출력
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