import java.util.ArrayList;
import java.util.Scanner;

public class Lecture2 {

  public static void main(String[] args) {

    ArrayList<Integer> arrList = new ArrayList<Integer>(); //to dynamically allocate more space for array if needed

    Scanner keyboard = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      int val = keyboard.nextInt();
      arrList.add(val); // storing values into dynamic array
    }
    System.out.println(arrList.get(0)); //returns value at index 0
    System.out.println(arrList.contains(5)); //searches for the number and returns true/false

    //other functions are described in chapter 7, slide 140


  }
}
