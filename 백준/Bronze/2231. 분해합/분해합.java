import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine()); // 입력받는 숫자

        for (int i=1; i<num; i++) {
            int temp = i; // 1부터 차례대로 검사
            int sum = temp; // 우선 sum에 예상되는 생성자 집어넣음

            while (temp > 0) {
                sum += temp % 10; // 예상되는 생성자의 각 자릿수 더하기
                temp /= 10; // 마지막 자릿수 제거 용
            }

            if (num == sum) {
                System.out.println(i);
                return; // 가장 작은 생성자 찾았으니 바로 종료
            }
        }
        System.out.println("0"); // 생성자 없을 경우 0 출력
    }
}