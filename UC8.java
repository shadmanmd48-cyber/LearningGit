import java.util.HashMap;

public class OOPSBannerAppUC8 {

    // HashMap to store character patterns
    private static HashMap<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        // Initialize patterns
        initializePatterns();

        // Render the banner
        renderBanner("OOPS");
    }

    // Method to initialize character patterns
    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Method to render banner
    private static void renderBanner(String word) {

        word = word.toUpperCase();

        int height = 5; // Number of rows in each character pattern

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                if (patternMap.containsKey(ch)) {
                    System.out.print(patternMap.get(ch)[row] + "  ");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}