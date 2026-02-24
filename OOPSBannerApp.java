/**
 * OOPSBannerApp
 * UC5: Compact Array Initialization with String.join()
 * @author YourName
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Combining declaration and initialization into one concise block
        String[] banner = {
            String.join("", "  *** ", " *** ", "**** ", "**** "),
            String.join("", " * *", "* *", "P   *", "S    "),
            String.join("", " * *", "* *", "PPPP ", " *** "),
            String.join("", " * *", "* *", "P    ", "    *"),
            String.join("", "  *** ", " *** ", "P    ", "**** ")
        };

        // Enhanced for-loop remains for clean output
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
