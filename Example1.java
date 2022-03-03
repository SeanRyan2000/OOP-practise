/**
 * inheritence
 * it inherits the methods and variables from the Example2 class
 * Now that this method has extends Example2 
 * we can use methods from the class Example2 in Example1
 * 
 * Examples1 = subclass
 * Example2 = super class
 */
public class Example1 extends Example2 {
        String name;

    public void sayName(){
        System.out.println("My name!");
    }

    /**
     * Polymorphism:
     * same method name as another but uses different/more/less arguments
     * here we are using a string as the extra argument 
     * 
     * We are overloading a method
     */
    public void sayName(String name) {
        System.out.println("My name is" + name);
    }
    /**
     * Method overriding 
     * as both methods are the same name it is using this method instead
     */
    public void sayHi(){
        System.out.println("Hi over ridden");
    }

    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.sayHi();
    }
}