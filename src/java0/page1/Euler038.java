package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler038 extends Project {

    public int number() {
        return 38;
    }

    public String call() {
        int highest = 0;
        for (int i = 1; i < 100000; i++) {
            int[] digits = getDigits(i);
            int n = 2;
            while (digits.length < 9) {
                final int next = i * n;
                digits = combine(digits, getDigits(next));
                n++;
            }
            if (digits.length == 9) {
                if (isPandigital(digits, 9)) {
                    highest = Math.max(numberFromDigits(digits), highest);
                }
            }
        }
        return String.valueOf(highest);
    }
}