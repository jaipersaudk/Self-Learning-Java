import java.util.*; // a way to include all classes within the util library (i.e. includes the Scanner and Random classes)

public class Notes {

  enum Flavor {vanilla, chocolate, strawberry} // for example of enumerated types

  public static void main (String[] args) {
    String name1 = new String ("London");
    String name2 = "London"; // instead of writing "String name = new String("London");
    System.out.println(name1);
    System.out.println(name2);

    // Random Number generator
    int num1, num2;
    int x = 10;
    Random generator = new Random(); // class = Random; object = generator
    num1 = generator.nextInt(); //random integer value (both positive and negative)
    num2 = generator.nextInt(x); //Random integer value between 0 and x-1
    System.out.println(num1);
    System.out.println(num2);

    // enumerated types - lists all possile values for a variable; ensures that invalid values are not used

    Flavor cone1, cone2;
    cone1 = Flavor.chocolate;
    cone2 = Flavor.vanilla;

    System.out.println("Cone 1 Value: " + cone1);
    System.out.println("Cone 1 Ordinal: " + cone1.ordinal());
    System.out.println("Cone 1 Name: " + cone1.name());

    System.out.println("Cone 2 Value: " + cone2);
    System.out.println("Cone 2 Ordinal: " + cone2.ordinal());
    System.out.println("Cone 2 Name: " + cone2.name());

    /* Wrapper Classes
     - Two categories of data -> primtive values and object references
     - There are times when you want to treat primitve data as if they were objects
     - This is where we "wrap" a primitive value into an object
     - Autoboxing
          - automatic conversions between primitive types and corresponding wrapper objects
    */
  }
}
