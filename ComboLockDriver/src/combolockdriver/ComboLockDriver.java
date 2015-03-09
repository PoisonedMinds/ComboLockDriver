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
        int test, num1, num2, num3;
        String buttons[] = {"Combo Known", "Combo Unknown"};
        test = JOptionPane.showOptionDialog(null, "Do you know to combo , or are you guessing it?", "ComboLock",
                JOptionPane.PLAIN_MESSAGE, 3, null, buttons, buttons[0]);
        if (test == 0) {
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Input the first number for the lock. \n(0-60"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Input the second number for the lock. \n(0-60"));
            num3 = Integer.parseInt(JOptionPane.showInputDialog("Input the third number for the lock. \n(0-60"));
            ComboLock lock =new ComboLock(num1,num2,num3);
        } else if (test == 1) {
            ComboLock lock =new ComboLock();
        }

    }

}
