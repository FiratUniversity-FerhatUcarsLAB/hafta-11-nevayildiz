import java.util.Scanner;

public class Exercise4_1 {

    // Amerikan tarih formatını yazdıran metot
    // Örn: Monday, July 22, 2019
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa tarih formatını yazdıran metot
    // Örn: 22 July 2019, Monday
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {

        // Kullanıcıdan giriş almak için Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Günü girin (ör: Monday): ");
        String day = input.nextLine();

        System.out.print("Ayı girin (ör: July): ");
        String month = input.nextLine();

        System.out.print("Tarihi girin (ör: 22): ");
        int date = input.nextInt();

        System.out.print("Yılı girin (ör: 2019): ");
        int year = input.nextInt();

        System.out.println("\n--- Amerikan Formatı ---");
        printAmerican(day, date, month, year);

        System.out.println("\n--- Avrupa Formatı ---");
        printEuropean(day, date, month, year);

       
    }
}
