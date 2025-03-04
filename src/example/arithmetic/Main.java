package example.arithmetic;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArithmeticCalculator calculator1 = new ArithmeticCalculator();
        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.println("첫 번째 숫자를 입력해주세요(양의 정수)");
            int a = scanner.nextInt();
            int first = 0;
            if(a >= 0) {
                first = a;
            }
            System.out.println("첫 번째 숫자: " + first);

            System.out.println("두 번째 숫자를 입력해주세요(양의 정수)");
            int b = scanner.nextInt();
            int second = 0;
            if(b >= 0) {
                second = b;
            }
            System.out.println("두 번째 숫자: " + second);

            System.out.println("기호를 입력해주세요: (+,-,x,%)");
            char oper = scanner.next().charAt(0);
            System.out.println("입력한 기호: " + oper);

            int result = calculator1.calculate(first, second, oper);
            System.out.println("계산 결괴: " + result);

            List<Integer> list = calculator1.getList();
            System.out.println("지금까지의 결과 값: " + list);

            System.out.println("프로그램을 종료하시고 싶으시면 exit 입력 아니라면 아무거나 입력");
            String program = scanner.next();
            if (program.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

        }



    }
}
