package ssw.demo.study.chapter4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main33 {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    String input = br.readLine();
	    double tot = 0;
	    
	    double[] list = new double[Integer.parseInt(input)];	// list1 배열 할당
	    
	    input = br.readLine();
	    StringTokenizer st = new StringTokenizer(input, " ");	// 토큰라이저
	    
	    for(int i=0; i<list.length; i++) {	// 리스트에 점수 할당
	    	int C = Integer.parseInt(st.nextToken());
	    	list[i] = C;
	    }
	    
	    double ma = list[0];	// 최고점수 초기선언
	    
	    for(int i=0; i<list.length; i++) {
    		ma = Math.max(list[i], ma);
	    }
	    
	    for(int i=0;i<list.length;i++) {
	    	list[i] = (list[i]/ma)*100;
	    	tot += list[i];
	    	
	    }
	    
	    double result = tot / list.length;
	    
	    bw.write(Double.toString(result));
    	bw.write(" ");
	    //bw.write(Integer.toString(list[]));	// result배열 크기를 출력
	    //bw.write(Arrays.toString(list));	// result 리스트를 통으로 출력
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