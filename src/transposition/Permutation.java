package transposition;

public class Permutation {
    private char m;
    private char[] array;
    private boolean[] used;

    public Permutation(char m) {
        this.m = m;
        array = new char[m];
        used = new boolean[m + 1];
    }

    public void rec(int index) {
        if (index == (m - 'a' + 1)) {
            out();
            return;
        }
        for (char i = 'a'; i <= m; i++) {
            if (!used[i]) {
                array[index] = i;
                used[i] = true;
                rec(index + 1);
                used[i] = false;
            }
        }
    }

    private void out() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Permutation('e').rec(0);
    }
}
