package combolockdriver;

import javax.swing.*;

/**
 * @title ComboLockDriver
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 9-Mar-2015 10:59:59 AM
 * @purpose The purpose of this program is to model opening a combo lock
 */
public class ComboLockDriver {

    public static void main(String[] args) {
        int test, num1, num2, num3, i = 0;
        String buttons[] = {"Combo Known", "Combo Unknown"}, combo;
        ComboLock lock = null;
        //determine if the combo is already known or not
        test = JOptionPane.showOptionDialog(null, "Do you know to combo , or are you guessing it?", "ComboLock",
                JOptionPane.PLAIN_MESSAGE, 3, null, buttons, buttons[0]);
        if (test == 0) {// get user input for the combo if known
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Input the first number for the lock. \n(0-60)"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Input the second number for the lock. \n(0-60)"));
            num3 = Integer.parseInt(JOptionPane.showInputDialog("Input the third number for the lock. \n(0-60)"));
            lock = new ComboLock(num1, num2, num3);//create an object for the lock
        } else if (test == 1) {
            lock = new ComboLock();
        }
        do {
            //allow the user to guess the combo
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Guess the first number."));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Guess the second number."));
            num3 = Integer.parseInt(JOptionPane.showInputDialog("Guess the third number."));
            combo = num1 + ", " + num2 + ", " + num3;
            if (combo.equals(lock.getCombo())) {
                break;//break the loop if the guess is correct
            }
            i += 1;
            JOptionPane.showMessageDialog(null, "Incorrect, try again.");
        } while (i < 3);
        if (i == 3) {//if the user guessed the correct combo in 3 guesses then they got it correct
            JOptionPane.showMessageDialog(null, "The correct combonation was " + lock.getCombo());
        } else {
            JOptionPane.showMessageDialog(null, "You guessed the correct combonation.");
        }
    }

}
