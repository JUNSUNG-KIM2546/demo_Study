package ssw.demo.study.chapter4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main24 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//인풋
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	//아웃풋
		
		int count = 0;
		int i = Integer.parseInt(br.readLine());
		int[] list = new int[i];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int j=0; j<list.length; j++) {
			list[j] = Integer.parseInt(st.nextToken());
		}
		int c = Integer.parseInt(br.readLine());
		for(int ce : list) {
			if(c == ce) {
				count++;
			}
		}
		
		bw.write(Integer.toString(count));	// 버퍼는 스트링으로 받아서 스트링으로 출력 해야한다
		bw.newLine();	// 개행 줄 추가
		bw.flush(); //출력
		br.close(); //종료
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