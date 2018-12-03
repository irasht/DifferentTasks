import java.util.Scanner;

public class StringTransformer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word ");
        String word = scanner.nextLine();
        String[] arr = new String[word.length()];
        transformWord(word, arr);
        printResult(word, sortArray(arr));
    }

    private static String[] transformWord(String word, String arr[]) {
        for (int i = 0; i < word.length(); i++) {
            arr[i] = word.substring(i, word.length()) + word.substring(0, i);
        }
        return arr;
    }

    private static String[] sortArray(String arr[]) {
        String tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    private static int findOriginWordPosition(String originWord, String arr[]) {
        int position = 0;
        for (int i = 0; i < arr.length; i++)
            if (originWord.equals(arr[i])) {
                position = i + 1;
            }
        return position;
    }

    private static String printLastLetter(String arr[]) {
        String result = "";
        for (String modifiedWord : arr) {
            result = result + modifiedWord.charAt(modifiedWord.length() - 1);
        }
        return result;
    }

    private static void printResult(String originWord, String arr[]) {
        System.out.println("Origin word is on position: " + findOriginWordPosition(originWord, sortArray(arr)) + " and last letter create string " + printLastLetter(sortArray(arr)));
    }
}
