package example.arithmetic;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArithmeticCalculator calculator1 = new ArithmeticCalculator();
        Scanner scanner = new Scanner(System.in);


        while(true) {
            double first = 0.0;
            double second = 0.0;

            try {
                System.out.println("첫 번째 숫자를 입력해주세요(양의 정수)");
                double a = scanner.nextDouble();
                if(a >= 0) {
                    first = a;
                }
                System.out.println("첫 번째 숫자: " + first);
                System.out.println();

                System.out.println("두 번째 숫자를 입력해주세요(양의 정수)");
                double b = scanner.nextDouble();
                if(b >= 0) {
                    second = b;
                }
                System.out.println("두 번째 숫자: " + second);
                System.out.println();

                System.out.println("사칙연산 기호를 입력해주세요: (+,-,x,%)");
                char oper = scanner.next().charAt(0);
                System.out.println("입력한 기호: " + oper);
                System.out.println();

                double result = calculator1.calculate(first, second, oper);
                System.out.println("계산 결과: " + result);
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                scanner.nextLine();
                continue;

            }



            List<Double> list = calculator1.getList();
            System.out.println("지금까지의 결과 값: " + list);
            System.out.println();

            System.out.println("프로그램을 종료하려면 exit 입력 계속 하려면 아무거나 입력");
            String program = scanner.next();
            if (program.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

        }

        System.out.println("프로그램 끝");


    }
}
