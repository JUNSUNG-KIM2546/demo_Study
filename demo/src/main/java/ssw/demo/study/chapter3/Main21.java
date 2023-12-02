package ssw.demo.study.chapter3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main21 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//인풋
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	//아웃풋
		String s = br.readLine();
		String d = " ";
		String st = "*";
		
		int co = Integer.parseInt(s);	// 스트링을 인트로 변환
		for(int i=1; i<=co; i++) {
			bw.write(d.repeat(co - i));
			for(int j=0; j<i; j++) {
				bw.write(st);	//할당
			}
			bw.newLine();	// 개행 줄 추가
		}
		bw.flush(); //출력
		bw.close(); //종료
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