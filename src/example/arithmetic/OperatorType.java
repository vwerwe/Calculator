package example.arithmetic;

public enum OperatorType {
    ADD('+'), SUB('-'), MULTIPLY('x'), DIVISION('%');
    private char oper;

    OperatorType(char oper) {
        this.oper = oper;
    }

    public char getOper() {
        return oper;
    }

        public static OperatorType fromChar(char oper) {
        for(OperatorType o : OperatorType.values()){
            if(o.getOper() == oper) {
                return o;
            }
        }
            return null;
    }
}


