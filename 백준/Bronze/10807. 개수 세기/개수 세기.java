import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] first_arr = br.readLine().split(" ");
        int[] final_arr = new int[N];
        int count = 0;

        for (int i=0; i<N; i++) {
            final_arr[i] = Integer.parseInt(first_arr[i]);
        }

        int v = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            if (final_arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}