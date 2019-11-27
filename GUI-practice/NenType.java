import java.util.Hashtable;

public class NenType {
    // A NenType will handle the calculations for what nen type a person is
    private String name;
    private String description;
    private boolean active; // IF it's not active (if active = false), that means it's a passive

    public NenType(String initialName, String initialDescription, boolean active) {}

    // This method takes person's nature and calculates a nen type
    // There's a slight chance that someone can be a specialist
    // There's also a chance that someone can temporarily become a specialist if certain conditions are met.
    public static determineNenType(String nature) {
        // Create hashtable
        Hashtable<String, Integerr> possibleCategories = new Hashtable<String, Integer>();

        // Set six nen types, they'll point to 1 for now
        // This means that initially, the person will have an equal chance at being any nen category
        possibleCategories.put("Enhancer", 1);
        possibleCategories.put("Transmuter", 1);
        possibleCategories.put("Emitter", 1);
        possibleCategories.put("Conjurer", 1);
        possibleCategories.put("Manipulator", 1);
        possibleCategories.put("Specialist", 1);


        switch (nature) {
            case "simple":
            case "determined":
            case "honest":
                // Enhancer
                break;
            case "whimsical":
            case "fickle":
            case "deceitful":
                // Transmuter
                break;
            case "impatient":
            case "volatile":
                // Emitter
                break;
            case "serious":
            case "stoic":
            case "nervous":
                // Conjurer
                break;
            case "argumentative":
            case "logical":
                // Manipulator
                break;
            case "independent":
            case "charismatic":
                // Specialist
                break;
        
            default:
                break;
        }
    }
}