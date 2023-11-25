package ssw.demo.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main31 {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int co = 0;
	    
	    int[] list1 = new int[10];	// list1 배열 할당
	    
	    
	    for(int i=0; i<list1.length; i++) {
	    	list1[i] = Integer.parseInt(br.readLine()); // 입력받는 배열의 크기
	    }
	    Arrays.sort(list1);	// list1 오림차순
	    
	    for(int A=0; A < list1.length; A++) {
	    	list1[A] = list1[A]%42;
	    }
	    Arrays.sort(list1);	// list1 오림차순
	    
	    for(int j=0; j<list1.length; j++) {
	    	if(list1[j]) {
	    		
	    	}
	    }
	    
	    bw.write(Integer.toString(co);
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
		//String s = br.readLine();
		//bw.write(co); // 할당
		//bw.write(Arrays.toString(list)); // 리스트 할당
		//bw.newLine(); // 줄바꿈
		//bw.flush(); //출력
		//bw.close(); //종료
		//String li = Arrays.toString(list);	// 정수형 배열을 문자열 배열로 변환
		 * 
		//int B = Integer.parseInt(st.nextToken());
		//list[j] = Integer.parseInt(st.nextToken());
		
		//StringTokenizer st = new StringTokenizer(input, " ");	// 토큰라이저
		//Arrays.sort(list1);	// list1 오림차순 
*/

		/*
		|\_/|
		|q p|   /}
		( 0 )"""\
		|"^"`    |
		||_/=\\__|
		*/