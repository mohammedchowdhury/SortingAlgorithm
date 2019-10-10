import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class main  {
	static int [] arrOfNums; 
	public static void main(String[] args) throws IOException {
		//InsertionSortCalc(10,(10/2)); 
		//MergeSortCalc(100000,((100000)/2)); 
		//SelectionSortCalc(100000,(100000/2)); 
		//HeapSortCalc(100000,(100000/2)); 
		//QuickSelectSortCalc(100000,(100000/2)); 
		//MedianOfMedianCalc(100000,100000/2); 
		
	}


	
	public static void MedianOfMedianCalc(int x,int place) {
		MedianOfMedians medianOfMedian = new MedianOfMedians();
		String str = ""; 
		for(int a=1; a<=10; a++) {
			System.out.println("Iteration : " +a);
			medianOfMedian.SortMe(fillArrayOfSizeN(x),place); 
		}
	}
	
	
	public static void QuickSelectSortCalc(int x,int place) {
		QuickSelect QuickSelectSort = new QuickSelect(); 	
		for(int a=1; a<=10; a++) {
			System.out.println("Iteration : " +a);
			QuickSelectSort.SortMe(fillArrayOfSizeN(x),place);
		}
	}


	public static void HeapSortCalc(int x,int place) {
		HeapSort heapSort = new HeapSort(); 	
		for(int a=1; a<=10; a++) {
			System.out.println("Iteration : " +a);
			heapSort.SortMe(fillArrayOfSizeN(x),place);
		}
	}


	public static void SelectionSortCalc(int x,int place) {
		SelectionSort selectionSort = new SelectionSort(); 	
		for(int a=1; a<=10; a++) {
			System.out.println("Iteration : " +a);
			selectionSort.SortMe(fillArrayOfSizeN(x),place);
		}
	}


	public static void MergeSortCalc(int x,int place) {
		MergeSort mergeSort = new MergeSort(); 	
		for(int a=1; a<=10; a++) {
			System.out.println("Iteration : " +a);
			mergeSort.SortMe(fillArrayOfSizeN(x),place);
		}
	}

	public static void InsertionSortCalc(int x,int place) {
		InsertionSort insertionSort = new InsertionSort();
		for(int a=1; a<=10; a++) {
			System.out.println("Iteration : " +a);
			insertionSort.SortMe(fillArrayOfSizeN(x),place);
		}
	}

	public static int generateRandomData(int x){ // produces a random value from 1 to x
		Random rand = new Random();
		int n = rand.nextInt(x*x)+1; 
		n = (n%x)+1;  
		return n; 
	}
	public static int[] fillArrayOfSizeN(int n) {//fill the array with random Data
		arrOfNums = new int[n]; 
		for(int a=0; a<n; a++) {
			arrOfNums[a] = generateRandomData(n); 
		}
		return arrOfNums; 
	}

}