
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку 7");
        //Домашнее задание 1
        System.out.println("Домашнее задание 3");
        //Задание 1
        System.out.println("Задание 1");
        int contribution = 29000;
        int total = 0;
        for(int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна "
                    + total + " рублей");
        }
        //Задание 2
        System.out.println("Задание 2");
        contribution = 29000;
        total = 0;
        int procent = 12;
        for(int i = 1; i <= 12; i++) {
            total = total + total*procent/100;
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна "
                    + total + " рублей");
        }
    }

}