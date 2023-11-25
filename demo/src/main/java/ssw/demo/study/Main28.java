package ssw.demo.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main28 {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    String input = br.readLine(); // 배열에 입력될 값
	    StringTokenizer st = new StringTokenizer(input, " ");
	    
	    int N = Integer.parseInt(st.nextToken()); // 입력받는 배열의 크기
	    int[] list = new int[N];	// list라는 배열에 N만큼 할당
	    int L = Integer.parseInt(st.nextToken()); // 입력받는 횟수(반복횟수)
	    
	    for(int i=0; i<L; i++) {
	    	input = br.readLine(); // 배열에 입력될 값
		    st = new StringTokenizer(input, " ");
	        int S = Integer.parseInt(st.nextToken());
	        int A = Integer.parseInt(st.nextToken());
	        int C = Integer.parseInt(st.nextToken());
	        for(int c=S-1; c<=A-1; c++) {
	        	list[c] = C;
	        }
	    }
	    
	    for(int j=0; j<N; j++) {
	    	bw.write(Integer.toString(list[j]));
    		bw.write(" "); // 할당
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