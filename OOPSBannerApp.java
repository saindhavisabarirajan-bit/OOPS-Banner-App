/**
 * OOPSBannerApp
 * UC3: Refactoring banner using String.join() for better memory management.
 * @author YourName
 * @version 3.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Constructing each line using String.join for efficiency
        System.out.println(String.join("", "  *** ", " *** ", "**** ", "**** "));
        System.out.println(String.join("", " * * ", "* * ", "P   * ", "S    "));
        System.out.println(String.join("", " * * ", "* * ", "**** ", " *** "));
        System.out.println(String.join("", " * * ", "* * ", "P     ", "    *"));
        System.out.println(String.join("", "  *** ", " *** ", "P     ", "**** "));
    }
}
