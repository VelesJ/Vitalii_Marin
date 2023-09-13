package Homework_nr_3;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args){
        // Генерация чисел от 1 до 12
        Random random_month = new Random();
        int month = random_month.nextInt(12) + 1;

        // 4 пункт домашнего задания

        switch(month){
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print ("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
            default:
                System.out.println(month);

        }
        System.out.println(" " + month);

        // 5 пункт домашнего задания
        int i = 100;
        while (i <= 1000){
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }

        System.out.println();
        // 6 пункт домашнего задания

        float n1 = 1.0f;
        float n2 = 3.0f;
        float sum = 0;
        while (n2 < 100){
            sum += n1 / n2;
            n1 += 2;
            n2 += 2;
        }
        System.out.println(sum);

    }
}

