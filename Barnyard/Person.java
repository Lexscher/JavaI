public class Person extends Animal {
  public Person(String initializedName, String initializedSpecies) {
    super(initializedName, initializedSpecies);
  }

  @Override
  public void changeName() {
    System.out.println("You can't change your name!\nYo Mama gave you that name!");
  }

  public static void main(String[] args) {
    Person human = new Person("John", "Human");
    System.out.println(human.getName() + " is a person");
    human.changeName();
  }
}