public class MyClass2 {
  public static void main(String[] args) {
    int grade = 88;

// if else is better for ranges
    if (grade >= 90)
      System.out.println("A");
    else if (grade >= 80)
      System.out.println("B");
    else if (grade >= 70)
      System.out.println("C");
    else if (grade >= 60)
      System.out.println("D");
    else
      System.out.println("F");

//switches are better for distinct values (not ranges)
    switch(grade) {
    case 90:
      System.out.println("A");
      break;
    case 80:
      System.out.println("B");
      break;
    case 70:
      System.out.println("C");
      break;
    case 60:
      System.out.println("D");
      break;
    default:
      System.out.println("F");
    }
  }
}
