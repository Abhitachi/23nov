package geek_assignment_26;
import java.util.Scanner;
public class DiffOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] diff=new int[n];
		System.out.println("Enter the elements of First array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of Second array");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("Diff array of elements");
		for(int i=0;i<diff.length;i++) {
			diff[i]=a[i]-b[i];
			System.out.print(diff[i]+" ");
		}
		
	}

}
