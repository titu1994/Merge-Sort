/**
 * 
 */
package Sort;


public class MergeSort {
	private static int arr[];
	private static int temp[];
	
	private MergeSort(){
		
	}
	
	public static void sort(int array[]){
		
		if(array == null || array.length == 0){
			return;
		}
		
		arr = array;
		
		int size = arr.length;
		temp = new int[size];
		
		mergeSort(0, size - 1);
	}

	private static void mergeSort(int leftSize, int rightSize) {
		
		if(leftSize < rightSize){
			
			int middle = leftSize + (rightSize - leftSize)/2;
			
			mergeSort(leftSize, middle);
			mergeSort(middle+1, rightSize);
			
			merge(leftSize, middle, rightSize);
			
		}
		else{
			return;
		}
		
	}

	private static void merge(int leftSize, int middle, int rightSize) {
		
		System.arraycopy(arr, 0, temp, 0, rightSize+1);
		
		int i = leftSize;
		int j = middle+1;
		int k = leftSize;
		
		while(i <= middle && j <= rightSize){
			
			if(temp[i] <= temp[j]){
				arr[k] = temp[i];
				i++;
			}
			else{
				arr[k] = temp[j];
				j++;
			}
			
			k++;
		}
		
		while(i <= middle){
			
			arr[k] = temp[i];
			i++;
			k++;			
		}
	}
	
}