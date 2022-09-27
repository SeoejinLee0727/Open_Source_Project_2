/*예제 3-7 : 배열에 입력 받은 수 중 제일 큰 수 찾기*/
//양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라. 

import java.util.Scanner;
public class ArrayAccess {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int Array [] = new int[5];
		int max=0;
		System.out.println("양수 5개를 입력하세요");
		
		for(int i=0; i<5; i++) {
			Array [i] = scanner.nextInt();  // 정수를 입력받아 배열에 저장
			if(Array[i] > max)  // Array[i]가 가장 큰 수인 max보다 크면
				 max = Array[i];   // Array[i]를 max에 넣어준다
			
		}
		System.out.print("가장 큰 수는 " + max + "입니다.");
		
		scanner.close();
	}
}
