package example.calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while(true) {

            System.out.println("첫 번째 숫자를 입력해주세요(양의 정수)");
            int a = scanner.nextInt();
            int first = 0;
            if (a >= 0) {
                first = a;
            }
            System.out.println("첫 번째 숫자: " + first);
            System.out.println();

            System.out.println("두 번째 숫자를 입력해주세요(양의 정수)");
            int b = scanner.nextInt();
            int second = 0;
            if(b >= 0) {
                second = b;
            }
            System.out.println("두 번째 숫자: " + second);
            System.out.println();

            System.out.println("기호를 입력해주세요: (+,-,x,%)");
            String operator = scanner.next();
            char oper = operator.charAt(0);
            System.out.println("입력한 기호: " + oper);
            System.out.println();

            int result = 0;
            if (oper == '+') {
                result = first + second;
            }else if (oper == '-'){
                result = first - second;
            }else if (oper == '%') {
                if(second == 0) {
                    System.out.println("나눗셈 연산에서 두번 째 값에 0은 넣을 수 없습니다.");
                    continue;
                }else {
                    result = first / second;
                }
            }else if (oper == 'x') {
                result = first * second;
            }

            System.out.println("계산 완료: " + result);

            System.out.println("프로그램을 종료하시고 싶으시면 exit 입력 아니라면 아무거나 입력");
            String program = scanner.next();
            if (program.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

        }




    }

}
