/*Example_7*/
public class Example_7 {
	public static void main(String[] args) {
		
		int intArray[] = new int [10];
		int sum = 0;
		double avg;

		for (int i = 0; i<10; i++) {
			int ranNum = (int)(Math.random()*10 + 1);
			intArray[i] = ranNum;
			sum += ranNum;
		}

		avg = sum / 3.0;

		System.out.print("랜덤한 정수들 : ");
		
		for (int i = 0; i < 10; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		System.out.println();
		System.out.printf("평균은 : %.1f", avg);
	}
}