import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        double tank = 0;
        double mpg = 0;
        double price = 0;
        double costPerHundred = 0;
        double distance = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of gallons of gas in your tank");
        if(in.hasNextDouble())
        {
            tank = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("/n You said your tank was " + trash);
            System.out.println("Run the program again and enter a valid amount");
            System.exit(0);
        }
        System.out.print("Enter your mpg ");
        if(in.hasNextDouble())
        {
            mpg = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("/n You said your mpg was " + trash);
            System.out.println("Run the program again and enter a valid amount");
            System.exit(0);
        }
        System.out.print("Enter the price for gas");
        if(in.hasNextDouble())
        {
            price = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("/n You said your price was " + trash);
            System.out.println("Run the program again and enter a valid amount");
            System.exit(0);
        }

            costPerHundred = tank + mpg / 100;
            distance = tank * mpg;
            System.out.println("Your cost per hundred miles is " + costPerHundred);
            System.out.println("the total distance you can travel with your tank amount is " + distance  + " miles.");
    }
}