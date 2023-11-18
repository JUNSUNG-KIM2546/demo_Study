package ssw.demo.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main23 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//인풋
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	//아웃풋
		String t = "";
		
		//while ( (t = br.readLine()) != null && !t.isEmpty() ) {	// 컨트롤 +z 가 멈춤(EOF) = 값을 그만 넣는다
		while ( (t = br.readLine()) != null ) {	// 컨트롤 +z 가 멈춤(EOF) = 값을 그만 넣는다
			StringTokenizer st = new StringTokenizer(t, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if ((A==0)&&(B==0)) {
				bw.close(); //종료
				break;
			}
			else {
				int ab =  A+B;	// 스트링을 인트로 변환(계산)
				bw.write(Integer.toString(ab));	// 버퍼는 스트링으로 받아서 스트링으로 출력 해야한다
				bw.newLine();	// 개행 줄 추가
			}
			bw.flush(); //출력
		}
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
*/

		/*
		|\_/|
		|q p|   /}
		( 0 )"""\
		|"^"`    |
		||_/=\\__|
		*/