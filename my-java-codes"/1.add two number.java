import java.util.Scanner;
class Main {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculoter !" );
        System.out.print("enter the first value:");
        int FirstValue =input.nextInt();
        System.out.print("enter the second value:");
        int secondValue =input.nextInt();
        
        int sum = FirstValue + secondValue ;
        int mul = FirstValue * secondValue ;
        int div = FirstValue / secondValue ;
        int sub = FirstValue - secondValue ;
        
        System.out.println("this is sum :" + sum);
        System.out.println("this is mul :" + mul);
        System.out.println("this is div :" + div);
        System.out.println("this is sub :" + sub);
        
}
}
