
package combolockdriver;

/**
 * @title ComboLockDriver
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 9-Mar-2015 10:59:59 AM
 * @purpose The purpose of this program is to model a combo lock
 */
public class ComboLock {

    private int num1, num2, num3;
    //randomly generate the combo between 1 and 3
    ComboLock() {
        num1 = (int) (Math.random() * 3 + 1);
        num2 = (int) (Math.random() * 3 + 1);
        num3 = (int) (Math.random() * 3 + 1);
    }
    //generate the combo using user input
    ComboLock(int n1, int n2, int n3) {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }
    //method to return the combo
    String getCombo() {
        String output = num1 + ", " + num2 + ", " + num3;
        return output;

    }

}
