package dataStructure;

public class RecursionIteration {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(4));
    }
    public static int powerOfTwo(int n){
        int i = 0;
        int power = 1;
        while (i < n){
            power = 2 * power;
            i ++;
        }
        return power;
    }
}
