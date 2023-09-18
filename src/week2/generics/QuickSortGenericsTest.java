package week2.generics;

public class QuickSortGenericsTest {
    public static void main(String[] args) {
        QuickSortGenerics<String> q = new QuickSortGenerics();
        // Driver Code

        String[] arr = {"C", "B", "A"};
        //Integer[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;

        // Function call
        q.quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        q.printArr(arr);
    }
}
