import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {

            int value = new Random().nextInt(100);
            System.out.println("Для разработчика: загаданное число " + value);

            do {
                int attempt = new Scanner(System.in).nextInt();

                if (attempt < value && attempt >= 0) {
                    System.out.println("Слишком мало");
                } else if (attempt > value && attempt <= 100) {
                    System.out.println("Слишком много");
                } else if (attempt > 100) {
                    System.out.println("Число должно быть меньше ста");
                } else if (attempt < 0) {
                    System.out.println("Число должно быть больше нуля");
                } else {
                    System.out.println("Вы угадали. Давайте сыграем ещё!");
                    break;
                }
            }
            while (true);
        }
    }
}