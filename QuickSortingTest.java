import java.util.Formatter;
import java.util.Random;

import static java.lang.System.arraycopy;

class QuickSortingTest {
    public static void main(String[] args) {
        String[] array = QuckSortingMain.generateArray();
        show(array, "Before sorting");
        String[] sortedArray = QuickSorting.getSortedArray(array);
        show(sortedArray, "After sorting");
    }

    static void show(String[] sortedArray, String str) {
        System.out.println(str);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }
}
