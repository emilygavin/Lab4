public class Calc {

    public static int add(int valueOne, int valueTwo){
        int total = valueOne + valueTwo;
        return total;
    }

    public static int subtract(int valueOne, int valueTwo) throws Exception {
        if(valueTwo > valueOne){
            throw new Exception("Value two is greater than value one.");
        }
        else{
            int total = valueOne - valueTwo;
            return total;
        }
    }

    public static int multiply(int  valueOne, int  valueTwo){
        int total = valueOne*valueTwo;
        return total;
    }

    public static int divide(int  valueOne, int  valueTwo){
        int total = valueOne/valueTwo;
        return total;
    }
}
