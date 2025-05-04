import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BeforeAnExam {
    static class FastReader {

        BufferedReader b;

        StringTokenizer s;

        public FastReader() {
            b = new BufferedReader
                    (new InputStreamReader(System.in));
        }

        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return s.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;

        }
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int d = in.nextInt();
        int sumTime = in.nextInt();
        int[] minTime = new int[d];
        int[] maxTime = new int[d];
        int sumMin = 0;
        int sumMax = 0;

        for (int i = 0; i < d; i++) {
            int min = in.nextInt();
            minTime[i] = min;
            sumMin +=min;
            int max = in.nextInt();
            maxTime[i] = max;
            sumMax +=max;

        }

        if (sumTime< sumMin || sumTime> sumMax){
            out.println("NO");
            out.flush();
        }else{
           out.println("YES");
           out.flush();
            int[] schedule = minTime;
            int remaing = sumTime-sumMin;

            for (int i = 0; i < d; i++) {
                int add = Integer.min(maxTime[i] - minTime[i], remaing);
                schedule[i] += add;
                remaing-=add;
            }
            for (int i = 0; i < d; i++) {
                out.print(schedule[i] + " ");
                out.flush();
            }
        }
    }
}
