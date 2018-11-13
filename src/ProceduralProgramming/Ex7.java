package ProceduralProgramming;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        int[] x = {1,2,2,4,5};
        int t = 3;

        int[] nweTab = checkTab(x, t);
        System.out.println(Arrays.toString(nweTab));
    }

    private static int[] checkTab(int[] x, int t) {
        int remove = -1;
        remove = (findRemove(x, t));
        if (remove == -1) {
            return x;
        }
        else {
            int[] newTab2 = setTab(x, remove);
            return checkTab(newTab2, t);

        }
    }

    private static int[] setTab(int[] x, int remove) {
        int len = x.length;
        int [] returnTab = new int [len - 1];

        for (int i = 0; i < len - 1; i++) {
            if (i < remove) {
                returnTab[i] = x[i];
            } else {
                returnTab[i] = x[i +1];
            }
        }
        return returnTab;
    }

    private static int findRemove(int[] x, int t) {
        int len = x.length;
        int sum;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (j != i) {
                    sum = x[i] + x[j];
                    if (t == sum) {
                        return j;
                    }

                }
            }

        }
        return -1;
    }
}
