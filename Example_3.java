/*Example_3*/

import java.util.Scanner;

public class Example_3 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하t세요 >>");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();

		for(int i = 0; i < num; i++){
			
			for(int j = 0; j < num - i; j++){
				System.out.print("*");
			}
			
			System.out.println("");
		}
		scanner.close();

	}
}