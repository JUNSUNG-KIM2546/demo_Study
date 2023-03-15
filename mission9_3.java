package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission9_3 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);		
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
	
	//2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현
	//(100, 100) 과 (200, 200)의 두 점으로 이루어진 사각형이 있을때,
	//Scanner를 이용하여 정수 x와y 값을 입력받고 점(x,y)가 이 직사각형 안에 있는지 판별하는 프로그램 작성.
	
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