import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length;
        System.out.print("Введите длину Вашей комнаты в метрах: ");
        length = input.nextDouble();
        System.out.println("Длина Вашей комнаты: " + length + " м.");

        double width;
        System.out.print("Введите ширину Вашей комнаты в метрах: ");
        width = input.nextDouble();
        System.out.println("Длина Вашей комнаты: " + width + " м.");

        double height;
        System.out.print("Введите высоту Вашей комнаты в метрах: ");
        height = input.nextDouble();
        System.out.println("Высота Вашей комнаты: " +  height + " м.");

        double perimeter = (length + width) * 2;
        System.out.println("Периметр Вашей комнаты: " +  perimeter + " м.");

        int panels = (int) ((perimeter / 1.06) + 1);
        System.out.println("Количество полотнищ необходимо: " + panels + " шт.");

        int panelsInRulon = (int) (10 / (height + 0.1));
        System.out.println("Количество целых полотнищ в одном рулоне: " + panelsInRulon + " шт.");

        int totalRulon = (panels / panelsInRulon) + 1;
        System.out.println("Для Вашей комнаты необходимо приобрести: " + totalRulon + " рул.");

    }
}
