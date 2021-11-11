import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("What football team do you like?");
        String home = scanner.nextLine();
        String greeting = String.format("Hello %s, nice to meet you. I love the %s", name, home);
        System.out.println(greeting);
    }
}