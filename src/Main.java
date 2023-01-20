public class Main {
    public static void main(String[] args) {
        System.out.println("HW-18.01.2023");


        System.out.println("Циклы 2. Задача №1");
        int salary = 15000;
        int total = 0;
        int g = 0;
        while (total < 2_459_000) {
            total = total + salary;
            g++;
            System.out.println("Месяц "+g+" сумма накоплений "+total);
        }
        System.out.println("Итого " + g + " месяца потребуется, для накоплений сумма " + total + " рублей");
        System.out.println();

        System.out.println("Циклы 2. Задача №2");
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(" "+i+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Циклы 2. Задача №3");


    }

}