// Mock Test
import java.io.*;
import java.util.*;

public class Folder {

  // variables
  private String name;
  private float size;
  private ArrayList<String> docList;

  // nondefault constructor
  public Folder (String name, float size) {
    this.name = name;
    this.size = size;
  }

  // accessor for variable name
  public String getName() {
    return name;
  }

  // accessor for variable size
  public float getSize() {
    return size;
  }

  public ArrayList<String> getDocList() {
    return docList;
  }

  // mutator for variable size
  public void setSize(float size) {
    this.size = size;
  }

  // addDocument
  public void addDocument(String name) {

    // boolean to check if element is there
    boolean element = false;

    for (int i = 0; i < docList.size(); i++) {

      // check if element at index i equals name
      if (name.equals(docList.get(i))) {
        element = true;
        break;
      }
    }

    // if element not found, add it
    if (!element) {
      docList.add(name);
    }
  }

  public static void main(String[] args) {

// part a

    // set name to Java
    String name = "Java";

    // set size to 100.59
    float size = 100.59f;

    // declare an instance of type Folder
    Folder inst = new Folder(name, size);

// part b

    // Use scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter name: ");
    String name1 = input.nextLine();

    // add name to docList
    inst.addDocument(name1);

// part c

    // print size with 3 decimal points
    System.out.printf("Size: %.3f%n", inst.getSize());

    // print name with space of 10
    System.out.printf("Name: %10s%n", inst.getName());

    // print documents
    for (int index = 0; index < inst.getDocList().size(); ++index) {
      System.out.printf("Doc: %s%n", inst.getDocList().get(index));
    }

    input.close();
  }

}
