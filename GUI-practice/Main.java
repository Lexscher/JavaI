import javax.swing.*;
// import javax.swing.JOptionPane;

public class Main {

        ic static void main(String[] args) {
       String answer = JOptionPane.showConfirmDialog(null, "Would you like to play a text adventure game?");
       switch (answer) {
           case JOptionPane.YES_OPTION:
                runGame(); 
               break;
           case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Okay, bye bye for now!", "Bye Felicia.", JOPtionPane.PLAIN_MESSAGE)
           break;
           case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null, "You pressed the \"cancel\" button!", "WARNING", JOPtionPane.WARNING_MESSAGE)
               break;
           default:
               break;
       }
    }

    public static void runGame() {
        String title = "Too Turnt"

        JOptionPane.showMessageDialog(
            null, 
            "Hello! In this game, Too Turnt, every choice you make will have an impact on the outcome.\nTry to get the best outcome possible!", 
            "Overview", 
            JOptionPane.INFORMATION_MESSAGE
            );

        // Set name
        String name =
        JOptionPane.showInputDialog(
            null,
            "First, let's not be strangers!\n What's your name?",
            title,
            JOptionPane.QUESTION_MESSAGE
            );

        JOptionPane.showMessageDialog(null, "Okay " + name + ".\nLet's begin", title, JOptionPane.PLAIN_MESSAGE);
            

        // You've finished the game
        JOptionPane.showMessageDialog(null, "Fin~", "Good Bye 👋", JOptionPane.PLAIN_MESSAGE);
    }
        
}
