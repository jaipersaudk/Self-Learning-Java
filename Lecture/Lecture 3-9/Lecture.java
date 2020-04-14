public class Lecture {
  public static void main(String[] args) {

    String line = "Item1  Item2";
    line.split("\t"); // looking for tabs
    String[] arr = line.split("\t");

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    if (arr.length != 2) {
      System.out.println("Skipping line: " + line);
    }
  }
}
