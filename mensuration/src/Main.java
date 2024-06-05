import Two_Dimensional.quadrilateral.square.squarearea;
import Two_Dimensional.triangle.area;
import Two_Dimensional.triangle.perimeter_and_lengths;

public class Main {
    public static void main(String[] args) {


        squarearea sqr = new squarearea();

            System.out.println("The area of square is:" +sqr.area_square(5));
            System.out.println("The perimeter of square is:" +sqr.diagonal_square(5));
            System.out.println("The perimeter of square is:" +sqr.perimeter_square(5));


       /* Area and perimeter of the triangle
         Can be used for normal calculating normal area using height and base(2 parameters) and also
          by using Heron's formula and can also be used for to calculate perimeter, CircumRadius and InRadius*/

        area triangle = new area();
        perimeter_and_lengths plt = new perimeter_and_lengths();

                System.out.println("Area of Tringle: " +triangle.area_triangle(12,5));
                System.out.println("Perimeter of the Triangle: " + plt.perimeter_triangle(12,5,8));
                System.out.println("CircumRadius of the Triangle: " +plt.circumradius_triangle(12,5,8));
                System.out.println("InRadius of the Triangle: " +plt.inradius_triangle(12,5,8));
    }
}