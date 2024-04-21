package Two_Dimensional.triangle;
public class area 
{
    // Using height and base
    // Area = (base * height)/2
    public double area_triangle(double height,double base)
    {
        return height*base/2;
    }

    // Using sides of triangle a,b,c
    // s = (a + b + c)/2
    // Area = (s*(s-a)*(s-b)*(s-c))^(0.5)
    public double area_triangle(double a,double b,double c)
    {
        return Math.pow((0.5*(a+b+c)*0.5*(b+c-a)*0.5*(a+c-b)*0.5*(a+b-c)), 0.5);
    }
    
    // Using sides of triangle a,b and included angle between them C
    // Area = a*b*sin(C)/2
    public double area_triangle(double a,double b,float C)
    {
        return (0.5*a*b*Math.sin(Math.toRadians(C)));
    }

    // Using angle B and C, and side included between them a 
    // Area = 0.5 * a^2 * sin(B) * sin(C) / sin(B + C)
    public double area_triangle(double a,float B,float C)
    {
        return 0.5*Math.pow(a, 2)*Math.sin(Math.toRadians(B))*Math.sin(Math.toRadians(C))/Math.sin(Math.toRadians(B+C));
    }

    /*
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        area ar=new area();
        double p,q,r;
        float x,y;
        switch(sc.nextInt())
        {
            case 1:
            {
                System.out.println("Enter three sides:");
                p=sc.nextDouble();
                q=sc.nextDouble();
                r=sc.nextDouble();
                System.out.println(ar.area_triangle(p, q, r));
                break;
            }
            case 2:
            {
                System.out.println("Enter base and height:");
                p=sc.nextDouble();
                q=sc.nextDouble();
                System.out.println(ar.area_triangle(p, q));
                break;
            }
            case 3:
            {
                System.out.println("Enter two sides and included angle:");
                p=sc.nextDouble();
                q=sc.nextDouble();
                x=sc.nextFloat();
                System.out.println(ar.area_triangle(p, q, x));
                break;
            }
            case 4:
            {
                System.out.println("Enter two angles and included sides:");
                p=sc.nextDouble();
                x=sc.nextFloat();
                y=sc.nextFloat();
                System.out.println(ar.area_triangle(p, x, y));
                break;
            }
            default:
            {
                System.out.println("Retry");
            }
        }
        sc.close();
    }
    */
}