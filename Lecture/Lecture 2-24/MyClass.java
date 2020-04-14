public class MyClass {

  //static - doesnt create the same value for each instance of the class --> only one copy
  private static String staticMember1 = "";
  private final static int finalVar = 0; // when creating final members (constant values that you cannot change), make them static.
  private int var1 = 0;

  //rules for accessing static members
  /*
   * static members -> can only access static members only
   * Non-static members -> can access non-static members and static members
   * to access m1, create an instance
   */
  public void m1() {

  }

  public static void main (String[] args) {
    MyClass mc2 = new MyClass();
    mc2.m1();

    MyClass mc = null; //creating pointer of type MyClass and initialize to null
    mc = new MyClass(); // creating an instance
    mc.staticMember1 = "new value"; //OK but not conventional
    MyClass.staticMember1 = "new value"; //conventional

    MyClass mc3 = new MyClass();
    MyClass mc4 = new MyClass();

    System.out.println(mc4.staticMember1);

  }
}
