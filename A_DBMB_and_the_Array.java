
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_DBMB_and_the_Array {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s1 = input.split(" ");
            int n = Integer.parseInt(s1[0]);
            int s = Integer.parseInt(s1[1]);
            int x = Integer.parseInt(s1[2]);

            input = br.readLine();
            s1 = input.split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s1[i]);
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            while (sum < s) {
                sum = sum + x;
            }

            if(sum==s){
                sb.append("YES");
            }else{
                sb.append("NO");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
