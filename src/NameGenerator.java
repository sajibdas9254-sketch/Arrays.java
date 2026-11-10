import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {

        String[] firstNames = {"Emma", "Liam", "Aino", "Mikko", "Sara", "Noah", "Olivia", "Elias"};
        String[] lastNames = {"Virtanen", "Korhonen", "Smith", "Nieminen", "Johnson", "Lahti", "Brown", "Laine"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many random names do you want to generate? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {

            int firstIndex = random.nextInt(firstNames.length);

            int lastIndex = random.nextInt(lastNames.length);

            String fullName = firstNames[firstIndex] + " " + lastNames[lastIndex];

            System.out.println(fullName);
        }

        scanner.close();
    }
}
