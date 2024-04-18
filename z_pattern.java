public class z_pattern {
    static int size = 10;

    public static void main(String[] args) {
        pattern();
    }

    static void pattern() {
        // First Horizontal
        for (int i = 1; i <= size; i++) {
            System.out.print("*");
        }
        System.out.println();
        int count = size - 1;

        // Diagonal
        while (count >= 1) {
            for (int i = 1; i <= count - 1; i++) {
                System.out.print(" ");
            }

            // Last Horizontal
            if (count == 1) {
                for (int i = 1; i <= size; i++) {
                    System.out.print("*");
                }
                break;
            }
            System.out.println("*");
            count--;
        }
    }
}