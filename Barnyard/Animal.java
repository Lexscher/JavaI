import java.util.Scanner;

public class Animal {
  private static String name, species;

  public Animal(String initializedName, String initializedSpecies) {
    name = initializedName;
    species = initializedSpecies;
  }

  // Getters
  public String getName() {
    return name;
  }

  public String getSpecies() {
    return species;
  }

  // setters
  private void setName(String newName) {
    name = newName;
  }

  // Method to check for valid response
  private boolean validAnswer(String ans) {
    switch (ans.toLowerCase()) {
    case "yes":
      return true;

    case "no":
      return true;

    default:
      return false;
    }
  }

  public void changeName() {
    Scanner keyboard = new Scanner(System.in);
    // Prompt the user to name the animal
    System.out.println("Type 'Yes' or 'No' if you like to give " + this.getName() + " a new nickname: ");
    String answer = keyboard.nextLine();
    // Confirm if the user wants to change the name at least once
    do {
      // based on that answer,
      switch (answer) {
      case "Yes":
      case "yes":
        System.out.println("Okay, what would you like the new name to be? ");
        String newNickname = keyboard.nextLine();
        this.setName(newNickname);
        System.out.println("Okay, the " + this.getSpecies() + "'s new nickname is " + this.getName());
        break;
      case "No":
      case "no":
        System.out.println("Okay, the " + this.getSpecies() + "'s nickname will remain as " + this.getName());
        System.out.println(answer);
        break;

      default:
        System.out.println("Sorry, only \"Yes\" or \"No\" will be accepted.\n Please try again: ");
        answer = keyboard.nextLine();
        break;
      }
    } while (!validAnswer(answer));

    // Close the scanner
    keyboard.close();
  }

  public static void main(String[] args) {
    System.out.println("I am an animal.");
    Animal spot = new Animal("Spot", "Dog");
    System.out.println(spot.getName() + " is a really chill " + spot.getSpecies());
    spot.changeName();
  }
}