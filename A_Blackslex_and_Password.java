
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Blackslex_and_Password {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            
            String input = br.readLine();
            String[] s = input.split(" ");
            int k=Integer.parseInt(s[0]);
            int x=Integer.parseInt(s[1]);

            sb.append((k*x)+1 + "\n" );


        }
        System.out.println(sb);

    }
}
