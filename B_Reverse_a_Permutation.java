
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class B_Reverse_a_Permutation {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());

            String input = br.readLine();
            String[] s = input.split(" ");

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int largest=n;
            int low=0;

            for(int i=0;i<n;i++){
                if(arr[i]==largest){
                    largest--;
                    continue;
                }
                for(int l=i;l<n;l++){
                    if(arr[l]==largest){
                        low=l;
                        break;
                    }
                }
                int j=i;
                int k=low;
                while(j<k){
                    int temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;

                    j++;
                    k--;
                }
                break;
            }

            for(int i=0;i<n;i++){
                sb.append(arr[i]).append(" ");
            }

            sb.append("\n");

        }
        System.out.println(sb);

    }
}
