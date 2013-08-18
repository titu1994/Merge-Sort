package Sort;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {
	
	private int arr[];
	private int arrM[];
	private int arrI[];
	
	@Before
	public void setUp() throws Exception {
		
		arr = new int[1000];
		arrM = new int[100000];
		arrI = new int[100000000];
		
		
		Random r = new Random();
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = r.nextInt(arr.length);
		}
		
		r = new Random();
		
		for(int i = 0; i < arrM.length; i++){
			arrM[i] = r.nextInt(arrM.length);
		}
		
		r = new Random();
		
		for(int i = 0; i < arrM.length; i++){
			arrI[i] = r.nextInt(arrM.length);
		}	
		
	}


	@Test
	public void test() {
		
		MergeSort.sort(arr);
		
	}
	
	
	@Test
	public void testMassize(){
		
		MergeSort.sort(arrM);
		
	}
	
	@Test
	public void incredibleSort(){
		
		Arrays.sort(arrI);
		
	}

}
