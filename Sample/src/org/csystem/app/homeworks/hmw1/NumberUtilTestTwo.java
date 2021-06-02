package org.csystem.app.homeworks.hmw1;

public class NumberUtilTestTwo {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.printf("Birinci sayıyı giriniz:");
        int a = Integer.parseInt(kb.nextLine());
        System.out.printf("İkinci sayıyı giriniz:");
        int b = Integer.parseInt(kb.nextLine());
        System.out.printf("Üçüncü sayıyı giriniz:");
        int c = Integer.parseInt(kb.nextLine());

        System.out.printf("%d %n", mid(a, b, c));
    }

    public static int mid(int a, int b, int c) {

        int x = Math.max(a, Math.max(b, c));
        int y = Math.min(a, Math.min(b, c));

        if(a != x & a != y)
            return a;

        if(b != x & b != y)
            return b;

         return c;
    }

}
