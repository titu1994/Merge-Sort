package Sort;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 elements");
		
		int a[] = new int[5];
		
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}
		
		MergeSort.sort(a);
		
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+"\t");
			
		}
	}

}
