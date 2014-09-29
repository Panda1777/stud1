package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean bool=true;
        Scanner sc = new Scanner(System.in);
        String s="";
        System.out.println("Привет! Хочешь побывать в шкуре студента? (y/n)");
        s=sc.nextLine();
        if (Yes(Check(s))) Day(s);
        else
            System.out.println("Прости, эта программа не для тебя..");

	// write your code here
    }
    public static boolean test(String s)
    {
        if ((s.charAt(0)=='y')|(s.charAt(0)=='n')) return true;
        else return false;
    }
    public static boolean Yes(String s)
    {
        if (s.charAt(0)=='y') return true;
        else return false;
    }
    public static void Holiday(String s)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Займемся абсолютно бесполезными делами..");
        System.out.println("Хочешь спать? (y/n)");
        s=sc.nextLine();;
        if (Yes(Check(s))) {
            System.out.println("Спокойной ночи!!");
            System.out.println("Здоровый и крепкий сон..");
            Day(s);
        }
        else Holiday(s);
    }
    public static void Day(String s)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ты проснулся? (y/n)");
        s=sc.nextLine();
        if (Yes(Check(s))) {
            System.out.println("Доброе утро!=) Нужно в увивер? (y/n)");
            s=sc.nextLine();
            if (!Yes(Check(s)))
                Holiday(s);
            else {
                System.out.println("Ты проспал пару? (y/n)");
                s=sc.nextLine();
                if (Yes(Check(s))) {
                    System.out.println("Сильно проспал? (y/n)");
                    s=sc.nextLine();
                    if (Yes(Check(s))) {
                        System.out.println("Тогда нет смысла вставать, можно поспать еще:)");
                        Day(s);
                    }
                    else{
                        System.out.println("Быстро встаем и идем в универ!");
                        Para(s);                    }

                }
                else {
                    Tanki(s);
                    System.out.println("Идем в универ");
                    Para(s);
                }
            }
        }
        else System.out.println("x__x");
    }
    public static void Tanki(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Отлично, тогда можно немного поиграть в танки!");
        System.out.println("Пора выходить? (y/n)");
        s=sc.nextLine();
        if (!Yes(Check(s))) Tanki(s);
    }
    public static void Para(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сидим на паре..((");
        System.out.println("Пора домой? (y/n)");
        s=sc.nextLine();
        if (Yes(Check(s)))  Holiday(s);
        else {
            System.out.println("Хочешь есть? (y/n)");
            s = sc.nextLine();
            if (Yes(Check(s))) {
                System.out.println("Тогда пора в столовую!!");
                Para(s);
            } else {
                System.out.println("Скучно? (y/n)");
                s = sc.nextLine();
                if (Yes(Check(s))) {
                    System.out.println("Займись чем нибудь интересным!");
                    System.out.println("все равно скучно? (y/n)");
                    s = sc.nextLine();
                    if (Yes(Check(s))) {
                        System.out.println("Тогда едем домой!");
                        Holiday(s);
                    } else Para(s);
                } else Para(s);
            }
        }

    }
    public static String Check(String s){
        Scanner sc = new Scanner(System.in);

        while (!test(s)){
            System.out.println("ошибка ввода, попробуй еще раз");
            s=sc.nextLine();
        }
        return s;

    }

}
