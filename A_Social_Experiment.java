
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Social_Experiment {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int n=Integer.parseInt(s[0]);
            if(n==2){
                sb.append(2);
            }else if(n==3) {
                sb.append(3);
            }
            else if(n%2==0){
                sb.append(0);
            }else{
                sb.append(1);
            }
            sb.append("\n");

        }
        System.out.println(sb);

    }
}
