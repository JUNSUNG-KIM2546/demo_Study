package ssw.demo.study.chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
	 public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    // 첫째 줄 입력 받기
	    String input[] = br.readLine().split(" ");
	    
	    // 입력 받은 값 지정
	    int result = Integer.parseInt(input[0]);	//10진수 값
	    int resultCo = Integer.parseInt(input[1]);	// 변경할 진법
	    
	    // 입력 받은 result값, resultCo값을 진법에 맞게 변환 하여 re에 넣기	
	    // 업퍼를 사용하여 값이 대문자로 나오도록 해야한다
	    String re = Integer.toString(result, resultCo).toUpperCase();
	    
	    // 답 할당
		bw.write(re);
		
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