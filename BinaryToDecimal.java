package geek_assignment_26;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number");
		int n=sc.nextInt();
		int dec=0,i=0;
		while(n!=0) {
			dec+=(n%10)*Math.pow(2, i);
			n=n/10;
			i++;
		}
		System.out.println(dec);
	}

}
