public class Lecture {

  public static void printSubArr(int [] arr, int start, int end) {
    if (start >= 0) {

      for (int i = start; i < end && i < arr.length; i++ ) { // used to stop from going outside of the array
        System.out.println(arr[i]);
      }

    }

  }

  public static void fun1(int x){
    x = 10;
  }

  public static void main(String[] args) {

    // x is passed by value - cannot pass by reference in Java (must do it indirectly)
    int x = 0;
    fun1(x);
    System.out.println(x);

    int arr[] = {55, 66, 9, 5, -9, 0};
    printSubArr(arr,2,10);
  }

}
