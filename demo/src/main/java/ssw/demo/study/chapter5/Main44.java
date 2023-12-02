package ssw.demo.study.chapter5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main44 {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    String input = "";
		
		while ( (input = br.readLine()) != null && !input.isEmpty() ) {	// 컨트롤 +z 가 멈춤(EOF) = 값을 그만 넣는다
		//while ( (input = br.readLine()) != null ) {	// 컨트롤 +z 가 멈춤(EOF) = 값을 그만 넣는다
			
			if ((input.equals(""))) {
				bw.close(); //종료
				break;
			}
			else {
				bw.write(input);	// 버퍼는 스트링으로 받아서 스트링으로 출력 해야한다
				bw.newLine();	// 개행 줄 추가
			}
		}
		
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