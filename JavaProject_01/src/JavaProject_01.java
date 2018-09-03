import java.util.Scanner;

public class JavaProject_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a<=0) {
			System.out.println("다시 입력하세요.");
			scan.nextInt();
		}
		int b = scan.nextInt();
		if(b>=10) {
			System.out.println("다시 입력하세요.");
			scan.nextInt();
		}
		else
			System.out.println(a+b);
	}

}
