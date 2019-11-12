package practice01;

public class Prob05 {

	public static void main(String[] args) {
		
		int num = 99;
		
		for(int i = 0; i < num; i++) {
			String strNum = String.valueOf(i);
			int len = strNum.length();
			boolean print = false;
			
			for(int j = 0; j < len; j++) {
				char c = strNum.charAt(j);
				if(c == '3' || c == '6' || c == '9') {
					if(print == false) {
						System.out.print(i + " ");
						print = true;
					}
					System.out.print("짝");
				}
			}
			if(print) {
				System.out.print("\n");
			}
		}
	}

}
