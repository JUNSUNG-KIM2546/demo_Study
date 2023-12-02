package ssw.demo.study.chapter4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main25 {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    String input = br.readLine(); // 입력받는 N , X
	    StringTokenizer st = new StringTokenizer(input, " ");
	    
	    int N = Integer.parseInt(st.nextToken()); // 입력받는 배열의 크기
	    int X = Integer.parseInt(st.nextToken()); // 찾으려는 정수 범위
	    int[] list = new int[N];
	    
	    String input2 = br.readLine(); // 배열에 넣을 값
	    StringTokenizer st2 = new StringTokenizer(input2, " ");
	
	    for(int i=0; i<list.length; i++) {
	        list[i] = Integer.parseInt(st2.nextToken());
	    }
	
	    for(int tot : list) {
	    	if(tot < X) {
	    		bw.write(Integer.toString(tot));
	    		bw.write(" ");
	    	}
	    }
	    bw.flush();
	    bw.close();
	    br.close();
	}
}

/*
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//String s = br.readLine();
		//bw.write(co); // 할당
		//bw.newLine(); // 줄바꿈
		//bw.flush(); //출력
		//bw.close(); //종료
		//String li = Arrays.toString(list);	// 정수형 배열을 문자열 배열로 변환
		//int B = Integer.parseInt(st.nextToken());
		//list[j] = Integer.parseInt(st.nextToken());
*/

		/*
		|\_/|
		|q p|   /}
		( 0 )"""\
		|"^"`    |
		||_/=\\__|
		*/