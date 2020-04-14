import java.util.Arrays;
public class Lecture {
  public static void main(String[] args) {
    /* Method Overloading
     * methods that have the same name must have different number of parameters and/or different types of parameters
     * the compiler distinguishes based on their signatures
     */

    /* Argument promotion
     * changing an argument's value to another type (must be a promotion --> the type that is the highest)
     * explicit conversion - add((int)9.01,9); // change the double type into type int
     */

    int[] arr = new int[10]; // declaring and initializing array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i+1;
    }

    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j]);
    }


  }
}
