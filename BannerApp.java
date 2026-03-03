public class BannerApp {
copy con BannerApp.java
public class BannerApp {
    // UC7: Encapsulating Character data in a Static Inner Class
    static class CharacterPattern {
        private String[] lines;
        public CharacterPattern(String[] lines) { this.lines = lines; }
        public String[] getLines() { return this.lines; }
    }

    public static void main(String[] args) {
        // Initializing objects (Encapsulation)
        CharacterPattern o = new CharacterPattern(new String[]{"  *** ", " * * ", " * * ", " * * ", "  *** "});
        CharacterPattern p = new CharacterPattern(new String[]{" **** ", " * * ", " **** ", " * ", " * "});
        CharacterPattern s = new CharacterPattern(new String[]{"  **** ", " * ", "  *** ", "     * ", " **** "});

        String[][] banner = { o.getLines(), o.getLines(), p.getLines(), s.getLines() };
        render(banner);
    }

    public static void render(String[][] banner) {
        for (int i = 0; i < 5; i++) {
            for (String[] letter : banner) {
                System.out.print(letter[i] + "  ");
            }
            System.out.println();
        }
    }
}
^Z
