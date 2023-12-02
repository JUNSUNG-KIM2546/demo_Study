package ssw.demo.study.chapter4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main30 {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    boolean[] list = new boolean[31];	// list1라는 배열에 지정한만큼 할당
	     list[0] = true;
	    
	    
	    for(int i=0; i<28; i++) {
	    	int B = Integer.parseInt(br.readLine());
	    	list[B] = true;
	    }
	    
	    for(int i=0;i<list.length;i++) {
	    	if(list[i] == false) {
	    		bw.write(Integer.toString(i));
	    		bw.newLine();
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