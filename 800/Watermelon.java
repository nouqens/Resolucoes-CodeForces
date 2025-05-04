
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Watermelon {
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

        int n = in.nextInt();
        int par = 0;
        boolean isInt = true;

        int d =0;
        int e =0;


        while(n%2==0 && n>1){
            d = n/2;
            e = n/2;
            n/=2;
            if(d>1 && e>1){
                par+=1;
            }
        }

        if (par>=1){
            out.println("YES");
            out.flush();
        }else {
            out.println("NO");
            out.flush();
        }


    }
}

