//https://www.geeksforgeeks.org/quickselect-algorithm/
public class QuickSelect {
	
	public static long numberOfcomparison=0; 

	//Standard partition process of QuickSort(). 
	//It considers the last element as pivot 
	//and moves all smaller element to left of 
	//it and greater elements to right 
	static int partition(int arr[], int l, int r){ 
		int x = arr[r], i = l; 
		for (int j = l; j <= r - 1; j++) { 
			if (arr[j] <= x) { 
				int zz = arr[i]; 
				int cc = arr[j]; 
				arr[i] = cc; 
				arr[j]=zz; 
				//swap(arr[i], arr[j]); 
				i++; 
			} 
			numberOfcomparison++; 
		} 
		//swap(arr[i], arr[r]);
		int vv = arr[i];
		int bb = arr[r];
		arr[i] = bb;
		arr[r] = vv; 
		return i; 
	} 

	//This function returns k'th smallest  
	//element in arr[l..r] using QuickSort  
	//based method.  ASSUMPTION: ALL ELEMENTS 
	//IN ARR[] ARE DISTINCT 
	static int kthSmallest(int arr[], int l, int r, int k){ 
		// If k is smaller than number of  
		// elements in array 
		if (k > 0 && k <= r - l + 1) { 
			numberOfcomparison++; 
			// Partition the array around last  
			// element and get position of pivot  
			// element in sorted array 
			int index = partition(arr, l, r); 

			// If position is same as k 
			if (index - l == k - 1) { 
				return arr[index]; 
			}
			numberOfcomparison++; 
			// If position is more, recur  
			// for left subarray 
			if (index - l > k - 1) {  
				return kthSmallest(arr, l, index - 1, k); 
			}
			numberOfcomparison++; 
			// Else recur for right subarray 
			return kthSmallest(arr, index + 1, r,k - index + l - 1); 
		} 
		//numberOfcomparison++; 

		// If k is more than number of  
		// elements in array 
		return Integer.MAX_VALUE; 
	} 
	
	public static void SortMe(int []arr,int pl) {
		numberOfcomparison=0; 
		int k = pl; 
		int n = arr.length; 
		int a = kthSmallest(arr, 0, n - 1, k);
		
		System.out.println("Number Of Comparison : "+numberOfcomparison);
		System.out.println("Median is            : "+a);		
	} 
}