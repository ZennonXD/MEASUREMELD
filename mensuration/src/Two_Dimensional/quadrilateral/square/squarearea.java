package Two_Dimensional.quadrilateral.square;

public class squarearea
{
    public double area_square(double length)
    {
        return Math.pow(length,2);
    }

    public double diagonal_square(double length) {
        return length * Math.sqrt(2);
    }
    public double perimeter_square(double length)
    {
        return length*4;
    }
}