import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        int size, max, threshold;
        System.out.print("Введите размер списка: ");
        size = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите верхнюю границу для значений: ");
        max = Integer.parseInt(scanner.nextLine());

        logger.log("Создаём и наполняем список");
        Random random = new Random();
        int[] ints = random.ints(size, 0, max).toArray();

        System.out.print("Полученный список: ");
        Arrays.stream(ints).forEach(element -> System.out.print(element + " "));System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        threshold = Integer.parseInt(scanner.nextLine());

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(threshold);
        List<Integer> result = filter.filterOut(ints);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный  список: ");
        result.stream().forEach(element -> System.out.print(element + " "));System.out.println();

        logger.log("Завершаем программу");
    }
}
