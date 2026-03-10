import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");

        int N = Integer.parseInt(first[0]);
        int X = Integer.parseInt(first[1]);

        String[] arr = br.readLine().split(" ");

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(arr[i]);

            if (num<X) {
                System.out.print(num + " ");
            }
        }
    }
}