package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		/*a. 입력 받은 숫자가 홀수인 경우에는, 0 부터 입력 값까지 홀수의 합을 출력합니다.
		*- 예제 : 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
		*b. 입력 받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다.
    	*- 예제 : 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
		*/
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = scanner.nextInt();
			int sum = 0;
			for(int i = (num % 2); i <= num; i+=2) {
				sum += i;
			}
			System.out.println("결과 값 : "+sum + "\n");
		}
		
		
	}

}
