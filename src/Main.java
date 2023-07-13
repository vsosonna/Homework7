public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        int i = 0;
        int monthInstallment = 15000;
        int m = 0;
        while (i <= 245900) {
            m = m + 1;
            i = i + monthInstallment;
            System.out.println("Месяц " + m + "сумма накоплений равна " + i + " рублей");
        }
    }

    public static void task2() {
        int a = 0;
        int b = 10;
        while (a <= 9) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        for (; b >= 1; b = b - 1) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int fertility = 17;
        int mortality = 8;
        int population = 12000000;
        int yearTotal = 10;
        int year = 0;
        while (year < yearTotal) {
            population += population / 1000 * (fertility - mortality);
            year++;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }

    public static void task4()

    {
        System.out.println( "Задача 4");
        int amountSavings = 12000000;
        double salary = 15000;
        int x = 0;
        int percent = 7;
        while (salary <= amountSavings) {
            salary += salary * percent / 100;
            x++;
            System.out.println("Месяц " + x + " Итого " + salary);
        }
        System.out.println("Итоговая сумма " + salary + "потребовалось месяцев " + x);
    }

    public static void task5() {
        int amountSavings1 = 12000000;
        double salary1 = 15000;
        int x1 = 1;
        int percent = 7;
        while (salary1 <= amountSavings1) {
            if (x1 % 6 == 0)
                System.out.println("Месяц " + x1 + " Итого " + salary1);
            salary1 += salary1 * percent / 100;
            x1++;
        }
        System.out.println("Итоговая сумма " + salary1 + " потребовалось месяцев " + x1);
    }

    public static void task6() {
        System.out.println( "Задача 6");
        double summa = 15000;
        int percent1 = 7;
        int month = 0;
        int year = 9;
        while (month < year * 12) {
            summa += summa * percent1 / 100;
            month++;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + "итого " + summa);
        }
        System.out.println("Итоговая сумма " + summa + " потребовалось месяцев " + month);
    }

    public static void task7() {
        int friday = 2;
        int dayMonth = 31;
        while (friday <= dayMonth) {
            friday += 7;
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");

        }
    }

    public static void task8() {
        int thisYear = 2023;
        int recentYears = 200;
        int nextYear = 100;
        int comet = 79;

        for (int p = 0; p < thisYear + nextYear; p += comet) {
            if (p > thisYear - recentYears) {
                System.out.println(p);
            }
        }

    }
}




