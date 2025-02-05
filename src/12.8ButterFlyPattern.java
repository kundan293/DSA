class ButterflyPattern {
    public static void main(String[] args) {
        int n = 6; // Number of rows for the top half of the butterfly

        // 1st half (top half of the butterfly)
        for (int i = 1; i <= n; i++) {
            // Left side stars (i stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces (2 * (n - i) spaces)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right side stars (i stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after each row
        }

        // 2nd half (bottom half of the butterfly)
        for (int i = n; i >= 1; i--) {
            // Left side stars (i stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces (2 * (n - i) spaces)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right side stars (i stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
