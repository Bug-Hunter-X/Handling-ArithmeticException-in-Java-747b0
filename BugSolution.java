public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            if (j == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues after exception.");
    }
}