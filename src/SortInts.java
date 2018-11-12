import java.util.Arrays;

public class SortInts {
    public static void main(String[] args) {
        int[] table = {4,5,7,13, 64, -20, -4};
        int[] sortTable = BubbleSort(table);
        System.out.println(Arrays.toString(sortTable));
    }

    private static int[] BubbleSort(int[] table) {
        int n = table.length;
        int buf;
        do {
            for (int i = 0; i < n - 1; i++) {
                if (table[i] > table[i+1]) {
                    buf = table[i];
                    table[i] = table[i+1];
                    table[i+1] = buf;
                }
            }
            n--;
        } while (n>1);
        return table;
    }
}
