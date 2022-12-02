
public class IntroSort {

	public static void sort(int[] array) {
		sort(array, 0, array.length);
	}

	
	public static void sort(int[] array, int left, int right) {
		
		int range = right - left;
		if (range < 2)
			return;

		
		int depth = (int) (2*(Math.log(range)/Math.log(2)));     
		sort(array, left, right, depth);
	}

	
	private static void sort(int[] array, int left, int right, int depth) {
		int range = right - left;

		
		if (range < 2)
			return;
		
		if (depth == 0) {
			heapSort(array, left, right);
			return;
		}

		
		int index = partition(array, left, right);
		sort(array, left, index, depth - 1);
		sort(array, index + 1, right, depth - 1);
	}

	
	private static void heapSort(int[] array, int left, int right) {
		for (int i = right / 2 - 1; i >= left; i--)
			heapify(array, right, i);
		for (int i = right - 1; i >= left; i--) {
			int temp = array[left];
			array[left] = array[i];
			array[i] = temp;
			heapify(array, i, left);
		}
	}

	private static void heapify(int[] array, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if (l < n && array[l] > array[largest])
			largest = l;
		if (r < n && array[r] > array[largest])
			largest = r;
		if (largest != i) {
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;
			heapify(array, n, largest);
		}
	}

	
	private static int partition(int[] array, int left, int right) {
		int pivot = array[right - 1];
		int i = left - 1;

		for (int j = left; j < right - 1; ++j) {
			if (array[j] <= pivot) {
				int tmp = array[++i];
				array[i] = array[j];
				array[j] = tmp;
			}
		}

		
		int tmp = array[++i];
		array[i] = array[right - 1];
		array[right - 1] = tmp;
		return i;
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