package Coding_Questions;

public class Palindrome {

	public static void main(String[] args) {
		int n = 121;
		int sum = 0, remainder, temp = n;
		while (n > 0) {
			remainder = n % 10; // n= 121 : 121%10 = 1 // n=12 : 12%10 =2 n=1 ://1%10 =1
			sum = (sum * 10) + remainder; // 0*10+1 = 1 // 1*10+2= 12 // 12*10+1 = 121
			n = n / 10; // 121/10 = 12 //12/10 =1 //1/10= 0
		}

		if (temp == sum) {
			System.out.println("palindrome");
		}

		else {
			System.out.println("not palindrome");
		}
	}
}
