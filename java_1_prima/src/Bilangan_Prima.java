public class Bilangan_Prima {
    public static void main(String[] args) throws Exception {
        // 1 2 3 5 7 11
        // basis 1 dan 3 ketika bilangan bisa dibagi 1 dan bilangan itu sendiri
        // n sebagai count pembagi dari bilangan jadi inisialnya 0
        int bil = 0; // tidak teridentifikasi dalam perulangan sehingga tidak bisa dijadikan
                     // perhitungan jumlah yang dibagi habis
        int bilang = 15;

        for (int i = 0; i <= bilang; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    count = 2;
                } else if (i == 0) {
                    count = 0;
                } else if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }

        }
    }
}
