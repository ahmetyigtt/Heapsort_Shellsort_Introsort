  

  public class HeapSort {
  
    public void sort(int arr[]) {
      int n = arr.length;
  
      
      buildMaxHeap(arr,n);      
  
      
      for (int i = n - 1; i >= 0; i--) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
  
        
        heapify(arr, i, 0);
      }
    }
    
   public void buildMaxHeap(int arr[],int n) {    
	   
	   for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(arr, n, i);
	      }
	   
	   
   }
    
    
  
    public void heapify(int arr[], int n, int i) {
      
      int largest = i;
      int l = 2 * i + 1;
      int r = 2 * i + 2;
  
      if (l < n && arr[l] > arr[largest])
        largest = l;
  
      if (r < n && arr[r] > arr[largest])
        largest = r;
  
      
      if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
  
        heapify(arr, n, largest);
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
