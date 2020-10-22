package exo2;

// Import needed java classes
import javax.swing.JOptionPane;

/**
 *  Define simple methods that allows input in a small popup window.
 * Exemple of use : <br>
 * <pre>
 *     int n;
 *     double beta;
 *
 *     // ask the user to give us an integer
 *     n = InputDialog.getInt("Enter the value of n");
 *
 *     // ask the user to give us a double
 *     beta=InputDialog.getDouble("Enter the value of beta"); // waits for the user to give a double
 * </pre>
 *
 * @author E.Promayon, Université Joseph Fourier
 * @version 1.1
 */
public class InputDialog {
    
    /**
     * ask the user for a String
     * @param msg the message you want to display to the user
     * @return the String red
     */
    public static String getString(String msg) {
        String inputValue = JOptionPane.showInputDialog(msg);
        return inputValue;
    }
    
    /**
     * ask the user for a  int
     * @param msg the message you want to display to the user
     * @return the int read
     */
    public static int getInt(String msg) {
        return Integer.valueOf(getString(msg)).intValue();
    }
    
    /**
     * ask the user for a float
     * @param msg the message you want to display to the user
     * @return the float read
     */
    public static float getFloat(String msg) {
        return Float.valueOf(getString(msg)).floatValue();
    }
    
    /**
     * ask the user for a double
     * @param msg the message you want to display to the user
     * @return the double read
     */
    public static double getDouble(String msg) {
        return Double.valueOf(getString(msg)).doubleValue();
    }
    
    /**
     * ask the user for a char
     * @param msg the message you want to display to the user
     * @return the char read
     */
    public static char getChar(String msg) {
        return getString(msg).charAt(0);
    }
    
    /// testing
    public static void main(String[] args) {
        int n;
        double beta;
        
        // ask the user to give us an integer
        n = InputDialog.getInt("Enter the value of n");
        
        // ask the user to give us a double
        beta=InputDialog.getDouble("Enter the value of beta"); // waits for the user to give a double        
    }
}