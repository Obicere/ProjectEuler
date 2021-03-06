package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler040 extends Project {

    public int number() {
        return 40;
    }

    public String call() {
        final StringBuilder builder = new StringBuilder(1000000);
        for (int i = 1; builder.length() < 1000000; i++) {
            builder.append(i);
        }
        int result = 1;
        for (int i = 0; i < 7; i++) {
            result *= builder.charAt((int) Math.round(Math.pow(10, i) - 1)) - '0';
        }
        return String.valueOf(result);
    }
}