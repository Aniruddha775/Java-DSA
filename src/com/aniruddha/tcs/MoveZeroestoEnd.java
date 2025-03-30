package com.aniruddha.tcs;
import java.util.*;

public class MoveZeroestoEnd {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();

        while (T-- > 0) {
            String userInput = in.nextLine().trim();
            if (userInput.startsWith("[") && userInput.endsWith("]")) {
                userInput = userInput.substring(1, userInput.length() - 1);
            }

            String[] values = userInput.split(",");
            int[] arr = new int[values.length];

            for (int i = 0; i < values.length; i++) {
                arr[i] = Integer.parseInt(values[i].trim());
            }

            moveZero(arr);
            System.out.println(Arrays.toString(arr));  // Correct output format
        }
        in.close();
    }

    public static void moveZero(int[] arr) {
        int n = arr.length;
        int j = 0; // Position for the next non-zero element

        // Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
