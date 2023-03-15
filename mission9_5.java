package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission9_5 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);		
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
	
	//원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라.
	//실수 값으로 다른 점(x,y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력
	//Scanner 와 if조건,산술식 사용
	
	System.out.print("정수 3개를 입력하세요. : ");
	var a = scan.nextInt();
	var b = scan.nextInt();
	var c = scan.nextInt();
	//int grade = 0;		// String 문자열		int 정수형
	
	// 분기적 if문
	if( (a+b)>c == (a+c)>b == (b+c)>a )
		System.out.println("삼각형이 가능합니다.");
	
	else
		System.out.println("삼각형이 불가능합니다");
	
	
	scan.close();

	}
	
}