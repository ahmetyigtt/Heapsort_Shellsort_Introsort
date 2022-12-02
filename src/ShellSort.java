

public class ShellSort {

	public void sort(int arrayToSort[]) {
		int n = arrayToSort.length;

		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i++) {
				int key = arrayToSort[i];
				int j = i;
				while (j >= gap && arrayToSort[j - gap] > key) {
					arrayToSort[j] = arrayToSort[j - gap];
					j -= gap;
				}
				arrayToSort[j] = key;
			}
		}
	}

	// measuring the time elapsed during method is running

	 public void calculateSortingTime(int arr[]) {
		  
		  long startTime = System.nanoTime();
		  sort(arr);
		  long endTime=System.nanoTime();
		  long estimatedTime = endTime - startTime;
		  
		  double sortingTime = (double)estimatedTime/1000000;  // (in ms)
		  System.out.println(String.format("%,.4f", sortingTime));
		  
	  }
	
	
	
	

}
