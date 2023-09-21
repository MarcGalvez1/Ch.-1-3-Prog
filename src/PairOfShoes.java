// Marc Galvez
// September 21, 2023
// Ch. 1-3 Prog

import java.util.Scanner;

public class PairOfShoes {
    // Create new scanner object.
    Scanner scnr = new Scanner(System.in);

    // Declares private methods to be called by other methods later
    // Methods will be set and get by other methods.
    private String brandName;
    private String shoeColor;
    private double shoeSize;

    public void setBrandName() {
        // Prompts and sets the brandName of the object by asking for user input.
        System.out.print("Enter the brand name of the shoes: ");
        brandName = scnr.nextLine();
    }

    public void setShoeColor() {
        // prompts and sets the shoeColor of the object by asking for user input.
        System.out.print("Enter the color of the shoes: ");
        shoeColor = scnr.nextLine();
    }

    public void setShoeSize() {
        // prompts and sets the shoeSize of the object  by asking for user input.
        System.out.print("Enter the size of the shoes: ");
        shoeSize = scnr.nextDouble();
    }
    public String getBrandName() {
        // Gets the brandName.
        return brandName;
    }

    public String getShoeColor() {
        // Gets the shoeColor.
        return shoeColor;
    }

    public double getShoeSize() {
        // Gets the shoeSize.
        return shoeSize;
    }

    public void printAll() {
        System.out.printf(shoeColor + " " + brandName + " Size %.1f ", shoeSize);
    }

}
