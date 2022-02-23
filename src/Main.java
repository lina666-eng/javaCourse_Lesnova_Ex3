package com.company;
import java.io. *;

public class Main {
    public static void main(String[] args){
        int[] a = {3, 22, 1, 13, 4, 6, 16, 5};
        System.out.print("№1" +" \n");
        for (int i = 0; i < a.length;i++){
            if (a[i]%2 == 0)
                System.out.print(a[i] + " ");
        }
        System.out.print(" \n" + "№2" +" \n");
        for (int i = 0; i < a.length;i++){
            if (a[i] >= 10 && a[i] <= 99)
                System.out.print(a[i] + " ");
        }
        System.out.print(" \n" + "№3" +" \n");
        int max = a[0];
        for (int i = 0; i < a.length; i++)
            max = Math.max(max, a[i]);
        System.out.print(max);
        System.out.print(" \n" + "№4" +" \n");
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum = sum + a[i];
        System.out.print(sum);
        System.out.print(" \n" + "№5" +" \n");

        int[] b = new int[a.length];
        for (int i = a.length-1; i > 0;) {
            for (int j = 0; j < a.length; j++) {
                b[j] = a[i];
                i--;
                System.out.print(b[j] + " ");
            }

        }






    }
}

