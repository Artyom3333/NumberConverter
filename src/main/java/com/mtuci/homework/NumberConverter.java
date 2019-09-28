package com.mtuci.homework;
import java.util.Scanner;

/**
 * Условие: Создайте приватный метод convert с двумя целочисленными параметрами.
 * 1ый параметр - десятичное число которое нужно перевести,
 * 2ой параметр - система счисления в которую нужно перевести первый параметр.
 * Этот метод должен возвращать строку - результат перевода.
 * <p>
 * Внутри метода реализуйте логику перевода числа в указанную систему счисления и верните результат.
 */
public class NumberConverter {

  public static void main(String[] args) {
      int dev,perv;

      // Создается объект конвертера
      NumberConverter converter = new NumberConverter();
      // вызов метода ...

      Scanner in = new Scanner(System.in);
      System.out.println("Введите число в 10 системе:");
      dev= in.nextInt();
      System.out.println("Введите систему в которую нужно перевести");
      perv = in.nextInt();
      converter(dev,perv);

  }
  private static String converter(int i,int radix) {
       System.out.println(Integer.toString(i,radix));
    return null;
  }
  }

