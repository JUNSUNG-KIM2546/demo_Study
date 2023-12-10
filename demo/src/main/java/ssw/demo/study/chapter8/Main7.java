package ssw.demo.study.chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main7 {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    String input[] = br.readLine().split(" ");
	    
	    int A = Integer.parseInt(input[0]);	// 낮
	    int B = Integer.parseInt(input[1]);	// 밤
	    int V = Integer.parseInt(input[2]);	// 높이
	    int co = 0;	// 달팽이
	    int count = 0;	// 몇일
	    
	    while (true) {
	    	// 달팽이가 co만큼 갔다
	    	if(co <= V) {
	    		count++;
	    		co += A;
	    	}
	    	
	    	// 달팽이 정상에 도착하면 브레이크
	    	if(V <= co) {
	    		break;
	    	}
	    	
	    	// 달팽이 잔다(미끄러짐)
	    	co -= B;
		}
	    
		bw.write(Integer.toString(count));
		
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