/*
Kevin Jaipersaud
CSc 221 - Assignment 1
*/

import java.util.GregorianCalendar;

public class PersonWeight {
  private String name;
  private int year; //year of birth
  private double height;
  private double weight;

  //Default constructor
  PersonWeight() {
    name = "";
    year = 0;
    height = 0.0;
    weight = 0.0;
  }

  //Constructor
  PersonWeight(String name, int year, double height, double weight) {
    this.name = name;
    this.year = year;
    this.height = height;
    this.weight = weight;
  }

  //getters
  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  public double getHeight() {
    return height;
  }

  public double getWeight() {
    return weight;
  }

  //setters
  public void setName(String name) {
    this.name = name;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  //compute age
  public int computeAge(int year) {
    int current_year = new GregorianCalendar().get(GregorianCalendar.YEAR);
    int age = current_year - year;
    return age;
  }

  //compute bmi
  public double computeBMI(double weight, double height) {
    double bmi = (weight)/(height*height);
    return bmi;
  }

}
