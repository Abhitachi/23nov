package geek_assignment_26;
import java.util.Scanner;

public class FirstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		int[] a=new int[size];
		int index=-1;
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(n==a[i]) {
				index=i;
				break;
			}
		}
		System.out.println(index);
	}

}
