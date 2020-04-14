/*
Kevin Jaipersaud
CSc 221 - Assignment 2
*/

import java.util.Scanner;
import java.security.SecureRandom;

public class SkeeBall {

  private final static int MAX_PLAYS = 8;
  public int hall_value; //variable for point system

// function to change random number into a hall value
  public int num_to_score(int n) {
    /* Scoring Guide
     * [0-35) = 0 --> 35%
     * [35-55) = 10 --> 20%
     * [55-70) = 20 --> 15%
     * [70-85) = 40 --> 15%
     * [85-95) = 60 --> 10%
     * [95-100) = 80 --> 5%
     */
    if (n >= 0 && n < 35) {
      hall_value = 0;
    }
    if (n >= 35 && n < 55) {
      hall_value = 10;
    }
    if (n >= 55 && n < 70) {
      hall_value = 20;
    }
    if (n >= 70 && n < 85) {
      hall_value = 40;
    }
    if (n >= 85 && n < 95) {
      hall_value = 60;
    }
    if (n >= 95 && n < 100) {
      hall_value = 80;
    }
    return hall_value;
  }

  public void play(int arr[]) {

    SecureRandom randomNumbers = new SecureRandom();

    for (int a = 0; a < arr.length; a++) {

      int rand1 = randomNumbers.nextInt(100); //generate a random number from [0,100)
      int score = num_to_score(rand1); //find the hall value of the Random number

      // print response based on hall value
      switch (score) {
        case 0:
          arr[a] = 0;
          System.out.println("Rolling Ball #" +(a+1) +"." +" " +"Landed in 0");
          break;
        case 10:
          arr[a] = 10;
          System.out.println("Rolling Ball #" +(a+1) +"." +" " +"Landed in 10");
          break;
        case 20:
          arr[a] = 20;
          System.out.println("Rolling Ball #" +(a+1) +"." +" " +"Landed in 20");
          break;
        case 40:
          arr[a] = 40;
          System.out.println("Rolling Ball #" +(a+1) +"." +" " +"Landed in 40");
          break;
        case 60:
          arr[a] = 60;
          System.out.println("Rolling Ball #" +(a+1) +"." +" " +"Landed in 60");
          break;
        case 80:
          arr[a] = 80;
          System.out.println("Rolling Ball #" +(a+1) +"." +" " +"Landed in 80");
          break;
      }

   }

 }

  public void showStats(int arr[]) {
    int total = 0; // keep track of total score

    System.out.printf("%18s%n %8s %7s%n %s%n", "+-------+-------+", "Play #", "Score", "+-------+-------+");

    for (int i = 0; i < arr.length; i++) {
      total = total + arr[i]; //update total score
      System.out.printf("%6s %8s%n",i+1, arr[i]); //print the scores
    }
    System.out.printf("%s%n %s %s%n"," ","Total: ", total); //print the total
  }

  public static void main(String[] args) {

    int plays; // the number of plays for the game

    // prompt user and wait for valid response
    while (true) {
      System.out.print("How many plays (1-8)? ");
      Scanner input = new Scanner(System.in);
      plays = input.nextInt();

      // if out of range, prompt the user again
      if (plays > MAX_PLAYS || plays < 1) {
        System.out.println("Invalid input. Please enter a number between 1 and 8.");
      }

      // if valid input, end the while loop
      else {
        break;
      }
    }

    //create array with size plays to keep track of data
    int arr[] = new int[plays];

    //plays
    SkeeBall x = new SkeeBall(); // in order to use the non-static function play
    x.play(arr); //insert defined array to store data

    //showStats
    SkeeBall y = new SkeeBall(); // in order to use the non-static function showStats
    y.showStats(arr); //insert array with stored data to print the data

  }

}
