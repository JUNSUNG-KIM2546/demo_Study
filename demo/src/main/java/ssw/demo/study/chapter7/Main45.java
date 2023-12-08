package ssw.demo.study.chapter7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main45 {
	 public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    int[][] listA;
	    int[][] listB;
	    int[][] listResult;
	    
	    String input[] = br.readLine().split(" ");
	    
	    int co1 = Integer.parseInt(input[0]);
	    int co2 = Integer.parseInt(input[1]);
	    
	    // 배열 크기 설정
	    listA = new int[co1][co2];
	    listB = new int[co1][co2];
	    listResult = new int[co1][co2];
	    
	    // A리스트에 입력 값 넣기
		for(int i=0; i<co1;i++) {
			String put[] = br.readLine().split(" ");
			for(int j=0; j<co2; j++) {
				listA[i][j] = Integer.parseInt(put[j]);
			}
		}
		// B리스트에 입력 값 넣기
		for(int i=0; i<co1;i++) {
			String put[] = br.readLine().split(" ");
			for(int j=0; j<co2; j++) {
				listB[i][j] = Integer.parseInt(put[j]);
			}
		}
		// Result리스트에 입력 값 더해서 넣기
		for(int i=0; i<co1;i++) {
			for(int j=0; j<co2; j++) {
				listResult[i][j] = listA[i][j] + listB[i][j];
			}
		}
		// 답 출력
		for (int i=0; i< listResult.length; i++) {
			for (int j=0; j< listResult[i].length; j++) {
				System.out.print(listResult[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
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