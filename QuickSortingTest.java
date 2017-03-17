import java.util.Formatter;
import java.util.Random;

import static java.lang.System.arraycopy;

class QuickSortingTest {
    public static void main(String[] args) {
        String[] array = generateArray();
        String[] arrayCopy = new String[array.length];
        arraycopy(array, 0, arrayCopy, 0, array.length);
        QuickSorting qs = new QuickSorting(array);
        String[] sortedArray = qs.getSortedArray();
        show(sortedArray, arrayCopy);
    }

    static String[] generateArray() {
        String abc = "qwertyuioplkjhgfdsazxcvbnmMNBVCXZASDFGHJKLLPOIUYTREWQ";
        Random rnd = new Random();
        int size = rnd.nextInt(21) + 3;
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            String result = "";
            int length = rnd.nextInt(7) + 1;
            for (int j = 0; j < length; j++) {
                result += abc.charAt(rnd.nextInt(abc.length()));
            }
            array[i] = result;
        }
        return array;
    }

    static void show(String[] sortedArray, String[] notSortedArray) {
        System.out.println("Before sorting    After sorting");

        for (int i = 0; i < sortedArray.length; i++) {
            Formatter fmt = new Formatter();
            fmt.format("%12s %12s", notSortedArray[i], sortedArray[i]);
            System.out.println(fmt);
            fmt.close();
        }
    }
}
