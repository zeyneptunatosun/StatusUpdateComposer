import java.util.Scanner;

public class StatusUpdateComposer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your user name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter a short subject line: ");
        String subject = scanner.nextLine();

        System.out.print("Enter your mood (one word): ");
        String mood = scanner.nextLine();

        System.out.print("Enter a short piece of additional info: ");
        String extraInfo = scanner.nextLine();

        System.out.println("--- STATUS UPDATE ---");
        System.out.println("User: " + userName);
        System.out.println("Subject: " + subject);
        System.out.println("Mood: " + mood);
        System.out.println("Extra info: " + extraInfo);
        System.out.println("---------------------");

        scanner.close();
    }
}
