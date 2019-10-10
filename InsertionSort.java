//Citation 
//https://www.geeksforgeeks.org/insertion-sort/
class InsertionSort { 
	public static long numberOfcomparison=0; 
	static void sort(int arr[]) { 
		int n = arr.length; 
		for (int i = 1; i < n; ++i) { 
			int key = arr[i]; 
			int j = i - 1; 
			while (j >= 0 && arr[j] > key) { 
				numberOfcomparison++; 
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = key; 
		} 
	} 
	public static void SortMe(int []arr,int place) {
		numberOfcomparison=0; 
		sort(arr); 
		System.out.println("Number Of Comparison : "+numberOfcomparison);
		System.out.println("Median is            : "+arr[place-1]);
		print(arr);
	} 
	
	public static void print(int[] arr) {
		for(int a=0; a<arr.length; a++) {
			System.out.print(arr[a]+"  ");
		}
	}
}
//Project by Mohammed Chowdhury and Grissel Lopez