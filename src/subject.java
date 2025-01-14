public class subject {

    private static final double price;
    static {
        price = 9.9;
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
    public static void main(String[] args) {

    }

}