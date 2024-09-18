import java.util.Scanner;

public class SafeInputObj {
    private Scanner pipe;

    // Constructor
    public SafeInputObj() {
        this.pipe = new Scanner(System.in);
    }

    // Method to get a string input
    public String getString(String prompt) {
        System.out.print(prompt);
        return pipe.nextLine();
    }

    // Other input methods can be added similarly
}
