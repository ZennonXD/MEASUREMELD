package Two_Dimensional.triangle;

public class perimeter_and_lengths
{
    // Using sides of triangle a,b,c
    // perimeter = (a + b + c)
    public double perimeter_triangle(double a,double b,double c)
    {
        return (a+b+c);
    }

    public double circumradius_triangle(double a,double b,double c)
    {
        return a*b*c/Math.pow(((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c)), 0.5);
    }

    public double inradius_triangle(double a,double b,double c)
    {
        return Math.pow((0.5*(a+b+c)*0.5*(b+c-a)*0.5*(a+c-b)*0.5*(a+b-c)), 0.5)/((a+b+c)/2);
    }
}