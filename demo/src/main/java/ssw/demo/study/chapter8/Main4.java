package ssw.demo.study.chapter8;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) throws Exception {
		/*	n = 0 일 때, 초기의 점은 4개이고, 즉 2의 제곱이다. 
			중복되는 점을 빼고 총 점의 개수를 구하려면, 한 변의 점 개수² 를 해주면 된다.
			점의 개수가 p라고 할 때,
			n이 하나 늘어날 때 마다 ((p-1) + p)² 이 된다.	*/
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = 2;
        for (int i = 1; i <= n; i++) {
            res = (res-1) + res;
        }
        System.out.println(res*res);
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