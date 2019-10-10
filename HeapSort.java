// Java program for implementation of Heap Sort 
import java.io.*; 
public class HeapSort{       
	// To heapify a subtree rooted with node i which is 
	// an index in arr[]. n is size of heap 
	public static int place = 0; 
	public static long numberOfcomparison=0; 
	
	static void heapify(int arr[], int n, int i){ 
		int smallest = i; // Initialize smalles as root 
		int l = 2 * i + 1; // left = 2*i + 1 
		int r = 2 * i + 2; // right = 2*i + 2 

		// If left child is smaller than root 
		if (l < n && arr[l] < arr[smallest]) { 
			smallest = l; 
		}
		numberOfcomparison++;
		// If right child is smaller than smallest so far 
		if (r < n && arr[r] < arr[smallest]) { 
			smallest = r; 
		}
		numberOfcomparison++;
		// If smallest is not root 
		if (smallest != i){ 
			int temp = arr[i]; 
			arr[i] = arr[smallest]; 
			arr[smallest] = temp; 
			// Recursively heapify the affected sub-tree 
			heapify(arr, n, smallest); 
		} 
		numberOfcomparison++;
	}   
	// main function to do heap sort 
	static void heapSort(int arr[], int n){ 
		// Build heap (rearrange array) 
		for (int i = n / 2 - 1; i >= 0; i--) { 
			heapify(arr, n, i); 
		}
		// One by one extract an element from heap 
		for (int i = n - 1; i >= place; i--){               
			// Move current root to end 
			int temp = arr[0]; 
			arr[0] = arr[i]; 
			arr[i] = temp; 
			// call max heapify on the reduced heap 
			heapify(arr, i, 0); 
		} 
	} 
	/* A utility function to print array of size n */
	static void printArray(int arr[], int n){ 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 
	// Driver program 
	
	public static void SortMe(int []arr,int pl) {
		numberOfcomparison=0; 
		place = pl; 
		heapSort(arr,arr.length); 
		System.out.println("Number Of Comparison : "+numberOfcomparison);
		System.out.println("Median is            : "+arr[pl]);
		
	} 
//	public static void main(String[] args){ 
//		int arr[] = { 4,89,2,1,8,9,77,1,5,19 }; 
//		int n = arr.length; 
//		heapSort(arr, n);  
//		System.out.println("Sorted array is "); 
//		printArray(arr, n); 
//	} 
} 
// This code is contributed by vt_m. 