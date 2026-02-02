
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Suspension {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String[] s = input.split(" ");
            int y = Integer.parseInt(s[0]);
            int r = Integer.parseInt(s[1]);
            int sus=r+(y/2);

            if(sus<n){
                sb.append(sus+"\n");
            }else {
                sb.append(n+"\n");
            }
        }
        System.out.println(sb.toString());
    }
}
