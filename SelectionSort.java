//https://www.geeksforgeeks.org/selection-sort/
class SelectionSort 
{ 
	public static int place = 0; 
	public static long numberOfcomparison=0; 

	static void sort(int arr[]) 
	{ 
		int n = arr.length; 
		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++){ 

			if(i==place) {
				return; 
			}

			// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) { 
				numberOfcomparison++; 
				if (arr[j] < arr[min_idx]) { 
					min_idx = j; 
				}
			}
			// Swap the found minimum element with the first 
			// element 
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		} 
	} 

	// Prints the array 
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	
	public static void SortMe(int []arr,int pl) {
		numberOfcomparison=0; 
		place = pl; 
		sort(arr); 
		
		System.out.println("Number Of Comparison : "+numberOfcomparison);
		System.out.println("Median is            : "+arr[place-1]);
		//printArray(arr);
	} 
} 
/* This code is contributed by Rajat Mishra*/