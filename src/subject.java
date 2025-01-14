/**
 * Name: subject.java
 * Date: 14 January 2025
 * Author: Thy Sethasarakvath
 * Modified: 14 January 2025
 * Description: Lab 05
 * Functions:
 * -getPrice(): subject
 * -getProgram(): subject
 * -getName(): subject
 * -getCredits(): subject
 * Variables:
 * -price: subject
 * -PROGRAM: subject
 * -name: subject
 * -credits: subject
 */

public class subject {

    private static final double price;
    static {
        price = 10.9;
    }

    private static final String PROGRAM = "Year 2 Program";  

    private String name;
    private int credits;

    public static final double getPrice() {
        return price;
    }

    public static String getProgram() {
        return PROGRAM;
    }

    public subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) { //checking if the name variable is either uninitialized (null) or if it is an empty string ("").
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }
        this.name = name;
    }

    public static void main(String[] args) {

    }

}