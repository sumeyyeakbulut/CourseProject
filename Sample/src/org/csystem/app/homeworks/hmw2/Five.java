package org.csystem.app.homeworks.hmw2;

import static org.csystem.util.NumberUtil.isPrime;

public class Five {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Sayı giriniz:");
        int a = Integer.parseInt(kb.nextLine());

        sum(a);
    }
    public static void sum (int a)
    {
        for(int i = a; i > 0; i--)
            if(isPrime(i)){
                if(isPrime(a - i))
                    System.out.printf("%d = %d + %d", a, i, a - i);
                break;
            }
    }
}

