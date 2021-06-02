package org.csystem.app.homeworks.hmw2;

public class Two {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Saniye değeri");
        long a = Integer.parseInt(kb.nextLine());

        displayDuration(a);
    }

    public static void displayDuration(long a)
    {
        System.out.printf("saat: %d %n",hour(a));
        System.out.printf("dk: %d %n",dk(a));
        System.out.printf("sn: %d %n",sn(a));
    }

    public static int hour(long a)
    {
        return (int) (a / 3600);
    }

    public static int dk(long a)
    {
        return (int) ((a % 3600) / 60);
    }

    public static int sn(long a){
        return (int) (a % 3600 % 60);
    }
}

