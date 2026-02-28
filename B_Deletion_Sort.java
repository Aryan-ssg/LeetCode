
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class B_Deletion_Sort {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());

            String input = br.readLine();
            String[] s = input.split(" ");

            
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(s[i]);
            }

            int increasing=1;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    increasing=0;
                    break;
                }
            }
            if(increasing==0){
                sb.append(1).append("\n");
            }else if(increasing==1){
                sb.append(n).append("\n");
            }

        }
        System.out.println(sb.toString());

    }
}
