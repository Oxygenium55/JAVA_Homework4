import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

/*В калькулятор добавьте возможность отменить последнюю операцию.
Пример

1
+
2
ответ:
3

+
4
ответ:
7

Отмена
3
*
3

ответ:
9 */

public class task3 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int result = 0;
        String operation;
        Scanner scanner = new Scanner(System.in);

        num1 = inputNumber("Введите 1е число: ");
        operation = inputOp("\nВведите оператор (+, -, *, /): ");
        num2 = inputNumber("Введите 2е число: ");

        Stack<Integer> stack = new Stack<>();

        if (Objects.equals(operation, "+")) {
            result = num1 + num2;
        } else if (Objects.equals(operation, "-")) {
            result = num1 - num2;
        } else if (Objects.equals(operation, "*")) {
            result = num1 * num2;
        } else if (Objects.equals(operation, "/")) {
            result = num1 / num2;
        } else
            System.out.printf("Неверное значение.");

        System.out.println(result);

        stack.push(result);
        while (true) {
            operation = inputOp("\n> Введите оператор (+, -, *, /), " +
                    "\n> Либо ведите \"cancel\" для " +
                    "удаления последнего результата: ");
            if (Objects.equals(operation, "cancel")) {
                System.out.println("Удаленное значение: " + stack.pop());
                result = stack.peek();
                System.out.println("Текущее значение: " + result);
            } else {
                num2 = inputNumber("Введите число: ");
                if (Objects.equals(operation, "+")) {
                    result = result + num2;
                } else if (Objects.equals(operation, "-")) {
                    result = result - num2;
                } else if (Objects.equals(operation, "*")) {
                    result = result * num2;
                } else if (Objects.equals(operation, "/")) {
                    result = result / num2;
                } else
                    System.out.printf("Неверное значение.");
                stack.push(result);
                System.out.println(result);
            }
        }
    }

    public static int inputNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        int num = scanner.nextInt();
        return num;
    }

    public static String inputOp(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        String str = scanner.nextLine();
        return str;
    }
}


