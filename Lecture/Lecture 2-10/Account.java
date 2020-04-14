public class Account {

  private String name; //data hiding for security reasons
  private double balance;

  /*Constructor - initializes the variable members of the class
   * same name of class
   * default constructors are automatic if a constructor is not declared
   * can be used to overload - same name but different number of parameters or different types of parameters
   * no return type

  */

  //Default constructor
  public Account() {
    name = "";
    balance = 0;
  }

  // Constructor
  public Account (String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  //read access name
  public String getName() {
    return name;
  }

  //write access name
  public void setName(String name) {
    this.name = name; //pointer to the class with the 'name' variable --> stores the name
  }

  //read access balance
  public double getBalance() {
    return balance;
  }

  //write access balance
  public void setBalance(double balance) {
    this.balance = balance;
  }


}
