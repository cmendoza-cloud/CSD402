/**
 * Carmen Mendoza
 * CSD 402
 * Description: Starting with your code from the Module 6 Programming Assignment, create the following new class titled UseFans:
 */
package Module_7;

 import java.util.ArrayList;
 import java.util.List;
 
 class Fan {
     // Constants for speed
     public static final int STOPPED = 0;
     public static final int SLOW = 1;
     public static final int MEDIUM = 2;
     public static final int FAST = 3;
 
     // Private fields
     private int speed;
     private boolean on;
     private double radius;
     private String color;
 
     // Default constructor
     public Fan() {
         this.speed = STOPPED;
         this.on = false;
         this.radius = 6.0;
         this.color = "white";
     }
 
     // Parameterized constructor
     public Fan(int speed, boolean on, double radius, String color) {
         this.speed = speed;
         this.on = on;
         this.radius = radius;
         this.color = color;
     }
 
     // Getters and Setters using 'this' reference
     public int getSpeed() {
         return this.speed;
     }
 
     public void setSpeed(int speed) {
         this.speed = speed;
     }
 
     public boolean isOn() {
         return this.on;
     }
 
     public void setOn(boolean on) {
         this.on = on;
     }
 
     public double getRadius() {
         return this.radius;
     }
 
     public void setRadius(double radius) {
         this.radius = radius;
     }
 
     public String getColor() {
         return this.color;
     }
 
     public void setColor(String color) {
         this.color = color;
     }
 
     // Method to display fan details without using toString
     public void displayFanDetails() {
         if (this.on) {
             System.out.println("Fan is ON | Speed: " + this.speed + " | Radius: " + this.radius + " | Color: " + this.color);
         } else {
             System.out.println("Fan is OFF | Radius: " + this.radius + " | Color: " + this.color);
         }
     }
 
     // Static method to display all fans in a collection without using toString
     public static void displayFans(List<Fan> fans) {
         for (Fan fan : fans) {
             fan.displayFanDetails();
         }
     }
 }
 
 // Test class to demonstrate the Fan functionalities
 public class UseFans {
     public static void main(String[] args) {
         // Creating a collection of Fan instances
         List<Fan> fans = new ArrayList<>();
 
         // Adding Fan instances to the collection
         fans.add(new Fan(Fan.FAST, true, 12, "blue"));
         fans.add(new Fan(Fan.MEDIUM, false, 8, "red"));
         fans.add(new Fan(Fan.SLOW, true, 10, "green"));
         fans.add(new Fan(Fan.STOPPED, false, 6, "white"));
 
         // Displaying each Fan using individual display method
         System.out.println("Displaying individual fans:");
         for (Fan fan : fans) {
             fan.displayFanDetails();
         }
 
         // Displaying the entire collection using the static method
         System.out.println("\nDisplaying all fans in the collection:");
         Fan.displayFans(fans);
     }
 }
 