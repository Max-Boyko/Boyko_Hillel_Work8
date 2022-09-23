import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваше завдання вгадати число");

        int range = 6;
        int number = (int) (Math.random() * range);

        while (true){
            System.out.println("Вгадай число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Вы вгадали");
                break;
            } else if (input_number > number) {
                System.out.println("Бажанне число менше");
            } else {
                System.out.println("Бажанне число бiльше");
            }


        }scanner.close();
    }
}
