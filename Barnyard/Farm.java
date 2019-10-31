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
    barnyardAnimals = new Animal[5];
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

  private Animal[] getAnimals() {
    return barnyardAnimals;
  }

  public void printAnimals() {
    // if(this.barnyardAnimals()
  }

  // public void adoptNewAnimal(Animal newAnimal) {
  // Will only add animal if species is NOT "human"
  // }

  // public String getFarmStats() {

  // }

  public static void main(String[] args) {
    Person human = new Person("John", "Human");
    Farm cornyFarm = new Farm("Corny Farm", "Idaho", human);

    System.out.println(cornyFarm.getName());
    System.out.println(cornyFarm.getLocation());
    System.out.println(cornyFarm.getOwner());
    for (Animal bAnimal : cornyFarm.getAnimals())
      System.out.println(bAnimal);
    // System.out.println(cornyFarm.getAnimals().length);
  }
}