public class Person {
    // A person is created with nen. The nen can be basic and "Dormant" 
    // but they can use "#train" to get stronger and eventually activate their nen
    // #train can also strengthen/level up their basic nen abilities.
    // "#waterDiviation" to find out what nen type they are
    private String firstName;
    private String lastName;
    private String nature;
    private Nen nen;

    public Person(String initialFirstName, String initialLastName, String initialNature, Nen initialNen) {
        firstName = initialFirstName;
        lastName = initialLastName;
        nature = initialNature;
        nen = initialNen;
    }

}

/* Person Nature/Personalities
simple
determined
honest
whimsical
fickle
deceitful
impatient
volatile
serious
stoic
nervous
argumentative
logical
independent
charismatic
*/