package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        generate(num);
    }

    private static void generate(int num) {
        int factor = 2;
        int count = 0;

        if(num<1)
        {
            System.out.println("Please enter a natural number");
            return;
        }

        while(num>1)
        {
            if(num%factor==0)
            {
                count++;
                if(count==1)
                    System.out.print(factor);
                else
                    System.out.print(","+factor);
                num/=factor;
            }

            else
            {
                factor++;
            }

        }
        return;
    }
}
