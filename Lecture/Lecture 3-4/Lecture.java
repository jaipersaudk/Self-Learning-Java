import java.util.Arrays;
public class Lecture {


  public static void main(String[] args) {

    int arr[] = {5, 9, -1, 0, -99, 8, 10};

    for (int i = 0; i<arr.length; i++) {
      System.out.println(arr[i]);
    }

    Arrays.sort(arr);

    for (int i = 0; i<arr.length; i++) {
      System.out.println(arr[i]);
    }

    

  }
}
