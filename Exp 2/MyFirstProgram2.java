/* Write display method and access it using object of the class. 
Learn how to create objects of the class in java. */

class MyFirstProgram2
{
   void display()
   {
      System.out.println("Hello, I am enjoying Java");
   }
   public static void main(String arg[])
   {
      MyFirstProgram2 obj = new MyFirstProgram2();
      obj.display();
   }
}