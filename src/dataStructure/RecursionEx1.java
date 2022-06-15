package dataStructure;

public class RecursionEx1 {
    public static void main(String[] args) {
        System.out.println("Starts the Program");
        openRussionDall(20);
        System.out.println("Ends the Program");
    }

    public static void openRussionDall(int dall){
        if(dall == 1){
            System.out.println(dall +" Number of doll get");
            System.out.println("All dolls are opened");
        }
        else {
            System.out.println(dall +" Number of doll get");
            openRussionDall(dall - 1);
        }
    }
}