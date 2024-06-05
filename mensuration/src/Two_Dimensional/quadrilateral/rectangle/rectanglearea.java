package Two_Dimensional.quadrilateral.rectangle;

public class rectanglearea
{
    public double area_rectangle(double length, double breadth)
    {
        return length*breadth;
    }

}

class diagonal extends rectanglearea {
    public double diagonal_rectangle(double length, double breadth) {
        return Math.sqrt((length * length) + (breadth * breadth));
    }
}

class perimeter extends rectanglearea {
    public double perimeter_square(double length, double breadth)
    {
        return 2*(length + breadth);
    }
}