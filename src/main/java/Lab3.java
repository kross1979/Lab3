
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author kimbe
 */
public class Lab3 {

    public static void main(String[] args) {

        int i, number, squareFootage = 0, gallons;
        double costPerGallon, laborCost, paintCost, totalCost, labor;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many rooms do you have? ");
        number = keyboard.nextInt();

        for (i = 0; i < number; i++) 
        {
            System.out.print("What is the square footage of room " + (i + 1) + "? ");
            squareFootage += keyboard.nextInt();
        }
        
        System.out.print("What is the cost per gallon of paint? ");
        costPerGallon = keyboard.nextDouble();
        gallons = numberOfGallons(squareFootage);
        paintCost = Paint(costPerGallon, gallons);
        labor = laborHours(squareFootage);
        laborCost = LaborCost(labor);
        totalCost = Total(paintCost, laborCost);
        Output(totalCost, squareFootage, paintCost, laborCost, labor, gallons);

    }

    public static double laborHours(int sqft) {
        return sqft / 115.;
    }

    public static int numberOfGallons(int sqft) {
        return (int) Math.ceil(sqft / 115.); 
    }

    public static double Paint(double cpg, int gal) {
        return cpg * gal;
    }

    public static double LaborCost(double labor) {
        return labor * (18.00 * 8);              
    }

    public static double Total(double paint, double labor) {
        return paint + labor;
    }

    public static void Output(double total, int sqft, double paint, double labor, double hours, int gallons) {
        DecimalFormat dec2 = new DecimalFormat("#0.00");
        System.out.println("It will cost $" + Double.parseDouble(dec2.format(total)) + " to paint " + sqft + " sq ft");
        System.out.println("Cost Breakdown:");
        System.out.println("Paint costs $" + Double.parseDouble(dec2.format(paint)) + " Labor cost $" + Double.parseDouble(dec2.format(labor)));
        System.out.println("Labor Hours " + Double.parseDouble(dec2.format(hours)) + " Paint used " + Double.parseDouble(dec2.format(gallons)) + " gallon");
    }
}
