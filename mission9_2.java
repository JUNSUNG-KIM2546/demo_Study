package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission9_2 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);		
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
	
	//369게임을 간단히 작성해보자.1~99까지의 정수를 입력받고 정수에 3,6,9 중 하나가 있는 경우는 "박수짝"을 출력, 두개가 있는 경우는 "박수짝짝"을 출력	
	//예) 입력된 수가 13인 경우 "박수짝", 36인 경우 "박수짝짝"  출력
	
	System.out.print("(369게임) 1~99까지의 정수를 입력하세요. : ");
	var a = scan.nextInt();

	//int grade = 0;		// String 문자열		int 정수형
	
	// 분기적 if문
	if( a > 100) {
		if()
			System.out.println("삼각형이 가능합니다.");
	}
	
	else
		System.out.println("(369게임) 1~99까지의 정수를 입려하세요.");
	
	
	scan.close();

	}
	
}