package org.example;
/*
// Задача 1
// Программа должна выводить в консоль числа от 0 до 1000,
// которые делятся на 3, но не делятся на 5.
//Сумма чисел, которые образуют запись числа должна быть меньше 10.
//Посчитать, сколько таких чисел

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        int count = 0;
        for (int i = 3; i < 1000; i=i+3) {
            if (i % 3 == 0 && i % 5 != 0) {
                number = i;
                while (number != 0) {
                    sum += number % 10;
                    number /= 10;
                }
                if (sum < 10) {
                    System.out.print(i + " ");
                    count++;
                }
                sum = 0;
            }
        }
        System.out.println("\nКоличество чисел, которые делятся на 3, но не делятся на 5: " + count);
    }
}*/

// Задача 2
// Программа должна поменять значение переменных не используя третью переменную.
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }
}*/

// Задача 3
//Перевернуть строку не используя reverse().
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        System.out.println("Перевернутая строка: " + builder);
    }
}*/

//Задача 4.
// Вводится строка, состоящая из слов, разделенных пробелами. Необходимо вывести в консоль первые буквы каждого слова.
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.print(word.charAt(0));
        }
        System.out.println();
    }
}*/

// Задача 5.
// Вводится строка, состоящая из слов, разделенных пробелами. Необходимо вывести в консоль последние буквы каждого слова.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String [] words = text.split(" ");
        for (String word : words) {
            char [] chars = word.toCharArray();
            System.out.print(chars[chars.length-1]);
        }
        System.out.println();
    }
}

