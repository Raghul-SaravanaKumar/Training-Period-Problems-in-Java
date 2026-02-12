public class CountOddOrEven {
public static void main(String[] args) {
	int [] arr = {10, 3, 8, 7, 6, 2}; 
	int odd_number = 0;
	int even_number = 0;
	for(int i = 0; i<arr.length;i++) {
		if( arr[i] % 2== 0) {
		    even_number++;
		}
		else {
			odd_number++;
		}
	}
	System.out.println("Even count : " + even_number);
	System.out.println("Odd count : " + odd_number);

}
}
