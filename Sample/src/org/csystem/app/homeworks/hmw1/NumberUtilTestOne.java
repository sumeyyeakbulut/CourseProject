package org.csystem.app.homeworks.hmw1;

import org.csystem.util.NumberUtil;

public class NumberUtilTestOne {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.printf("Birinci sayıyı giriniz:%n");
        int a = Integer.parseInt(kb.nextLine());

        System.out.printf("İkinci sayıyı giriniz:%n");
        int b = Integer.parseInt(kb.nextLine());

        System.out.printf("Üçüncü sayıyı giriniz:%n");
        int c = Integer.parseInt(kb.nextLine());

        sort(a, b, c);
    }

    public static void sort (int a, int b, int c)
    {
        int max = NumberUtil.max(a, b, c);
        int mid = NumberUtil.mid(a, b, c);
        int min = NumberUtil.min(a , b, c);

        if (max == min)
            System.out.printf("%d = %d = %d", max, mid, min);
        else if (max == mid)
            System.out.printf("%d = %d > %d", max, mid, min);
        else if (mid == min)
            System.out.printf("%d > %d = %d", max, mid, min);
        else
            System.out.printf("%d > %d > %d", max, mid, min);
    }
}
