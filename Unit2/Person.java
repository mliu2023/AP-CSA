/**
* Class to create a person.
* @author Max Liu
* @version 1.0
*/
public class Person{
  // fields
  private String name;
  private double weight;
  private double height;
/**
* Constructor for a person.
* @param name The name of the person.
* @param weight The weight of the person in kg.
* @param height The height of the person in meters.
*/
  public Person(String name, double weight, double height){
    this.name = name;
    this.weight = weight;
    this.height = height;
  }
/**
* No-args constructor for a person.  The person is named Bob.
* This person has a weight of 78.5 kg and a height of 1.9 meters.
*/
  public Person(){
    this("Bob", 78.5, 1.9);
  }

  // accessors
  public String getName(){return name;}
  public double getWeight(){return weight;}
  public double getHeight(){return height;}
  // modifiers
  public void setName(String name){this.name = name;}
  public void setWeight(double weight){this.weight = weight;}
  public void setHeight(double height){this.height = height;}
/**
* This method calculates the BMI of a person.
* @return The BMI.
*/
  public double getBMI(){
    return (weight/(height*height));
  }
/**
* This method allows a user to print a person.
* @return The name, weight, and height.
*/
  public String toString(){
    return "Name: " + name + "\nWeight: " + weight + "\nHeight: " + height;
  }
/**
* This method tests whether two people are equal.
* @return false because two people are never equal.
*/
  public boolean equals(Person other){
    return false;
  }
}
