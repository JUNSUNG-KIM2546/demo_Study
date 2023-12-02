package ssw.demo.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main42 {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input, " ");	// 토큰라이저
		
		StringBuffer A = new StringBuffer(st.nextToken());	// 입력 받은 문자열을 스트링버퍼로 변환
		StringBuffer B = new StringBuffer(st.nextToken());
		
		String a = A.reverse().toString();	// 값을 뒤집어 준다 (리버스)
		String b = B.reverse().toString();
		
		int aa = Integer.parseInt(a);	// 뒤집어 준 값을 int형으로 변경
		int bb = Integer.parseInt(b);
		
		int re = Math.max(aa, bb);	// 뒤집어진 int형을 서로 비교해서 큰수를 뽑아줌
		
		bw.write(Integer.toString(re));
		bw.newLine();
			
	    bw.flush();
	    bw.close();
	    br.close();
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