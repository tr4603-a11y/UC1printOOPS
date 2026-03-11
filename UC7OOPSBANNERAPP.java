/**
 * UC7 - Store Character Pattern in a Class
 * Demonstrates encapsulation and inner static class usage.
 */
public class OOPSBannerAppUC7 {

    /**
     * Static Inner Class to store character and its banner pattern.
     */
    public static class CharacterPattern {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and its pattern.
         * @param character banner character
         * @param pattern 7-line ASCII pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character.
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern.
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility method to create O pattern
    public static CharacterPattern createOPattern() {
        return new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
    }

    // Utility method to create P pattern
    public static CharacterPattern createPPattern() {
        return new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });
    }

    // Utility method to create S pattern
    public static CharacterPattern createSPattern() {
        return new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    public static void main(String[] args) {

        CharacterPattern o = createOPattern();
        CharacterPattern p = createPPattern();
        CharacterPattern s = createSPattern();

        CharacterPattern[] word = {o, o, p, s};

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }
}