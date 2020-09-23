/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19math;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("---Math---");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int max = 9;
        int min = 1;
        int t = 0;
        for (int i = 0; i < 5; i++) {
            int a = random.nextInt(max - min + 1) + min;
            int b = random.nextInt(max - min + 1) + min;
            System.out.println("");
            System.out.printf("\u001B[0m"+a+"*"+b+"=");
            int c = scanner.nextInt();
            if (a*b == c) {
                System.out.printf("\u001B[32m"+"Правильно");
                System.out.println();
                t++;
            } else {
                System.out.printf("\u001B[31m"+"Ошибка");
                System.out.println("");
            }
        }
        if (t==5) {
            System.out.println("молодец!");
        }
        if (t<5) {
            if (t>=2) {
                System.out.println("нужно подучить");
            }
        } 
        if (t<=1){
            System.out.println("срочно учи таблицу умножения");
        }
                
        System.out.println("---Конец программы---");
    }
}