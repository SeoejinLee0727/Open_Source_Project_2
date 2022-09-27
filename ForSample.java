/*예제 3-1 : for 문을 이용하여 1부터 10까지 합 출력*/

public class ForSample{
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<11; i++) {
			sum += i;
			System.out.print(i);  // 더하는 수 출력
			
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
			
		}
	}
}
