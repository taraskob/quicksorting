import java.util.Formatter;

class QuickSortingTest {
    public static void main(String[] args) {
        String[] sorted;
        QuickSorting qs = new QuickSorting(12);
        sorted=qs.getSortedArray();
        String[] notSorted = new String[sorted.length];
        for (int i = 0; i < sorted.length; i++)
            notSorted[i] = sorted[i];
        qs.sort(sorted, 0, sorted.length - 1);
        show(sorted, notSorted);
    }

    static void show(String[] sorted, String[] notSorted) {
        System.out.println("Before sorting    After sorting");

        for (int i = 0; i < sorted.length; i++) {
            Formatter fmt = new Formatter();
            fmt.format("%12s %12s", notSorted[i], sorted[i]);
            System.out.println(fmt);
            fmt.close();
        }
    }
}
