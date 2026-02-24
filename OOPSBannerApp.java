/**
 * OOPSBannerApp
 * UC4: Using String Arrays and Loops for better modularity.
 * @author YourName
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Define the banner lines in a String array
        String[] banner = {
            String.join("", "  *** ", " *** ", "**** ", "**** "),
            String.join("", " * * ", "* * ", "* * ", "* "),
            String.join("", " * * ", "* * ", "**** ", " *** "),
            String.join("", " * * ", "* * ", "* ", "    *"),
            String.join("", "  *** ", " *** ", "* ", "**** ")
        };

        // Use an enhanced for-loop to print the array
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
