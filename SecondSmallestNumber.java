public class SecondSmallestNumber {
public static void main(String[] args) {
	    int[] arr = {12, 45, 67, 23, 89, 55};
         int firstNumber = arr[0];
         int secondNumber =  arr[1];
         
         for(int i = 0; i<arr.length;i++) {
        	 if (arr[i]> firstNumber) {
        		 secondNumber = firstNumber;
        		 firstNumber = arr[i];
        	 }
        	 else if(arr[i]>secondNumber && arr[i] != firstNumber){
        		 secondNumber = arr[i];
        	 }
         }
	    System.out.println("Second Largest number of the given array is " + secondNumber);   
}
}
