package week2.generics;

public class TestMemoryCell {
    public static void main(String[] args) {
        MemoryCell<String> m = new MemoryCell();
        MemoryCell<String> m2 = new MemoryCell();
        m.write(null);
        m2.write("c");

        System.out.println(m.compareTo(m2));

    }
}
