
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class E_The_Robotic_Rush {
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
            int k = Integer.parseInt(s[2]);

            int alive = n;

            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] robots = new int[n];
            for (int i = 0; i < n; i++) {
                robots[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            Set<Integer> hs = new HashSet<>();

            
            for (int i = 0; i < m; i++) {
                hs.add(Integer.parseInt(st.nextToken()));

            }

            String direct = br.readLine();

            int[] dead = new int[n];

            for (char c : direct.toCharArray()) {
                if (alive == 0) {
                    sb.append(alive).append(" ");
                    continue;
                } else {
                    if (c == 'L') {
                        for (int i = 0; i < n; i++) {
                            if (dead[i] == 1) {
                                continue;
                            }
                            robots[i] -= 1;
                            if (hs.contains(robots[i])) {
                                alive--;
                                dead[i] = 1;
                            }
                            

                        }

                    } else {
                        for (int i = 0; i < n; i++) {
                            if (dead[i] == 1) {
                                continue;
                            }
                            robots[i] += 1;
                            if (hs.contains(robots[i])) {
                                alive--;
                                dead[i] = 1;
                            }
                            

                        }

                    }
                    sb.append(alive).append(" ");
                }

            }

            sb.append("\n");
        }

        System.out.println(sb);

    }
}
