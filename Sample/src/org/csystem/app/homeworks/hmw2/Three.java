package org.csystem.app.homeworks.hmw2;

import org.csystem.util.NumberUtil;

public class Three {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.printf("Sayıyı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for(int i = 2; i <= n; ++i)
            if (n % i == 0 && NumberUtil.isPrime(i)) {
                System.out.print(i + ".");
                n = n / i;
                i--;
            }
    }
}
