package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
    public void foo() {
        int i = 0;
        while (i >= 0) {
            switch (i) {
                case 1:
                case 2:
                    i++;
//                case 3:
//                    i++;
            }
        }
    }
}