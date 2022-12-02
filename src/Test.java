import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		Array arrayE=new Array();   // arrays which include equal(E) numbers
		Array arrayR=new Array();   // arrays which include random(R) numbers
		Array arrayI=new Array();	// arrays which include incresing(I) numbers
		Array arrayD=new Array();	// arrays which include decreasing(D) numbers
		
	    
	    // ----Equal arrays-------
	    for (int i = 0; i < arrayE.array1k.length; i++) {
	    	arrayE.array1k[i]=77;
		}
	    for (int i = 0; i < arrayE.array10k.length; i++) {
	    	arrayE.array10k[i]=77;
		}
	    for (int i = 0; i < arrayE.array100k.length; i++) {
	    	arrayE.array100k[i]=77;
		}
	    
	    //---Random arrays----
	    Random random = new Random();
	    for (int i = 0; i < arrayR.array1k.length; i++) {
	    	arrayR.array1k[i]=random.nextInt(1000);
		}
	    for (int i = 0; i < arrayR.array10k.length; i++) {
	    	arrayR.array10k[i]=random.nextInt(10000);
		}
	    for (int i = 0; i < arrayR.array100k.length; i++) {
	    	arrayR.array100k[i]=random.nextInt(100000);
		}
		
		//----increasing arrays-----
	    for (int i = 0; i < arrayI.array1k.length; i++) {
	    	arrayI.array1k[i]=i;
		}
	    for (int i = 0; i < arrayI.array10k.length; i++) {
	    	arrayI.array10k[i]=i;
		}
	    for (int i = 0; i < arrayI.array100k.length; i++) {
	    	arrayI.array100k[i]=i;
		}
	    
	  //----decreasing arrays-----
	    for (int i = 0; i < arrayD.array1k.length; i++) {
	    	arrayD.array1k[i]=arrayD.array1k.length-i;
		}
	    for (int i = 0; i < arrayD.array10k.length; i++) {
	    	arrayD.array10k[i]=arrayD.array10k.length-i;
		}
	    for (int i = 0; i < arrayD.array100k.length; i++) {
	    	arrayD.array100k[i]=arrayD.array100k.length-i;
		}
		
		
		HeapSort heap =new HeapSort();
		ShellSort shell =new ShellSort();
		IntroSort intro = new IntroSort();
		
	    
	    System.out.println("/////////////////    HEAP  ////////////////");
	    System.out.println("-- Equal");
	    heap.calculateSortingTime(arrayE.array1k.clone());
	    heap.calculateSortingTime(arrayE.array10k.clone());
	    heap.calculateSortingTime(arrayE.array100k.clone());
	    System.out.println("-- Random");
	    heap.calculateSortingTime(arrayR.array1k.clone());
	    heap.calculateSortingTime(arrayR.array10k.clone());
	    heap.calculateSortingTime(arrayR.array100k.clone());
	    System.out.println("-- Increasing");
	    heap.calculateSortingTime(arrayI.array1k.clone());
	    heap.calculateSortingTime(arrayI.array10k.clone());
	    heap.calculateSortingTime(arrayI.array100k.clone());
	    System.out.println("-- Decreasing");
	    heap.calculateSortingTime(arrayD.array1k.clone());
	    heap.calculateSortingTime(arrayD.array10k.clone());
	    heap.calculateSortingTime(arrayD.array100k.clone());
	    
	    /////////////////    SHELL  ////////////////
	    System.out.println();
	    System.out.println("/////////////////    SHELL  ////////////////");
	    System.out.println("-- Equal");
	    shell.calculateSortingTime(arrayE.array1k.clone());
	    shell.calculateSortingTime(arrayE.array10k.clone());
	    shell.calculateSortingTime(arrayE.array100k.clone());
	    System.out.println("-- Random");
	    shell.calculateSortingTime(arrayR.array1k.clone());
	    shell.calculateSortingTime(arrayR.array10k.clone());
	    shell.calculateSortingTime(arrayR.array100k.clone());
	    System.out.println("-- Increasing");
	    shell.calculateSortingTime(arrayI.array1k.clone());
	    shell.calculateSortingTime(arrayI.array10k.clone());
	    shell.calculateSortingTime(arrayI.array100k.clone());
	    System.out.println("-- Decreasing");
	    shell.calculateSortingTime(arrayD.array1k.clone());
	    shell.calculateSortingTime(arrayD.array10k.clone());
	    shell.calculateSortingTime(arrayD.array100k.clone());
	    
	    /////////////////    INTRO  ////////////////
	    System.out.println();
	    System.out.println("/////////////////    INTRO  ////////////////"); 
	    System.out.println("-- Equal");
	    intro.calculateSortingTime(arrayE.array1k.clone());
	    intro.calculateSortingTime(arrayE.array10k.clone());
	    intro.calculateSortingTime(arrayE.array100k.clone());
	    System.out.println("-- Random");
	    intro.calculateSortingTime(arrayR.array1k.clone());
	    intro.calculateSortingTime(arrayR.array10k.clone());
	    intro.calculateSortingTime(arrayR.array100k.clone());
	    System.out.println("-- Increasing");
	    intro.calculateSortingTime(arrayI.array1k.clone());
	    intro.calculateSortingTime(arrayI.array10k.clone());
	    intro.calculateSortingTime(arrayI.array100k.clone());
	    System.out.println("-- Decreasing");
	    intro.calculateSortingTime(arrayD.array1k.clone());
	    intro.calculateSortingTime(arrayD.array10k.clone());
	    intro.calculateSortingTime(arrayD.array100k.clone());
	    
		
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		

	}

	
	
	

}
