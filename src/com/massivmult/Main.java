package com.massivmult;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Введите размер массива");
        length = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + i + " -ое число ");
            array[i] = scanner.nextInt();
        }