public class SafeInput {

    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgWidth = msg.length();
        int starsWidth = totalWidth - 6; // 3 stars on each side
        int spacesWidth = starsWidth - msgWidth;

        // Top row of stars
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Centered message row
        System.out.print("***");
        for (int i = 0; i < spacesWidth / 2; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < spacesWidth / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Bottom row of stars
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
