
public class RecursiveBinarySearch {
		public static int binarySearch(int arr [], int l, int r,int key) {
			if(l > r) {
				return -1;
			}
			
			int mid = l + (r - l)/2;
			
		if ( arr[mid] == key) { 
			return mid;
		}
		 if (arr[mid] <   key) {
		     return  binarySearch(arr,  mid + 1, r , key);
		 
		 } else {
			 return  binarySearch(arr,   l , mid - 1, key);
		 }
	}
			
		
		
	public static void main(String[] args) {
		int arr [] = {2,5,6,7,8,9,11,12};
		int key =12;
		int index = binarySearch(arr, 0, arr.length-1,key);
			if (index != -1) {  // if index is not -1
	            System.out.println("Element " + key + " is present at index " + index); 
	        } else {
	             System.out.println("Element " + key + " is not present");
	        
	        }
		}
}







