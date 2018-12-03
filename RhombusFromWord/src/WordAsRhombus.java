import java.util.Scanner;

public class WordAsRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word ");
        String word = scanner.nextLine();
        int size = word.length();
        int left = size / 2;
        int right = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char result;
                if (size % 2 == 1) {
                    result = (j >= left && j <= right) ? (word.charAt(j)) : (' ');
                } else {
                    result = (j >= left - 1 && j <= right) ? (word.charAt(j)) : (' ');
                }
                System.out.print(result);
            }
            if (i < size / 2 - 1) {
                left--;
                right++;
            } else if (size % 2 == 1 && i < size / 2) {
                left--;
                right++;
            } else {
                left++;
                right--;
            }
            System.out.println();
        }
    }
}
