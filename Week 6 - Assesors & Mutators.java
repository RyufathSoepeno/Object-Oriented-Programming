public class Circle /* Class named circle */ {
    double radius = 0; // Instance Variable
    double area = 0; // Instance Variable
    double perimeter = 0; // Instance Variable

    /** =============================================*/
    // Assesors
    public double getArea()
    {
        return area;
    }

    public double getPerimeter()
    {
        return perimeter;
    }
    /** =============================================*/

    public void getResults(){
        radius = 10;
        double pi = 3.14;
        double TheArea = pi * radius * radius;
        double ThePerimeter = 2 * pi * radius;

        area = TheArea; // Mutators
        perimeter = ThePerimeter; // Mutators
        System.out.println("The area of " + radius + "is: " + area);
        System.out.println("The perimeter of " + radius + "is: " + perimeter);
    }
}
