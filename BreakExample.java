/*예제 3-6 : break 문을 이용하여 while 문 벗어나기*/
//계속 입력하다가 "exit"이 입력되면 while 문을 벗어나도록 break 문을 활용하는 프로그램을 작성하라.

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine(); // 한 줄씩 저장
			
			if(text.equals("exit")) // (text == "exit")
				break; 	//while문 끝
		}
		
		System.out.println("시스템을 종료합니다.");
		scanner.close();
	}
}
