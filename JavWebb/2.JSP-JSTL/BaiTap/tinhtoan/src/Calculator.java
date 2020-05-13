public class Calculator {
    public static float calculate(float fist,float second,char operator){
        switch (operator){
            case '+':
                return fist + second;
            case '-':
                return fist - second;
            case '*':
                return fist * second;
            case '/':
                if(second !=0){
                    return fist / second;
                }
                else
                    throw new RuntimeException("Can't divide by zero");
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
