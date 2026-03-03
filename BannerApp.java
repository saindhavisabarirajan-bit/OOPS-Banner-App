public class BannerApp {
public class BannerApp {

    // UC7: Encapsulating Character data in a Static Inner Class
    static class CharacterPattern {
        private String[] pattern;

        // Constructor to set the ASCII array
        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        // Getter to retrieve the pattern
        public String[] getPattern() {
            return this.pattern;
        }
    }

    public static void main(String[] args) {
        // Initializing Objects (Separation of Data and Logic)
        CharacterPattern charO = new CharacterPattern(new String[]{"  *** ", " * * ", " * * ", " * * ", "  *** "});
        CharacterPattern charP = new CharacterPattern(new String[]{" **** ", " * * ", " **** ", " * ", " * "});
        CharacterPattern charS = new CharacterPattern(new String[]{"  **** ", " * ", "  *** ", "     * ", " **** "});

        // Building the banner by accessing Object properties
        String[][] banner = {
            charO.getPattern(),
            charO.getPattern(),
            charP.getPattern(),
            charS.getPattern()
        };

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

