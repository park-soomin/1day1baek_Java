import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[9];
        for (int i=0; i<9; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int max_num = 0;
        int max_index = 0;
        for (int i=0; i<9; i++) {
            if (a[i] >= max_num) {
                max_num = a[i];
                max_index = i+1;
            }
        }
        System.out.println(max_num);
        System.out.println(max_index);
    }
}