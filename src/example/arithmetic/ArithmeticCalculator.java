package example.arithmetic;

import java.util.ArrayList;
import java.util.List;





public class ArithmeticCalculator {



    private List<Integer> list = new ArrayList<>();





    public int calculator (int a, int b, char oper) {
        int result = 0;
        OperatorType operator = OperatorType.fromChar(oper);

        switch(operator){
            case ADD: result = a + b;
            break;
            case SUB: result = a - b;
            break;
            case MULTIPLY: result = a * b;
            break;
            case DIVISION: result = a / b;
            default:
                System.out.println("지원되지 않는 연산자입니다.");
        }

        this.list.add(result);
        return result;
    }


    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void removeList() {
        this.list.remove(0);
    }

}
