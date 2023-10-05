package cinema;

public class Cinema {
    public static void main(String[] args) {
        String[][] cinema = new String[7][8];

        // Initialize cinema seats
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                cinema[i][j] = "S";
            }
        }

        printSeats(cinema);
    }

    private static void printSeats(String[][] cinema) {
        // Title
        System.out.println("Cinema:");

        // Print column numbers
        System.out.print("  ");
        for (int i = 1; i <= 8; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print rows
        for (int i = 0; i < 7; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }
}