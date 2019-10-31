public class FullName {

    String firstName;
    String middleInitial;
    String lastName;

    FullName(String fName, String mInitial, String lName) {
        firstName = fName;
        middleInitial = mInitial;
        lastName = lName;
    }

    public void getFirstName(String name) {
        if (name.length < 2)
            System.out.println("That name is too short, please try again!");
        else
            firstName = name;
    }

    public void getmiddleInitial(String initial) {
        if (name.length != 1)
            System.out.println("An inital consists of One letter. Please Try again!");
        else
            middleInitial = initial;
    }

    public void getLastName(String name) {
        if (name.length < 2)
            System.out.println("That name is too short, please try again!");
        else
            lastName = name;
    }

    public static void main(String[] args) {

    }

}