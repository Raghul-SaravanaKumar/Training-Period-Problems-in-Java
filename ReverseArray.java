public class ReverseArray {

  public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};
    int n = arr.length;
    System.out.println("The entered arry");
    for(int i = 0;i<=4;i++){
      System.out.println( arr[i] + "");
    }
    System.out.println("The reversed array");
    {
      for(int j = n-1;j>=0;j--) {
        System.out.println(arr[j] + "");
      }
      
    }

  }

}
