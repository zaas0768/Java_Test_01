import java.util.Scanner;

public class 문자비교 {
public static void main(String[] args) {
	String a = "hello";
	String b = "hello";
	Scanner scan = new Scanner(System.in);
	Scanner c = scan.nextLine();
	
	
	System.out.println(c == b);
	System.out.println(a.equals(b));
	
	
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	
	
}
}
