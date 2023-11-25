package ssw.demo.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main27 {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int ma = 0;
	    int in = 0;
	    
	    int[] list = new int[9];
	    
	    for(int i=0; i<list.length; i++) {
	    	list[i] = Integer.parseInt(br.readLine());
	    	if(list[i] > ma) {
	    		ma = Math.max(list[i], ma);
	    		in = i;
	    	}
	    }
	    
		bw.write(Integer.toString(ma));
		bw.newLine(); // 줄바꿈
		bw.write(Integer.toString(in + 1));
	    bw.flush();
	    bw.close();
	    br.close();
	}
}

/*		
  		//for(int tot : list) {
    	//	ma = Math.max(tot, ma);
	    //}
	    
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