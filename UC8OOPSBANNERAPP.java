import java.util.HashMap;
import java.util.Map;

/**
 * UC8 - Use Map for Character Patterns and Render via Function
 * Demonstrates use of HashMap and modular rendering.
 */
public class OOPSBannerAppUC8 {

    /**
     * Builds and returns a map of character patterns.
     */
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    /**
     * Renders the banner message.
     */
    public static void renderBanner(String message, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        renderBanner("OOPS", characterMap);
    }
}