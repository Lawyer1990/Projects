import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        hello(input);
        test1(input);
        test(input);
        input.close();
    }
    public static void test1(Scanner input) {
        int [] numbers = new int[5];
        ArrayList<Integer> arrayList = new ArrayList<>();
        try{
            for (int i=0;i<numbers.length;i++){
                System.out.print("Введите значение массива:");
                numbers[i] = input.nextInt();
                if (numbers[i]%3==0 & numbers[i]!=0) arrayList.add(numbers[i]);
            }
            System.out.println(arrayList.toString());
        } catch (Exception e){
            System.out.println("Значение некорректное");
        }
    }

    public static void hello(Scanner input) {
        System.out.print("Введите число больше 7:");
        try {
            int number = input.nextInt();
            if (number>7) System.out.println("Привет");
        } catch (Exception e) {
            System.out.println("Значение некорректное");
        }
    }
    public static void test(Scanner input) {
        System.out.print("Введите имя:");
        try {
            String name = input.next();
            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else System.out.println("Нет такого имени");

        } catch (Exception e) {
            System.out.println("Значение некорректное");
        }
    }
}

    /*Дана скобочная последовательность: [((())()(())]] - Можно ли считать эту последовательность правильной? - Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?

        Ответ: 1. Нет, она не правильная.2. Необходимо добавить скобки следующим образом [[((())()(()))]]
        */
