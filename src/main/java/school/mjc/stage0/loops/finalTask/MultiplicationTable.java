package school.mjc.stage0.loops.finalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a positive integer: ");
        String value = br.readLine();
        try {
            int i = Integer.parseInt(value);
            new MultiplicationTable().printTable(i);
        } catch(NumberFormatException e) {
            System.err.printf("Invalid format: %s!%n", value);
        }
    }
    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", i, numberTableToPrint, (i * numberTableToPrint));
        }
    }
}
