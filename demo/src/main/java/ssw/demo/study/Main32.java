package ssw.demo.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main32 {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    String input = br.readLine();
	    StringTokenizer st = new StringTokenizer(input, " ");	// 토큰라이저
	    
	    int[] list = new int[Integer.parseInt(st.nextToken())];	// list1 배열 할당
	    int co = Integer.parseInt(st.nextToken());
	    
	    for(int i=0; i<list.length; i++) {
	    	list[i] = i+1;
	    }
	    Arrays.sort(list);	// list1 오림차순
	    
	    for(int i=0;i<co;i++) {
	    	input = br.readLine();
		    st = new StringTokenizer(input, " ");	// 토큰라이저
	    	int o = Integer.parseInt(st.nextToken()) - 1;
	        int t = Integer.parseInt(st.nextToken()) - 1;
	        while(o < t) {
	        	int temp = list[o];
	        	list[o++] = list[t];
	        	list[t--] = temp;
	        }
	    }
	    
	    for(int tot : list) {
	    	bw.write(Integer.toString(tot));
	    	bw.write(" ");
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
		
		// 배열의 중복 제거 (배열을 stream 객체화 후 중복제거)
	    //int result[] = Arrays.stream(list1).distinct().toArray();
*/