// 7.1
// 1. Base case
// 2. Make progress
// 3. "you gotta believe"
// 4. Compound interest rule.


// Exercise 2
public class Main {
    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }

    public static int printFactorialRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return printFactorialRecursive(n - 1) * n;
    }

    // Non-recursive
    public static int printFactorial(int n) {
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }

        return sum;
    }
}

// Exercise 3
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(printSumDescending(5));
    }

    public static int printSumDescendingResurive(int n) {
        if (n <= 1) {
            return n;
        }

        return printSumDescendingResurive(n - 1) + n;
    }

    // Non-recursive
    public static int printSumDescending(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}

// Exercise 4
public class Main {
    public static void main(String[] args) {
        System.out.println(toBinary(32));
        System.out.println(toBinary(18));
        System.out.println(toBinary(11));

    }

    public static int toBinary(int n) {
        if (n <= 0) {
            return 0;
        }

        return ((n % 2 == 0) ? 0 : 1) + toBinary(n / 2);
    }


}
// Exercise 5
public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("hey"));
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return "";
        }

        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
