public class oopsBannerAppUC4 {
    public static void main(String[] args) {

        // Letter O
        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        // Letter P
        String[] P = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };

        // Another O
        String[] O2 = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        // Letter S
        String[] S = {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };

        // Print row by row using loops
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + P[i] + "  " + O2[i] + "  " + S[i]);
        }

}
}
