package week2.generics;

// 4.4
// Het automatisch omzetten van primitief datatype naar een wrapper type, bijv int > Integer.
// Unboxing is het tegenovergestelde.

// 4.11
// (Un)boxing ging niet vanzelf, dus je moest alles zelf handmatig gaan (un)boxen. Vanaf Java 5 wordt het automatisch uitgevoerd, dus achter de schermen.


import java.util.Arrays;

public class Min {

    public static <T> T min(T[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static void main(String[]args) {
        int[] array = {5, 6, 7, 3, 8, 1, 3};
        String[] names = {"O", "A", "D"};
        System.out.println(min(names));
    }
}
