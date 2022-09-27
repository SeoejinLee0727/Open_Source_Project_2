/*Example_5*/

import java.util.Scanner;

public class Example_5 {
	
	public static void main(String[] args) {
		
		int intArray[] = new int[10];
		int threeMultiple[] = new int[10];


		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하세요>>");
		
		for (int i = 0; i < 10; i++) {
			intArray[i] = scanner.nextInt();
			if (intArray[i] % 3 == 0) {
				threeMultiple[i] = intArray[i];
			}
		}

		System.out.print("3의 배수는 ");
		
		for (int i = 0; i < 10; i++) {
			if (threeMultiple[i] != 0) {
				System.out.print(threeMultiple[i] + " ");
			}
		}
		scanner.close();
		
	}
}