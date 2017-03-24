import java.util.Random;

class QuckSortingMain {
    public static void main(String[] args) {
        QuickSorting.getSortedArray(generateArray(21));
    }

    static String[] generateArray(int rsize) {
        String abc = "qwertyuioplkjhgfdsazxcvbnmMNBVCXZASDFGHJKLLPOIUYTREWQ";
        Random rnd = new Random();
        int size = rnd.nextInt(rsize) + 12;
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            String result = "";
            int length = rnd.nextInt(12) + 1;
            for (int j = 0; j < length; j++) {
                result += abc.charAt(rnd.nextInt(abc.length()));
            }
            array[i] = result;
        }
        return array;
    }
}
