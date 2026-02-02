
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Same_Difference {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
        
            String input = br.readLine();
            char[] arr=input.toCharArray();
            int occoflast=0;
            char last=arr[arr.length-1];
            for(char i:arr){
                if(i==last){
                    occoflast++;
                }
            }
            sb.append(n-occoflast+"\n");
        }
        System.out.println(sb.toString());

    }
}
