/*
Kevin Jaipersaud
CSc 221 - Assignment 3
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;


public class MorseCodeConvert {

  // list of MorseCodes
  private static ArrayList<MorseCode> listMorseCodes = new ArrayList<>();

  // Non-default Constructor
  MorseCodeConvert(String filename) throws Exception {

    String[] header = new String[2]; // to split txt file into columns
    String line; // read lines of txt file
    char c; // character of txt file

    try {

      Scanner scanner = new Scanner(new FileInputStream(new File(filename))); //open file

      // while there are more lines to read
      while (scanner.hasNext()) {

        // read line of txt file
        line = scanner.nextLine();

        // if line is empty, skip
        if (line.isEmpty()) {
          continue;
        }

        // if line contains two columns
        if (line.contains("\t")) {

          // split line into two columns
          header = line.split("\t");

          // character is the first letter of header[0]
          c = header[0].charAt(0);

          // check if valid character
          MorseCode Object = new MorseCode(c, header[1]);

          // add valid entries to ArrayList
          listMorseCodes.add(Object);

        }

        // print invalid lines
        else {
          System.out.println("Invalid line: "+line); //if line doesnt have two entries, then print invalid line
        }

      }

      scanner.close();

    }

    // if file cannot open
    catch (FileNotFoundException e) {
      System.out.println("Failed to open file: " +filename);
    }

  }

  public void printEncodingList() {
    // print valid character and encoding
    for (MorseCode i : listMorseCodes) {
      System.out.print(((MorseCode) i).getCharacter()+"\t");
      System.out.println(((MorseCode) i).getEncoding());
    }
  }

  public static void encodeString(String input) throws Exception{

    // if string is null or empty
    try {
      if (input == null)
        System.out.println("");
    }

    catch (NullPointerException e) {
      System.out.println("\n");
    }

    if (input == "") {
      System.out.println("\n");
    }

    // reading string into array of characters
    char[] string_Char = input.toCharArray();

    for (int i = 0; i < string_Char.length; i++) {
      for (MorseCode j : listMorseCodes) {

        // if character is lower case, change to uppercase
        if (Character.isLowerCase(string_Char[i])) {
          char fUpper = Character.toUpperCase(string_Char[i]);

          // print encoding if valid
          if(j.getCharacter()==fUpper) {
            System.out.print(j.getEncoding()+ " ");
            break;
          }
        }

        // print encoding if valid
        else if (j.getCharacter()==(string_Char[i])) {
          System.out.print(j.getEncoding()+ " ");
          break;
        }

        // if character is a space, do nothing
        else if (string_Char[i] == ' ') {
          continue;
        }

        // if at the end of Arraylist and character doesnt equal Z, then print ?
        else if ((j.getCharacter() == 'Z') && (j.getCharacter() != string_Char[i])) {
          System.out.print("? ");
          break;
        }

        else {
          continue;
        }
      }
    }
    // next line after converting string (line in text)
    System.out.print("\n");
  }

  public static void encodeFile(String encode_file) throws Exception {

    // reads line in txt file
    String line;

    try {
      Scanner scanner = new Scanner(new FileInputStream(new File(encode_file))); //open txt file

      while (scanner.hasNext()) {

        // read line of txt
        line = scanner.nextLine();

        // convert line of text (which is a string)
        encodeString(line);
      }

      scanner.close();
    }

    // if file doesnt open
    catch (FileNotFoundException e) {
      System.out.println("Failed to open file: "+encode_file);
    }

  }

}
