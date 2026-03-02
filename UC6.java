public class BannerApp {

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Loop to print banner line by line
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + P[i] + "   " + S[i]);
        }
    }

    // Helper method for O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Helper method for P
    public static String[] buildP() {
        return new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }

    // Helper method for S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
}