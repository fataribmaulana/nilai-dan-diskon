
import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Status Member (GOLD/SILVER/BRONZE/REGULAR): ");
        String statusMember = scanner.nextLine().toUpperCase();
        int diskon;

        switch (statusMember) {
            case "GOLD":
                diskon = 20;
                break;
            case "SILVER":
                diskon = 15;
                break;
            case "BRONZE":
                diskon = 10;
                break;
            case "REGULAR":
                diskon = 5;
                break;
            default:
                System.out.println("Status member tidak valid.");
                return; 
        }
        System.out.println("Anda mendapatkan diskon sebesar: " + diskon + "%");
    }
}
