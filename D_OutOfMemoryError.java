
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class D_OutOfMemoryError {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int h = Integer.parseInt(s[2]);


            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }

            int[] initial=arr.clone();
            Set<Integer> set=new HashSet<>();



            while(m-->0){
                st=new StringTokenizer(br.readLine());
                int index=Integer.parseInt(st.nextToken());
                int add=Integer.parseInt(st.nextToken());

                set.add(index);

                arr[index-1]+=add;

                if(arr[index-1]>h){
                    for(int x:set){
                        arr[x-1]=initial[x-1];
                    }
                    set.clear();
                }
                
            }

            for(int i=0;i<n;i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");



        }
        System.out.println(sb);


    }
}
