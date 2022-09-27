/*Example_13*/

public class Example_13 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 100; i++) {
			
			String num = Integer.toString(i);
			
			if (num.endsWith("3")||num.endsWith("6")||num.endsWith("9")) {
				System.out.print(i + " 박수 짝");
				System.out.println();
			}
		}
	}
	
}
