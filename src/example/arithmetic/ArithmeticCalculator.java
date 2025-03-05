package example.arithmetic;

import java.util.ArrayList;
import java.util.List;


public class ArithmeticCalculator {



    private List<Double> list = new ArrayList<>();





    public <S extends Number> double calculate(S a, S b, char oper) throws IllegalArgumentException {
        double num1 = a.doubleValue();
        double num2 = b.doubleValue();
        double result = 0;
        OperatorType operator = OperatorType.fromChar(oper);


            if(operator == null) {
                throw new IllegalArgumentException("지원되지 않는 연산자입니다.");
            }

            if(num2 == 0 && operator == OperatorType.DIVISION) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }





        switch(operator){
            case ADD: result = num1 + num2;
            break;
            case SUB: result = num1 - num2;
            break;
            case MULTIPLY: result = num1 * num2;
            break;
            case DIVISION: result = num1 / num2;
            break;
            default:
                System.out.println("지원되지 않는 연산자입니다!");
        }

        this.list.add(result);
        return result;
    }


    public List<Double> getList() {
        return list;
    }

    public void setList(List<Double> list) {
        this.list = list;
    }

    public void removeList() {
        this.list.remove(0);
    }

}
