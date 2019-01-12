import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String lines[] = new String[10];
        Scanner scanner = new Scanner(System.in);

        int countOfLines = scanner.nextInt();
        scanner.nextLine();
        int currentCountOfLines = 0;

        while (currentCountOfLines < countOfLines) {
            String line = scanner.nextLine();
            lines[currentCountOfLines] = line;
            currentCountOfLines++;
        }

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }
}
