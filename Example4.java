public class Example4{

    /**
     * Encapsulation
     * Here we are setting and getting the flavor through variables even though it is a private variable
     * We are doing this as it is more secure to use private variables
     */
    public static void main(String[] args){
        Example3 e3 = new Example3();
        e3.setFlavor("beef");
        System.out.println(e3.getFlavor());
    }
}