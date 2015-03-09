/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combolockdriver;

/**
 *
 * @author Steven Biro
 */
public class ComboLock {

    private int num1, num2, num3;

    ComboLock() {
        num1 = (int) (Math.random() * 3 + 1);
        num2 = (int) (Math.random() * 3 + 1);
        num3 = (int) (Math.random() * 3 + 1);
    }

    ComboLock(int n1, int n2, int n3) {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }

    int openLock(int n1, int n2, int n3) {
        int output = 0;
        if (n1 == num1) {
            if (n2 == num2) {
                if (n3 == num3) {
                    output = 1;
                }
            }
        }
        return output;
    }

    String getCombo() {
        String output = num1 + ", " + num2 + ", " + num3;
        return output;

    }

}
