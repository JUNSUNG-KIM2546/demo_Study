package ssw.demo.study.chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main3 {
	 public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    // 실행 수
	    int count = Integer.parseInt(br.readLine());
	    int Q = 25;	// 쿼터 0.25
	    int D = 10;	// 다임 0.10
	    int N = 5;	// 니켈 0.05
	    int P = 1;	// 페니 0.01
	    int result = 0;
	    
	    for(int i=0; i< count; i++) {
	    	int input = Integer.parseInt(br.readLine());
	    	
	    	// 쿼터 개수
	    	bw.write(Integer.toString(input / Q));
	    	bw.write(" ");
	    	result = input % Q;
	    	
	    	// 다임 개수
	    	bw.write(Integer.toString(result / D));
	    	bw.write(" ");
	    	result %= D;
	    	
	    	// 니켈 개수
	    	bw.write(Integer.toString(result / N));
	    	bw.write(" ");
	    	result %= N;
	    	
	    	// 페니 개수
	    	bw.write(Integer.toString(result / P));
	    	bw.write(" ");
	    	result %= P;
	    	bw.newLine();
	    	
	    }
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