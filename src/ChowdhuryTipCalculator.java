import java.util.Scanner;
public class ChowdhuryTipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, please enter your name: ");
        String name = scan.nextLine();

        System.out.println("Welcome, " + name + ". Please enter the number of people in your party today: ");
        int party = scan.nextInt();

        System.out.println("Now insert the the amount you would like to tip: ");
        int tip = scan.nextInt();

        System.out.println("How many dishes have you ordered off our menu today?");
        int dishes = scan.nextInt();


    }
}