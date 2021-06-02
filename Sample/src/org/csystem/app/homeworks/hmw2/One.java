package org.csystem.app.homeworks.hmw2;

public class One {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("n:");
        int n = Integer.parseInt(kb.nextLine());
        draw(n);
    }
    public static void draw (int n)
    {
        int a = 1;
        int b = n - 1;

        for(int k=0; k<n; k++) {
            for (int i = 0;  i <b; i++)
                System.out.print(" ");
            for (int i = 0; i < a; i++)
                System.out.print("*");
            for (int i = 0; i < n - 2; i++)
                System.out.print(" ");
            System.out.println();

            b --;
            a += 2;
        }
        for(int k = 0; k < n; k++){
            for(int i = 0; i < b + 2; i++)
                System.out.print(" ");
            for(int i = 0; i < a - 4; i++)
                System.out.print("*");
            System.out.println();

            b ++;
            a -= 2;
        }

    }
}
