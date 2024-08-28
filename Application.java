public class Simple Method Example
{

    // Method that takes two integers and returns their sum
    public static int add Numbers(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
#feature201 changes by Developer vivek for the module paymentgateway sept 2024
// Main method to run the program
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Accessing the public field
        System.out.println("Public Field: " + myObject.publicField);

        // Calling the public method
        myObject.publicMethod();
#end of feature201 code

     public static void main(String[] args) 
    {
        // Calling the method and storing the result
        int result = add Numbers(5, 7);

        // Printing the result
        System.out.println ("The sum is: " + result);
    }
}