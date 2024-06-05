package Two_Dimensional.ellipse;

public class perimeter_elipse
{
    //perimeter of elipse = 2*pi(sqrt((a^2+b^2)/2)
    public double perimeter( double a, double b)
    {
        return Math.PI*2 *((((a*a)+(b*b))/2)*0.5);
    }
}
