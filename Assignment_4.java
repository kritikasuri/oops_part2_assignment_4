import java.util.Scanner;

public class string_reverse {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the string : ");
		String str = scan.nextLine();
		String reverse_str = "";
		
		int length = str.length();
		for (int i = length-1; i >= 0; i--) {
			reverse_str= reverse_str + str.charAt(i);
		}
		System.out.println("Reverse string is : "+reverse_str);
	}
}
