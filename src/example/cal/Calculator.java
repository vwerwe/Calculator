package example.cal;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> list = new ArrayList<>();





    public int calculator (int a, int b, char oper) {
        int result = 0;
        if (oper == '+') {
            result = a + b;
        }else if (oper == '-'){
            result = a - b;
        }else if (oper == '%') {
            if(b == 0) {
                System.out.println("나눗셈 연산에서 두번 째 값에 0은 넣을 수 없습니다.");
            }else {
                result = a / b;
            }
        }else if (oper == 'x') {
            result = a * b;
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
