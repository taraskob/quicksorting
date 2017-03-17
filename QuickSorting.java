import java.util.Random;

class QuickSorting {
    String[] sorted;
    int size;

    QuickSorting(int size) {
        this.size = size;
        if (size <= 0) size = 12;
        sorted = new String[size];
        String[] sorted = createarray();
    }

    String[] createarray() {
        String abc = "qwertyuioplkjhgfdsazxcvbnmMNBVCXZASDFGHJKLLPOIUYTREWQ";
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            String result = "";
            int length = rnd.nextInt(7) + 1;
            for (int j = 0; j < length; j++) {
                result += abc.charAt(rnd.nextInt(abc.length()));
            }
            sorted[i] = result;
        }
        return sorted;
    }

    void sort(String[] sortedarray, int leftIdx, int rightIdx) {
        if (rightIdx <= leftIdx) return;
        int centrIdx = split(sorted, leftIdx, rightIdx);
        sort(sorted, leftIdx, centrIdx - 1);
        sort(sortedarray, centrIdx + 1, rightIdx);
    }

    int split(String[] sorted, int leftIdx, int rightIdx) {
        int i = leftIdx;
        int j = rightIdx;
        String central = sorted[leftIdx];
        while (true) {
            while (less(sorted[++i], central)) if (i == rightIdx) break;
            while (less(central, sorted[--j])) if (j == leftIdx) break;
            if (i >= j) break;
            exchange(sorted, i, j);
        }
        exchange(sorted, leftIdx, j);
        return j;
    }

    boolean less(String v, String w) {
        return v.compareTo(w) < 0;
    }

    void exchange(String[] sorted, int i, int j) {
        String strtmp = sorted[i];
        sorted[i] = sorted[j];
        sorted[j] = strtmp;
    }

    String[] getSortedArray() {
        return sorted;
    }
}
