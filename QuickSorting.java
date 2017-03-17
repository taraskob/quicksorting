class QuickSorting {
    String[] array;

    QuickSorting(String[] array) {
        this.array = array;
        sort(array, 0, array.length - 1);
    }

    void sort(String[] sortedarray, int leftIdx, int rightIdx) {
        if (rightIdx <= leftIdx) return;
        int centrIdx = split(array, leftIdx, rightIdx);
        sort(array, leftIdx, centrIdx - 1);
        sort(sortedarray, centrIdx + 1, rightIdx);
    }

    int split(String[] array, int leftIdx, int rightIdx) {
        int i = leftIdx;
        int j = rightIdx + 1;
        String centr = medianOf3(array, leftIdx, rightIdx);
        while (true) {
            while (less(array[++i], centr)) if (i == rightIdx) break;
            while (less(centr, array[--j])) if (j == leftIdx) break;
            if (i >= j) break;
            exchange(array, i, j);
        }
        exchange(array, leftIdx, j);
        return j;
    }

    String medianOf3(String[] array, int leftIdx, int rightIdx) {
        int centr = (leftIdx + rightIdx) / 2;
        if (less(array[centr], array[leftIdx]))
            exchange(array, leftIdx, centr);
        if (less(array[rightIdx], array[leftIdx]))
            exchange(array, leftIdx, rightIdx);
        if (less(array[rightIdx], array[centr]))
            exchange(array, rightIdx, centr);
        return array[centr];
    }

    boolean less(String v, String w) {
        return v.compareTo(w) < 0;
    }

    void exchange(String[] array, int i, int j) {
        String strtmp = array[i];
        array[i] = array[j];
        array[j] = strtmp;
    }

    String[] getSortedArray() {
        return array;
    }
}
