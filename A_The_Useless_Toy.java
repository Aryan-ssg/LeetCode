
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_The_Useless_Toy {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] s = input.split(" ");
        String start= s[0];
        String end=s[1];
        Map<String,Integer> hm=new HashMap<>();
        hm.put("v",0);
        hm.put("<",1);
        hm.put("^",2);
        hm.put(">",3);
        long a=hm.get(start);
        long b=hm.get(end);
        
        if((a+n)%4==b && (a-(n%4)+4)%4==b){
            sb.append("undefined");
        }else if((a+n)%4==b){
            sb.append("cw");
        }else{
            sb.append("ccw");
        }

        System.out.println(sb.toString());        




    }
}
