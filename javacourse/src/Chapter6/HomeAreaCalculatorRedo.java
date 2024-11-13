package Chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

   private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area =calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The Total Area Is: " + area);
        calculator.scanner.close();

    }
    public Rectangle getRoom(){
        System.out.println("Please Enter the Length of the Room");
        double Length = scanner.nextDouble();

        System.out.println("Please Enter the Width of the Room");
        double Width = scanner.nextDouble();





        return new Rectangle(Length, Width);

        }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.CalculateArea() + rectangle2.CalculateArea();
    }
}
