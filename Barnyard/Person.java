public class Person {
  private String firstName, lastName;

  public Person(String first, String last) {
    firstName = first;
    lastName = last;
  }

  public String getFirstname() {
    return firstName;
  }

  public String getLastname() {
    return lastName;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public static void main(String[] args) {
    Person human = new Person("John", "Doe");
    System.out.println(human.getFullName() + " is a person");
  }
}