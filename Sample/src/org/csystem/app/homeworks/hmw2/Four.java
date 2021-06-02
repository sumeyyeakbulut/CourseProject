package org.csystem.app.homeworks.hmw2;

public class Four {
    public static void run() {

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("uzunluk değeri");
        int height = Integer.parseInt(kb.nextLine());

        System.out.printf("genişlik giriniz:");
        int width = Integer.parseInt(kb.nextLine());

        int count=0;
        int flag = 0;

        for (int i = 0; i < height; i++) {
            System.out.print("|");

            if(count == 0)
                flag = 0;
            if(count == width)
                flag = 1;

            for(int k = 0; k<count; k++)
                System.out.print(" ");
            System.out.print("*");

            for(int k = count; k < width; k++)
                System.out.print(" ");

            if(flag == 0)
                count++;
            else
                count--;

            System.out.print("|");
            System.out.println();
        }
    }
}
