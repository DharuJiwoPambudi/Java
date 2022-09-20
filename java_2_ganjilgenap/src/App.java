public class App {
    public static void main(String[] args) throws Exception {
        int bilangan = 10;
        System.out.print("Genap:");
        for (int i = 0; i <= bilangan; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
        System.out.print("Ganjil:");
        for (int i = 0; i <= bilangan; i++) {
            if (i % 2 != 0 && i != 0) {
                System.out.print(" " + i);
            }
        }
    }
}
