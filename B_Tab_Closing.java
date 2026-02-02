
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class B_Tab_Closing {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int a=Integer.parseInt(s[0]);
            long b=Long.parseLong(s[1]);
            long n=Long.parseLong(s[2]);
            
            if(b*n<=a || a==b){
                sb.append("1\n");
            }            
            else{
                sb.append("2\n");
            }

        }
        System.out.println(sb.toString());

    }
}
