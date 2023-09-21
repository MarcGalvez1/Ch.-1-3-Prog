
public class Main {
    public static void main(String[] args) {
        // Variables
        // Stores the getter method data
        String brandNameGetter;
        String shoeColorGetter;
        double shoeSizeGetter;

        //Create new objects.

        // Create new shoe objects
        PairOfShoes userPair = new PairOfShoes();
        PairOfShoes wifePair = new PairOfShoes();
        PairOfShoes kidPair  = new PairOfShoes();

        // Processing
        // Uses the setter methods to prompt and set the values for brandName, shoeColor, and shoeSize.
        // User setter methods.
        userPair.setBrandName();
        userPair.setShoeColor();
        userPair.setShoeSize();
        System.out.println();

        // Wife setter methods.
        wifePair.setBrandName();
        wifePair.setShoeColor();
        wifePair.setShoeSize();
        System.out.println();

        // Kid setter methods.

        kidPair.setBrandName();
        kidPair.setShoeColor();
        kidPair.setShoeSize();
        System.out.println();

        // Calls the getter methods.
        brandNameGetter = userPair.getBrandName();
        shoeColorGetter = wifePair.getShoeColor();
        shoeSizeGetter = kidPair.getShoeSize();

        // OUTPUT
        // Prints out the output messages.
        // Calls the printAll() method for all 3 objects.
        // User object Output using printAll()
        System.out.print("I have a pair of ");
        userPair.printAll();
        System.out.println("shoes.");

        // Wife object Output using printAll()
        System.out.print("My wife has a pair of ");
        wifePair.printAll();
        System.out.println("shoes that she really likes.");

        // Kid object output using printAll()
        System.out.print("My kid wears a pair of");
        wifePair.printAll();
        System.out.println("sneakers.");
        System.out.println();

        // Getter output



    }
}
