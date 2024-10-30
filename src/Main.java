import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);}


        //task 2

        for (int  i = 10; i >= 1; i = i - 1) {
            System.out.println(i);}


        //task 3

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);}


        //task 4

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);}


        //task 5

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");}


        //task 6

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);}


        //task 7

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);}


        //task 8

        int savings = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна");
            System.out.println(total);}


        //task 9

        int salary = 29000;
        int totalInBank = 0;
        for (int i = 0; i < 12; i++) {
            totalInBank = totalInBank + totalInBank/100;
            totalInBank = totalInBank + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна");
            System.out.println(totalInBank);}


        //task 10

        int namber = 0;
        for (int i = 1; i < 11; i = i  + 1) {
            namber = namber + 2;
            System.out.println(" 2 * " + i + " = " );
            System.out.println(namber);

        }










    }
}