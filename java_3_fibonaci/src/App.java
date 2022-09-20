public class App {
    public static void main(String[] args) throws Exception {
        // bilangan 1 1 2 3 5 8 13
        int bilangan = 5;
        int bil1 = 1;
        int bil2 = 0;
        for (int j = 0; j < bilangan; j++) {

            System.out.print(bil1 + " ");
            int count = bil1 + bil2;
            bil2 = bil1;
            bil1 = count;

        }

    }
}
