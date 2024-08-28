public class Simple Method Example
{

    // Method that takes two integers and returns their sum
    public static int add Numbers(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
   
#feature202 changes on reports module by Ethan in sept 2024
// Public method to access private members
    public void accessPrivateMembers() {
        // Accessing the private field
        System.out.println("Private Field: " + privateField);

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


        // Calling the private method
        privateMethod();
    }
#end of feature202 changes
     public static void main(String[] args) 
    {
        // Calling the method and storing the result
        int result = add Numbers(5, 7);

        // Printing the result
        System.out.println ("The sum is: " + result);
    }
}