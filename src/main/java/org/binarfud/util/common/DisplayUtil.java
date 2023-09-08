package org.binarfud.util.common;

import java.util.Scanner;

public class DisplayUtil {
    public String printLine(String karakter) {
        StringBuilder garis = new StringBuilder();
        for (int i = 0; i < 40; i++) {
            garis.append(karakter);
        }
        return garis.toString();
    }

    public void printWelcomeMessage(String message, String line) {
        System.out.println(printLine(line));
        System.out.println("\t " + message);
        System.out.println(printLine(line));
    }

    public int inputChoice(String message) {
        InputValidator inputValidator = new InputValidator(new Scanner(System.in));
        System.out.print(message + " ");
        return inputValidator.getValidIntegerInput();
    }

    public char inputConfirm(String message) {
        System.out.println(printLine("="));
        System.out.println("\t Mohon Masukan Input Piliha Anda");
        System.out.println(printLine("="));
        System.out.println("(Y) Untuk Lanjut");
        System.out.println("(N) Untuk Keluar");
        InputValidator inputValidator = new InputValidator(new Scanner(System.in));
        System.out.print(message + " ");
        return inputValidator.getValidCharInput();
    }
}
