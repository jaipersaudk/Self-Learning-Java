public class Lecture2 {

  public static void fun1(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("");

    //enhanced for loop
    for (int val : arr)
      System.out.println(val);

    /*
    * cannot be used to modify elements
     */
  }

  public static int[] copy(int[] arr) {
    int [] newArr = new int[arr.length];

    for (int i = 0; i < newArr.length; i++) {
      newArr[i] = arr[i];
    }

    return newArr;
  }


  public static void main(String[] args) {
    int arr[] = {55, 66, 9, 5, -9, 0};

    fun1(arr);
    copy(arr);

    int x[][] = new int[3][2]; //3x5 array (rows and columns)



  }
}
