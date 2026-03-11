public class OOPSBannerAppUC6 {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Assemble banner
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = o[i] + " " + o[i] + " " + p[i] + " " + s[i];
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for O
    public static String[] getOPattern() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Helper method for P
    public static String[] getPPattern() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Helper method for S
    public static String[] getSPattern() {
        return new String[] {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}