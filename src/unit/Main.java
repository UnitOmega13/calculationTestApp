package unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> numbers = new ArrayList<>();
    static List<Integer> results = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = 0;
        String line;
        System.out.println("Input numbers or press Enter:");
        while (!(line = scanner.nextLine()).isEmpty()) {
            String[] arguments = line.split("\\s");
            int number = Integer.parseInt(arguments[0]);
            if((number <= 3) && (arguments.length >= 2)) {
                numbers.add(2);
            }
            numbers.add((arguments.length - 1));
            results.add(calculating(number, number));
            numberOfLines++;
        }
        for (int index = 0; index <= numberOfLines - 1; index++) {
            int result = results.get(index) - numbers.get(index);
            System.out.println("#" + (index + 1) + ": " + result);
        }
    }

    private static int calculating(int n, int k) {
        if (n > 0 && k == 0) return 0;
        if (n == 0 && k == 0) return 1;
        if (k > n) return calculating(n, n);
        return calculating(n, k - 1) + calculating(n - k, k - 1);
    }
}
