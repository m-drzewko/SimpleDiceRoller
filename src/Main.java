import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean finished = false;
        Scanner scanner = new Scanner(System.in);

        while(!finished) {
            System.out.print("What dice would you like to roll? Put the number of sides: ");
            int sides = scanner.nextInt();
            Die die = new Die(sides);

            System.out.print("How many dice would you like to roll?: ");
            int rolls = scanner.nextInt();

            System.out.print("Do you want to add a modifier? " +
                    "Input only whole numbers (0 for no modifier): ");
            int modifier = scanner.nextInt();

            StringBuilder builder = new StringBuilder();

            int result = 0;

            for (int i = 0; i < rolls; i++) {
                if (i > 0) {
                    builder.append(" + ");
                }
                int roll = die.roll();
                result += roll;
                builder.append(roll);
            }

            builder.append(" + (" + modifier + ")");
            result += modifier;
            builder.append(" = " + result);
            System.out.println(builder);

            System.out.print("Do you want to finish? y/n: ");
            String decision = scanner.next();

            if (decision.equals("y")) {
                finished = true;
            }
        }
    }
}