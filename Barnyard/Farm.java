public class Farm {
  private String name;
  // Location class has not been made yet, so we'll use a string for now
  private String location;
  // An Owner class would be the association between our Person and Farm classes
  // Right now we'll make a person with the variable name of owner.
  private Person owner;
  // Array of animals
  private Animal[] barnyardAnimals;

  public Farm(String initializedName, String initialiezedLocation, Person initializedOwner) {
    name = initializedName;
    location = initialiezedLocation;
    owner = initializedOwner;
    barnyardAnimals = new Animal[0];
  }

  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

  public String getOwner() {
    return owner.getName();
  }

  public Animal[] getAnimals() {
    return barnyardAnimals;
  }

  private void setAnimals(Animals[] arr) {
    barnyardAnimals = arr;
  }

  public void printAnimals() {
    System.out.println("You have " + barnyardAnimals.length + " animals in your farm.");
    if (barnyardAnimals.length > 0) {
      for (int i = 0; i < barnyardAnimals.length; i++)
        System.out.println((i + 1) + ": " + barnyardAnimals[i].getName());
    } else {
      System.out.println("There are no animals in this array");
    }

  }

  public void adoptNewAnimal(Animal newAnimal) {
    this.printAnimals();
    String message = "You can't add a human to the farm!";
    // Will only add animal if species is NOT "human"
    if (newAnimal.getSpecies() == "human")
      System.out.println(message);

    // make a new array to point to our current animals array in memory
    Animal[] oldArray = barnyardAnimals.clone();
    if (oldArray.length > 0)
      System.out.println(oldArray[oldArray.length - 1].getName());

    // Point the barnyardAnimals to a new array that's one bigger
    Animal[] newArray = new Animal[oldArray.length + 1];

    // Set the new animal as the last index of the array
    newArray[oldArray.length] = newAnimal;

    // loop backwards to copy the values from the new array to the old array
    for (int i = oldArray.length - 1; i >= 0; i--) {
      System.out.println("INSIDE THE LOOP ---------------> " + i + " ~ " + oldArray[i].getName());
      System.out.println("INSIDE THE LOOP ---------------> " + (i + 1) + " ~ " + newArray[i + 1].getName());

      if (newArray[i] == null)
        newArray[i] = oldArray[i];
    }

    // You may need a conditional for when there's only one item in the array. I
    // don't understand how these aren't working

    if (oldArray.length > 0) {
      System.out.println("------------\n Greater than Zero  \n----------");
      System.out.println(oldArray[oldArray.length - 1].getName());
      System.out.println(newArray[newArray.length - 1].getName());
      System.out.println("------------\n   \n----------");
    }

    // notify the user that they've sucessfully adopted a new animal
    message = "You've just added " + newAnimal.getName() + " the " + newAnimal.getSpecies() + " to the "
        + this.getName();
    System.out.println(message);
    System.out.println(barnyardAnimals[this.getAnimals().length - 1].getName());
    System.out.println("------------");
  }

  // public String getFarmStats() {

  // }

  public static void main(String[] args) {
    Person human = new Person("John", "Human");
    Farm cornyFarm = new Farm("Corny Farm", "Idaho", human);

    System.out.println(cornyFarm.getName());
    System.out.println(cornyFarm.getLocation());
    System.out.println(cornyFarm.getOwner());
    // for (Animal bAnimal : cornyFarm.getAnimals())
    // System.out.println(bAnimal);
    // cornyFarm.printAnimals();
    System.out.println("------------\n   \n----------");
    System.out.println(cornyFarm.getAnimals().length);
    // cornyFarm.printAnimals();
    System.out.println("------------\n   \n----------");
    cornyFarm.adoptNewAnimal(new Animal("Felix", "Cat"));
    // cornyFarm.printAnimals();
    System.out.println("------------\n   \n----------");
    cornyFarm.adoptNewAnimal(new Animal("Tom", "Cat"));
    // cornyFarm.printAnimals();
    System.out.println("------------\n   \n----------");
    cornyFarm.adoptNewAnimal(new Animal("Jerry", "Mouse"));
    System.out.println("------------\n   \n----------");
    cornyFarm.adoptNewAnimal(new Animal("Buggs", "Bunny"));

    cornyFarm.printAnimals();
  }
}