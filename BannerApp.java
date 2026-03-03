public class BannerApp {
    public static void main(String[] args) {
        String[][] banner = { getLetterO(), getLetterO(), getLetterP(), getLetterS() };
        render(banner);
    }
    public static String[] getLetterO() {
        return new String[]{"  *** ", " * * ", " * * ", " * * ", "  *** "};
    }
    public static String[] getLetterP() {
        return new String[]{" **** ", " * * ", " **** ", " * ", " * "};
    }
    public static String[] getLetterS() {
        return new String[]{"  **** ", " * ", "  *** ", "     * ", " **** "};
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




