public class Pyt1 {
    public static void main(String[] args) {
        int[] tabInt = {1, -3, 5, 7};
        int result;
        result = returnSumabsoluteValuesTab(tabInt);
        System.out.println(result);
        result = returnSumabsoluteValuesTab2(tabInt);
        System.out.println(result);
    }

    private static int returnSumabsoluteValuesTab2(int[] tabInt) {
        int result=0;
        for (int i : tabInt) {
            result += (i>=0) ? i : i * -1;
            if (i>=0) {
                result += i;
            } else {
                result += i * -1;
            }
        }
        return result;
    }

    private static int returnSumabsoluteValuesTab(int[] tabInt) {
        int result=0;
        for (int i = 0; i < tabInt.length; i++) {
            result += (tabInt[i]>=0) ? tabInt[i] : tabInt[i] * -1;
        }
        return result;
    }
}
