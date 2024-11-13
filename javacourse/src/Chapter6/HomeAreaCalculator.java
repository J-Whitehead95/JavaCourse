package Chapter6;
/* write a class that creates instances of the Rectangle class to find the
total area of two rooms in a house
 */
public class HomeAreaCalculator {
    public static void main(String args[]){
        /********************
         * Rectangle1
         *******************/


        //create instance of rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(20);
        room1.setLength(50);

        double areaOfRoom1 = room1.CalculateArea();

        /********************
         * Rectangle2
         *******************/
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.CalculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of Both Rooms is: " + totalArea);
    }
}
