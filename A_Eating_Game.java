
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Eating_Game {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {

            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();

            String[] s = input.split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }

            }
            int count = 0;
            for (int i = 0; i < n; i++) {

                if (arr[i] == max) {
                    count++;
                }
            }
            sb.append(count).append("\n");

        }
        System.out.println(sb.toString());

    }
}
