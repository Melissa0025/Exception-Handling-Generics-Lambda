public class ExceptionHandling 
{
   public static void main(String[] args) 
   {
        try {
            // Code that might throw an exception
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the specific exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Code that will always run
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}