/*
Kevin Jaipersaud
CSc 221 - Assignment 3
*/

public class MorseCode {

  private char character; // for valid ascii characters
  private String encoding; // morse code for valid characters
  public int value; // value used to skip invalid character encodings (1 -> blank encoding; 5 -> valid encoding)

  // Non-default Constructor
  MorseCode(char character, String encoding) throws Exception{

    //setter functions check if character and encoding values are correct; else throw exception
    setCharacter(character);

    // invalid character so encoding should be blank
    if (value == 1)
      this.encoding = "";

    // valid character so set proper encoding
    if (value == 5)
      setEncoding(encoding);
  }

  // getters
  public char getCharacter() {
    return character;
  }

  public String getEncoding() {
    return encoding;
  }

  // setters

  public void setCharacter(char character) throws Exception{

    // if value == 5, then character is valid
    value = 5;

    try {
      // check if character has ascii values from 32-90
      if ((character>=32) && (character<=90)) {
        this.character = character;
      }

      else {
        throw new Exception("java.lang.Exception");
      }
    }

    // throw exception and print invalid characters
    catch (Exception e) {
      System.out.println("java.lang.Exception: The character " +character+ " is not a supported Morse Character");

      // to make encoding blank since character isnt valid
      value = 1;
    }

  }

  public void setEncoding(String encoding) throws Exception {
    // check if encoding is null or at least 1
    if((encoding != null) && encoding.length() >= 1) {
      this.encoding = encoding;
    }

    // throw exception
    else {
      throw new Exception("The character " +character+ " is not a supported Morse Character");
    }
  }
}
