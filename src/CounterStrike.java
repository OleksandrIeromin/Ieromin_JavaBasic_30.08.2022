import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter team 1 name:");
      String teamName1 = scanner.next();
      System.out.println("Enter team 2 name:");
      String teamName2 = scanner.next();

        // Случайно генерируем фраги для команд (от 0 до 20 у каждого из 5-ти игроков)
        int[] team1 = { (int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20) };
        int[] team2 = { (int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20) };

        // Сравниваем результаты команд1
        int team1Result = team1[0] + team1[1] + team1[2] + team1[3] + team1[4];
        int team2Result = team2[0] + team2[1] + team2[2] + team2[3] + team2[4];
        boolean result = team1Result > team2Result;

        if (result) {
            System.out.println("Winner is team " + teamName1 + " with " + team1Result + " points");
        } else {
            System.out.println("Winner is team " + teamName2 + " with " + team1Result + " points");
        }
    }
}
