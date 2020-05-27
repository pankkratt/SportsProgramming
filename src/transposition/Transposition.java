package transposition;

public class Transposition {
    private int n;
    private char m;
    private char[] array;

    public Transposition(int n, char m) {
        this.n = n;
        this.m = m;
        array = new char[n];
    }

    public void rec(int index) {
        if (index == n) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
            return;
        }
        for (char i = 'a'; i <= m; i++) {
            array[index] = i;
            rec(index + 1);
        }
    }

    public static void main(String[] args) {
        new Transposition(5, 'e').rec(0);
    }
}
