package ssw.demo.study.chapter5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main43 {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    // ABC=3 / DEF=4 / GHI=5 / JKL=6 / MNO=7 / PQRS=8 / TUV=9 / WXYZ=10
	    
	    String input = br.readLine();
	    int result = 0;
		
	    for(int i=0; i<input.length(); i++) {
	    	switch (input.charAt(i)) {
			case 'A': case 'B': case 'C':
				result += 3;
				break;
				
			case 'D': case 'E': case 'F':
				result += 4;
				break;
				
			case 'G': case 'H': case 'I':
				result += 5;
				break;
				
			case 'J': case 'K': case 'L':
				result += 6;
				break;
				
			case 'M': case 'N': case 'O':
				result += 7;
				break;
				
			case 'P': case 'Q': case 'R': case 'S':
				result += 8;
				break;
				
			case 'T': case 'U': case 'V':
				result += 9;
				break;
				
			default:
				result += 10;
				break;
			}
	    }
		
		bw.write(Integer.toString(result));
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