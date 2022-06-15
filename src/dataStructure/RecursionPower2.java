package dataStructure;

public class RecursionPower2 {
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }
    public static int power(int base, int exp){
        if (base < 0 || exp < 0){
            return -1;
        }
        if(exp == 0){
            return 1;
        }
        return base * power(base, exp-1);
    }
}
