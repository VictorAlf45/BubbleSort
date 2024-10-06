
public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {15, 4, 18, 8, 19, 22, 24, 59, 59, 20, 18, 12, 36, 42, 9};

		int i;
		int j;
		int tempvar;
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]){
					tempvar = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tempvar;
				}
			}
		}
		printArray(arr);
		
	}
	
	public static void printArray(int[] otherArray) {
		int i;
		for(i = 0; i < otherArray.length; i++) {
			System.out.print(otherArray[i] +" ");
		}
	}
}
