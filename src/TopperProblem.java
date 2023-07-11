import java.util.Scanner;
public class TopperProblem {

        public static void main(String[] args) {
            int sum = 0;
            int sum1 = 0;
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            while (number > 0) {
                int n1 = number % 10;
                if (n1 % 2 == 0) {
                    sum += n1;
                } else {
                    sum1 += n1;
                }
                number = number / 10;
            }

            if (sum == sum1) {
                boolean result=true;
                System.out.println(result);
            } else {
                boolean result=false;
                System.out.println(result);
            }
        }

}
