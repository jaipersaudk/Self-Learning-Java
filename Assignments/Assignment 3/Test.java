import java.util.Scanner;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
// import java.io.ArrayIndexOutOfBoundsException;
import java.util.Arrays;
import java.util.ArrayList;


/* how to ask user for input file */
public class Test {

  // public final static String filename = "MorseCodes.txt";
  private static ArrayList<MorseCode> list = new ArrayList<>();
  private static ArrayList<String> enc = new ArrayList<>();
  private static ArrayList<Character> clist = new ArrayList<>();

  public static void openUserFile(String filename) throws Exception{

    // private final ArrayList<MorseCode> listMorseCodes = new ArrayList<>();
    char c;
    String s;
    String line;
    String line2 = "A";
    String[] header = new String[2];
    // MorseCode ch = new MorseCode(c, line2);

    try {

      Scanner scanner = new Scanner(new FileInputStream(new File(filename))); //how to input txt file into scanner

      while (scanner.hasNext()) {

        // String[] header;
        line = scanner.nextLine();

        if (line.isEmpty()) {
          continue; //if line is empty, skip
        }
        if (line.contains("\t")) {

          header = line.split("\t");
          c = header[0].charAt(0);
          MorseCode ch = new MorseCode(c, header[1]);
          MorseCode a = ch;
          char d = ch.getCharacter();
          String e = ch.getEncoding();
          // String a = String.valueOf(ch.getCharacter());
          // String b = ch.getEncoding();
          // MorseCode a = ch.getCharacter();
          // MorseCode b = ch.getEncoding();
          list.add(a);
          clist.add(d);
          enc.add(e);
          // list.add(a+"\t"+b);
          // list.add(ch);

          // System.out.println(character);

        }
        else {
          System.out.println("Invalid line: "+line); //if line doesnt have two entries, then print invalid line
        }




        // header = line.split("\t");
        // System.out.println(Arrays.toString(header));
        /*
        try {
          System.out.println(header[0] +"\t" +header[1]);
          // System.out.println(header[1]);
        }

        catch (ArrayIndexOutOfBoundsException ex) {
          continue;
        }
        */






        /*
        if (line.isEmpty()) {
          continue; //if line is empty, skip
        }
        if (line.contains("\t")) {
          System.out.println(character);

        }
        else {
          System.out.println("Invalid line: "+line); //if line doesnt have two entries, then print invalid line
        }
        */

        // MorseCode c = new MorseCode(character, line);
        // list.add(c);
        // c.setCharacter(character);
        // MorseCode.setEncoding(line);
        // System.out.println(character);

    }

    /*
    for (int i = 0; i < list2.size(); i++) {
      System.out.println(list2.get(i));
    }
    *.


    /*
    for (int i = 0; i < clist.size(); i++) {
      System.out.println(clist.get(i));
    }
    */



  }








    catch (FileNotFoundException e) {
      System.out.println("Failed to open file: " +filename);
    }

}




  public static void printList() {

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }

  public static void encodeString(String input) {
    char[] string_Char = input.toCharArray();

    for (int i = 0; i < string_Char.length; i++) {

      // if lowercase letters
      if (Character.isLowerCase(string_Char[i])) {
        char fUpper = Character.toUpperCase(string_Char[i]);
        int a = clist.indexOf(fUpper);
        System.out.print(enc.get(a)+ " ");
      }

      // check if array has the character and print respective Morse Code
      else if (clist.contains(string_Char[i])) {
        int a = clist.indexOf(string_Char[i]);
        System.out.print(enc.get(a)+ " ");
      }

      // account for spaces

      else if (string_Char[i] == 32) {
        // System.out.print(" ");
        continue;
      }


      // if unknown character print ?
      else {
        System.out.print("? ");
      }
    }

    System.out.print("\n");


    /*
    for (int i = 0; i < string_Char.length; i++) {
      System.out.println(string_Char[i]);
    }
    */

  }

  public static void encodeFile(String encode_file) throws Exception {

    String line;

    try {
      Scanner scanner = new Scanner(new FileInputStream(new File(encode_file))); //how to input txt file into scanner

      while (scanner.hasNext()) {

        line = scanner.nextLine();
        encodeString(line);


      }

    }

    catch (FileNotFoundException e) {
      System.out.println("Failed to open file: "+encode_file);
    }
  }


  public static void main(String[] args) throws Exception{

    String filename = "MorseCodes.txt";
    openUserFile(filename);

    // printList();

    String input = "Z";
    // encodeString(input);
    String encode_file = "abc.txt";
    encodeFile(encode_file);
  }
}
