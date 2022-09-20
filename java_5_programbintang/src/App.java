public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("1. Bintang segitiga siku");
        int bilangan = 5;
        for (int index = 1; index <= bilangan; index++) {
            for (int i = 0; i < index; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2. Bintang segitiga siku");
        for (int index = 0; index < bilangan; index++) {
            for (int i = bilangan; i > index; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("3. Bintang segitiga sama sisi");
        for (int i = 0; i < bilangan; i++) {
            for (int j = bilangan; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
