package Java_Exercises;/*
Number To Words
-------------------
Write a method called Java_Exercises.numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print "Invalid Value".
To print the number as words, follow these steps:
Extract the last digit of the given number using the remainder operator.
Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
Remove the last digit from the number.
Repeat Steps 2 through 4 until the number is 0.
The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
Use the method reverse within the method Java_Exercises.numberToWords in order to print the words in the correct order.
Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method Java_Exercises.numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).

 */

public class numberToWords {
    public static void main(String[] args) {
        numberToWords(9010);
    }
    public static void numberToWords(int number)
    {
        if(number<0)
        {
            System.out.println("Invalid Number");
            return;
        }
        else {
            System.out.print("The number "+number + " in word is = ");
        }
        int count_num=count(number);
        int rev_num=reverse(number);
        int rev_count=count(rev_num);
       // int remainder;

        for(int i=rev_num; rev_num>0; rev_num/=10)
        {




            int remainder = rev_num % 10;
            switch (remainder) {
                case 0:
                    System.out.print(" Zero");
                    break;
                case 1:
                    System.out.print(" One");
                    break;
                case 2:
                    System.out.print(" Two");
                    break;
                case 3:
                    System.out.print(" Three");
                    break;
                case 4:
                    System.out.print(" Four");
                    break;
                case 5:
                    System.out.print(" Five");
                    break;
                case 6:
                    System.out.print(" Six");
                    break;
                case 7:
                    System.out.print(" Seven");
                    break;
                case 8:
                    System.out.print(" Eight");
                    break;
                case 9:
                    System.out.print(" Nine");
                    break;
                default:
                    System.out.print("Invalid Value");
                    break;
            }
        }
        if(count_num !=rev_count)
        {
            int diff = count_num-rev_count;
            for(int j=diff; j>0; j--)
            {
                System.out.print(" Zero");
            }
        }
    }
    public static int reverse(int number)
    {
        int rev_num=0;
        while(number>0)
        {
           int remainder=number%10;
            rev_num=rev_num*10+remainder;
            number/=10;
        }
        //System.out.println("Inside reverse method, and reverse number is "+rev_num);
        return rev_num;
    }
    public static int count(int number)
    {
        int count=0;
        while (number>0)
        {
            count++;
            number/=10;
        }
        //System.out.println("Inside Count method, and count number is "+count);
        return count;
    }
}
