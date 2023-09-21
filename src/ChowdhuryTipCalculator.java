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
        int num = dishes;
        double cost;
        double totalCost= 0;

        while (num > 0) {
            System.out.print("How much did each of your dishes cost?");
            cost = scan.nextDouble();
            scan.nextLine();
            totalCost += cost;
            num -= 1;
        }

        double tips = totalCost/tip;

        System.out.println("RECEIPT: ");
        System.out.println("Party of: " + party);
        System.out.println("Dishes ordered: " + dishes);
        System.out.println("====================================");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Cost per person before tip: $" + (totalCost/party));
        System.out.println("Percentage tipped: " + tip + "%");
        System.out.println("Total tip: $" + tips);
        System.out.println("Tip per person: $ " + (tips/party));
        System.out.println("Total bill after tip: $" + (tips+totalCost));

    }
}