
// 	38,52,9,18,6,62,13


// In this phase (38,6) will be swap
//	FIRST PHASE
// IT Start From First position
// 1: It search the Smallest Element in a Whole List
// 2: If found the smallest element  in a list the it swap the small 
//	  element to the first Element 
// NEW LIST WILL BE AFTER SWAPPING
// 3: 6,52,9,18,38,62,13


// In this phase (52,9) will be swap
// SECOND PHASE
// IT Start From Second position
// 4: It search the Smallest Element in a Whole List 
// 5: If found the smallest element  in a list the it swap the small 
//	  element to the first Element 
// NEW LIST WILL BE AFTER SWAPPING
// 3: 6,9,52,18,38,62,13


// In this phase (52,13) will be swap
// THIRD PHASE
// IT Start From Third position
// 4: It search the Smallest Element in a Whole List 
// 5: If found the smallest element  in a list the it swap the small 
//	  element to the first Element 
// NEW LIST WILL BE AFTER SWAPPING
// 3: 6,9,13,18,38,62,52


// Does not find a smallest Number 
// FOURTH PHASE
// IT Start From FOURTH position
// 4: It search the Smallest Element in a Whole List 
// 5: If found the smallest element  in a list the it swap the small 
//	  element to the first Element
// In this phase Does not find a smallest a number 
// After the fourth position
// NEW LIST WILL BE
// 3:  6,9,13,18,38,62,52


// Does not find a smallest Number
// FIFTH PHASE
// IT Start From FIFTH position
// 4: It search the Smallest Element in a Whole List 
// 5: If found the smallest element  in a list the it swap the small 
//	  element to the first Element
// In this phase Does not find a smallest a number 
// After the fifth position
// NEW LIST WILL BE
// 3:  6,9,13,18,38,62,52


// In this phase (62,52) will be swap
// SIXTH PHASE
// IT Start From Sixth position
// 4: It search the Smallest Element in a Whole List 
// 5: If found the smallest element  in a list the it swap the small 
//	  element to the first Element
// NEW LIST WILL BE
// 3:  6,9,13,18,38,52,62


// The List Will Be Sorted

// 	---------------------
//  - 6,9,13,18,38,52,62-
// 	---------------------

//We use min because we want to save outer loop value i
//Pseudo Code 
// 1:	int[] a={38,52,9,18,6,62,13};
// 		int min,temp=0;
// 2: 	for(int i=0;i<a.length;i++)
// 3:	{
//		min=i;
// 4: 		for(int j=i+1;j<a.length;j++)
// 5: 			if(a[j]<a[min])
// 6:			{
//					min=j;
//				}
//		temp=a[i]
//		a[i]=a[min]
//      a[min]=a[i]





public class SelectionSort {
	
	int[] a;
	public SelectionSort(int[] a) {
		this.a=a;
	}
	
	
	public  void Sort() {
		 int n = a.length;
	        // One by one move boundary of unsorted subarray
	        for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (a[j] < a[min_idx])
	                    min_idx = j;
	          //Swap the Element
	            int temp = a[min_idx];
	            a[min_idx] = a[i];
	            a[i] = temp;
	        }
	}
	public  void print() {
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+"-->");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a= {38,52,9,18,6,62,13};
		SelectionSort ss=new SelectionSort(a);
		ss.print();
		ss.Sort();
		System.out.println("Sorted Data");
		ss.print();
		
	}

}
