import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nilai: ");
            int nilai = scanner.nextInt();

            if (nilai < 1 || nilai > 100) {
                System.out.println("EROR: Nilai di luar batas(1-100)!");
            } else if (nilai >= 85) {
                System.out.println("Kamu Mendapatkan prediket: A");
            } else if (nilai >= 70) {
                System.out.println("Kamu Mendapatkan Prediket: B");
            } else if (nilai >= 55) {
                System.out.println("Kamu Mendapatkan Prediket: C");
            } else if (nilai >= 40) {  
                System.out.println("Kamu Mendapatkan Prediket: D");
            } else if (nilai < 40) {
                System.out.println("Kamu Mendapatkan Prediket: E");
            }
        }
    }
}