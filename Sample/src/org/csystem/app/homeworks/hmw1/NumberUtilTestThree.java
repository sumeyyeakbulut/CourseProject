package org.csystem.app.homeworks.hmw1;

public class NumberUtilTestThree
{
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Sayıyı giriniz:");
        int a = Integer.parseInt(kb.nextLine());

        System.out.printf("%d %n", signum(a));
    }

    public static int signum (int a) {
        if(a > 0)
            return 1;

        if(a < 0)
            return -1;

        return 0;

    }
}
