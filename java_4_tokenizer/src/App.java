import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        // pakai kelas tokenizer di library ja
        // terdapat 2 komponen penting yaitu (string, delimiter) string berfungsi untuk
        // menampung kalimatnya sementara delimiter untuk memasukkan spesial karakter
        String kalimat = "Aku.sayang!kamu, aaaaa";
        String delimiter = ". ,!";
        StringTokenizer token = new StringTokenizer(kalimat, delimiter);
        while (token.hasMoreTokens()) { // hasMoreTokens berfungsi untuk mengecek apakah masih terdapat token setelahnya
                                        // atau tidak. Bisa juga make hasMoreElements()
            System.out.println(token.nextToken());
        }
    }
}
