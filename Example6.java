/**
 * we use implements to use an interface
 */
public class Example6 implements Example5 {
    public void sayHi(){
        System.out.println("Hi!");
    }

    @Override
    public void openBag() {
        System.out.println("Bag opened");        
    }
}