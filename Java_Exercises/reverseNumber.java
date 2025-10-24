package Java_Exercises;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args)
    {
        int num = 98007;
        System.out.print("Reverse of number "+num+ " is: "+ reverse(num));
    }

    public static int reverse(int number)
    {
        int rev=0;
        while(number>0)
        {
            int rem = number%10;
            rev=rev*10+rem;
            number=number/10;

        }
        return rev;
    }
}
