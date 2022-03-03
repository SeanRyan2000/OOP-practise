public class Example3 {

    /**
     * as this is private we will not be able to see it in other files
     * to deal with this we need to make a method to get it. 
     * these are setters and getters
     */
    private String flavor;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void openBag(){
        System.out.println("Bag is opened!");
    }

    public static void main(String[] args) {
        Example3 e3 = new Example3();
        e3.openBag();
    }
}