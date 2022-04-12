// Implement interface in java

import java.util.*;  

interface Square
{
    public void areaSquare(Integer side);
}
interface Rectangle
{
    public void areaRectangle(Integer length, Integer breadth);
}

public class ShapeInterfaceProgram implements Square, Rectangle
{
    public void areaSquare(Integer side)
    {
        Integer result = side*side;
        System.out.println("Area of square: " + result);
    }
    public void areaRectangle(Integer length, Integer breadth)
    {
        Integer result = length*breadth;
        System.out.println("Area of square: " + result);
    }

    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        ShapeInterfaceProgram shape = new ShapeInterfaceProgram();

        System.out.println("Enter side of square = ");
        Integer side = scn.nextInt();
        shape.areaSquare(side);

        System.out.println("Enter length of rectangle = ");
        Integer length = scn.nextInt();
        System.out.println("Enter breadth of rectangle = ");
        Integer breadth = scn.nextInt();
        shape.areaRectangle(length, breadth);
    }
}