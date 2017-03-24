import java.io.*;
import java.text.ParseException;
import java.util.Random;

class QuickSortingTest {
    static String fileName = "test_array.txt";
    static File file = new File(fileName);

    public static void main(String[] args) {
        try {
            String[] array = readTestArray(fileName);
            show(array, "Before sorting");
            show(QuickSorting.getSortedArray(array), "After sorting");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    static void show(String[] sortedArray, String str) {
        System.out.println(str);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }

    static void testArrayExists(String fileName) throws IOException {

        if (!file.exists()) {
            String abc = "qwertyuioplkjhgfdsazxcvbnmMNBVCXZASDFGHJKLLPOIUYTREWQ";
            Random rnd = new Random();
            String[] array = new String[2112];
            FileWriter writer = new FileWriter(fileName);
            for (int i = 0; i < array.length; i++) {
                String result = String.valueOf(i + 1) + '.';
                int elementLength = rnd.nextInt(12) + 1;
                for (int j = 0; j < elementLength; j++) {
                    result += abc.charAt(rnd.nextInt(abc.length()));
                }
                writer.write(result + "\r\n");
            }
            writer.close();
        }
    }

    static String[] readTestArray(String filename) throws IllegalAccessException, ParseException {
        StringBuilder line = new StringBuilder();

        try {
            testArrayExists(filename);
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    line.append(s);
                    line.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line.toString().split("\n");
    }
}
