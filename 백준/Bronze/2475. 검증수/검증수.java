import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[5];
        int sum = 0;

        for(int i=0; i<5; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            sum += a[i] * a[i];
        }

        System.out.println(sum % 10);
    }
}