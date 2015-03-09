package combolockdriver;

import javax.swing.*;

/**
 * @title ComboLockDriver
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 9-Mar-2015 10:59:59 AM
 * @purpose The purpose of this program is to
 */
public class ComboLockDriver {

    public static void main(String[] args) {
        int test, num1, num2, num3, i = 0;
        String buttons[] = {"Combo Known", "Combo Unknown"}, combo;
        ComboLock lock = null;
        test = JOptionPane.showOptionDialog(null, "Do you know to combo , or are you guessing it?", "ComboLock",
                JOptionPane.PLAIN_MESSAGE, 3, null, buttons, buttons[0]);
        if (test == 0) {
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Input the first number for the lock. \n(0-60)"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Input the second number for the lock. \n(0-60)"));
            num3 = Integer.parseInt(JOptionPane.showInputDialog("Input the third number for the lock. \n(0-60)"));
            lock = new ComboLock(num1, num2, num3);
        } else if (test == 1) {
            lock = new ComboLock();
        }
        do {
            i += 1;
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Guess the first number."));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Guess the second number."));
            num3 = Integer.parseInt(JOptionPane.showInputDialog("Guess the third number."));
            combo = num1 + ", " + num2 + ", " + num3;
            if (combo.equals(lock.getCombo())) {
                break;
            }

            JOptionPane.showMessageDialog(null, "Incorrect, try again.");
        } while (i < 3);
        if (i == 3) {
            JOptionPane.showMessageDialog(null, "The correct combonation was " + lock.getCombo());
        } else {
            JOptionPane.showMessageDialog(null, "You guessed the correc combonation.");
        }
    }

}
