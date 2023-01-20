import java.net.UnknownServiceException;
import java.util.Locale;

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
            System.out.println("Месяц " + g + " сумма накоплений " + total);
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
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Циклы 2. Задача №3");
        int population = 12_000_000;
        int fertility = (population / 1000) * 17;
        int mortality = (population / 1000) * 8;
        for (int y = 1; y <= 10; y++) {
            population = (population + fertility) - mortality;
            System.out.println("Год " + y + " исленность населения составляет " + population);
        }
        System.out.println();
        System.out.println("Циклы 2. Задача №4");
        double incomePerMonth = 15_000;
        double initialCapital = 15_000;
        double monthlyInterest = 0.07;
        int month = 0;
        while (initialCapital <= 12_000_000) {
            initialCapital = initialCapital + initialCapital * monthlyInterest;
            initialCapital = incomePerMonth + initialCapital;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений " + initialCapital);
        }
        System.out.println();
        System.out.println("Циклы 2. Задача №5");
        double incomePerMonth1 = 15_000;
        double initialCapital1 = 15_000;
        double monthlyInterest1 = 0.07;
        int month1 = 0;
        while (initialCapital1 <= 12_000_000) {
            initialCapital1 = initialCapital1 + initialCapital1 * monthlyInterest1;
            initialCapital1 = incomePerMonth1 + initialCapital1;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " сумма накоплений " + initialCapital1);
            }
        }
        System.out.println();
        System.out.println("Циклы 2. Задача №6");
        double incomePerMonth2 = 15_000;
        double initialCapital2 = 15_000;
        double monthlyInterest2 = 0.07;
        int month2 = 0;
        for (double p = 1; p <= 108; p++) {
            initialCapital2 = initialCapital2 + initialCapital2 * monthlyInterest2;
            initialCapital2 = incomePerMonth2 + initialCapital2;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма накоплений " + initialCapital2);
            }
        }
        System.out.println();
        System.out.println("Циклы 2. Задача №7");
        int friday = 5;
        int week=7;
        do {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + week;
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + week;
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + week;
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
        } while (friday == 31);

        System.out.println();
        System.out.println("Циклы 2. Задача №8");
        int cometStart = 79;
        int year200 = 1823;
        do {
            year200 = year200 + cometStart;
            System.out.println(year200);
            year200 = year200 + cometStart;
            System.out.println(year200);
            year200 = year200 + cometStart;
            System.out.println(year200);
        }while (cometStart > 79  && cometStart <=3000 );
    }
}