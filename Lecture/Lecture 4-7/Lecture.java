// see all the shape classes and parent class

public class Lecture {

  public static void main(String[] args) {

    // up casting
    // sh is a pointer and not an actual instance
    ParentClass sh = new Rectangle();
    sh = new Circle();
    sh = new Square();

    ParentClass arr[] = new ParentClass[10];

    // up casting
    arr[0] = new Rectangle();
    arr[1] = new Square();
    arr[2] = new Circle();
    //...

    // Rectangle r = arr[0]; // arr[0] is of type ParentClass and doesnt know it belongs to Rectangle
    // you must down casting
    Rectangle r = (Rectangle) arr[0]; //USE INSTANCEOF BEFORE DOWNCASTING (SHOWN BELOW) 

    // must test if not sure about down casting
    if(arr[0] instanceof Rectangle) {
      // if arr[0] is of type Rectangle then perform the following tests
      Rectangle r = (Rectangle) arr[0];
    }

    else if (arr[0] instanceof Square) {
      Square s = (Square) arr[0];
    }

    else if (arr[0] instanceof Circle) {
      Circle c = (Circle) arr[0];
    }

    else {
      System.err.println("Cannot be done");
    }


// runtime binding only
    for (int i = 0; i < 3; i++) {

      arr[i].draw();

    }


  }
}
