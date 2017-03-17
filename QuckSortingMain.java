class QuckSortingMain {
    public static void main(String[] args) {
        String[] sorted;
        QuickSorting qs = new QuickSorting(12);
        sorted=qs.getSortedArray();
        qs.sort(sorted, 0, sorted.length - 1);
    }
}
