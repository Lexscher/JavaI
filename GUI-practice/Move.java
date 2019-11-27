public class Move {
    // A move has a description and a "passive OR active" attribute
    private String name;
    private String description;
    private boolean active; // IF it's not active (if active = false), that means it's a passive

    public Move(String initialName, String initialDescription, boolean active) {}
}