import java.util.*;

public class Notes {
  public static void main (String[] args) {
    /* conditional statement (three parts)
     - First Part -> boolean condition that checks if the statement is true or false (followed with ?)
     - if true, then the second part of the condition statement is carried out
     - if false, then the third part of the condition statement is carried out
    */

    int a = 7;
    int b = 8;

    System.out.println((a > b)? a+1 : b+2); // is a>b? --> true: a+1; false: b+2

    /* Switch Statements
     - evaluates the expression and matches it to one of the cases below it
     - if one of the cases are found, then it completes that case and finishes
     - if none of the cases match, then it goes to the default cases
    */

    Scanner scan = new Scanner (System.in);
    String name;
    name = scan.nextLine();

    int age;
    switch (name)
    {
      case "Kevin":
        age = 20;
        System.out.println(age);
        break; // we use the break statement to get out of the switch statement; if not, the compiler will continue through the following cases

      case "Vanessa":
        age = 33;
        System.out.println(age);
        break;

      case "Melisa":
        age = 26;
        System.out.println(age);
        break;

      default:
        System.out.println("There is no one of that name");
    }
     /* Do Loop
      - similar to while loop, except that do loops are executed at least once
      - at the end of a do loop, there is a while loop to check if the do loop should be executed again
     */

     int x = 1;
     int y = 1;
     do
     {
       x += 1;
       y *= 2;
     }
     while (y < 50);

     System.out.println(x);

     /* For Loops
      - For-each loops --> traversing items in a collection or an array
     */

     /*
     for (int i = 0; i < arr.length; i++)
     {
       type var = arr[i];
       other statements;
     }
     */

     // the above is equivalent to this:
     /*
     for (type var : array)
     {
       other statements;
     }
     */
  }
}
