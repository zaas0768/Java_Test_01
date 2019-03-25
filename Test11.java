import java.util.Scanner;

	public class SumNumber {
		public void doSum() {
			int number1 = 0;
			int number2 = 0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("숫자 : ");
			number1 = scan.nextInt();
			
			System.out.println("숫자 : ");
			number2 = scan.nextInt();
			
			Sum2 sum2 = new Sum2(); //Sum2 sum2는 다름
			int result = sum2.sumNumbers(number1, number2); //result 소문자로 사용하기도 함.
			System.out.println("두개의 숫자의 합은 " + (number1 + number2) + "입니다.");
		}
	}


