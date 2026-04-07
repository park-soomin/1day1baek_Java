import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        int denominator = 1;
        for (int i=1; i<=K; i++) {
            denominator *= i;
        }

        int numerator = 1;
        for (int i=0; i<K; i++) {
            numerator *= (N-i);
        }

        System.out.println(numerator / denominator);
    }
}