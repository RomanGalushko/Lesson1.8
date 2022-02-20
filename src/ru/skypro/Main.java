package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

class Main {

//Tesk1

    public static void printLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        printLeapYearResult(year, leapYear);
    }

    private static boolean isLeapYear(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 == 0;
    }

    private static void printLeapYearResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — невисокосный год");
        }
    }

//Tesk2

    public static int writeOS(int year, int OS) {
        int currentYear = LocalDate.now().getYear();
        if (OS == 0 && year < currentYear - 1) {
            return 0;
        } else if (OS == 0 && year >= currentYear - 1) {
            return 1;
        } else if (OS == 1 && year < currentYear - 1) {
            return 2;
        } else if (OS == 1 && year >= currentYear - 1) {
            return 3;
        }
        return currentYear;
    }

    public static void print(int year, int OS) {
        String iOS = "iOS";
        String android = "android";
        int clientOS = writeOS(year, OS);
        if (clientOS == 0) {
            System.out.println("Установите облегченную версию для ОС - " + iOS);
        } else if (clientOS == 1) {
            System.out.println("Установите обычную версию для ОС - " + iOS);
        } else if (clientOS == 2) {
            System.out.println("Установите облегченную версию для ОС - " + android);
        } else if (clientOS == 3) {
            System.out.println("Установите обычную версию для ОС -  " + android);
        }
    }

//Tesk3

    public static int deliveryDistanceWrite(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 0;
        } else if (deliveryDistance < 60) {
            return 1;
        } else if (deliveryDistance <= 100) {
            return 2;
        }
        return deliveryDistance;
    }

    public static void printDay(int deliveryDistance) {
        int day = deliveryDistanceWrite(deliveryDistance);
        if (day == 0) {
            System.out.println("Потребуется на доставку дней: " + 1);
        } else if (day == 1) {
            System.out.println("Потребуется на доставку дней: " + 2);
        } else if (day == 2) {
            System.out.println("Потребуется на доставку дней: " + 3);
        }
    }

//Tesk4

    public static void printText(String text) {
        char[] newText = text.toCharArray();
        boolean isDublicateExixts = false;
        for (int i = 0; i < text.length() - 1; i++) {
            if (newText[i] == newText[i + 1]) {
                System.out.print("Найден дубль: " + newText[i]);
                isDublicateExixts = true;
                break;
            }
        }
        if (!isDublicateExixts) {
            System.out.println("Дубли не найдены!");
        }
    }

//Tesk5

    public static void printReversNumber(int[] number){
        int liftIndex = 0;
        int rightIndex = number.length - 1;
        while (liftIndex < rightIndex){
            int temp = number[liftIndex];
            number[liftIndex] = number[rightIndex];
            number[rightIndex] = temp;
            liftIndex++;
            rightIndex--;
        }
        System.out.println("элементы в обратном порядке:" + Arrays.toString(number));
    }


    public static void main(String[] args) {
//Tesk1
        printLeapYear(2024);
//Tesk2
        print(2022, 1);
//Tesk3
        printDay(59);
//Tesk4
        printText("aabccddefgghiijjkk");
// Tesk5
        int[] number = new int[]{3, 2, 1, 6, 5};
        printReversNumber(number);
    }
}