public class PallindromeNumber {

    //Author Rohit Kumar

    public static void main(String[] args)
    {
        int number= 22122;
        if(isPalindrome(number))
        {
            System.out.println("The number: "+ number +" is a Palindrome number" );
        }
        else System.out.println("The number: "+ number +" is not a Palindrome number" );
    }

    public static boolean isPalindrome(int number)
    { public static void main(String[] args)
        {
            int number= 22122;
            if(isPalindrome(number))
            {
                System.out.println("The number: "+ number +" is a Palindrome number" );
            }
            else System.out.println("The number: "+ number +" is not a Palindrome number" );
        }

        public static boolean isPalindrome(int number)
        {
            int reverse_number=0;
            int orig_number = number;
            while(number!=0)
            {
                int remainder= number%10;
                reverse_number= reverse_number*10 + remainder;
                number= number/10;

            }
            System.out.println(reverse_number);
            return orig_number == reverse_number;
        }
        int reverse_number=0;
        int orig_number = number;
        while(number!=0)
        {
            int remainder= number%10;
            reverse_number= reverse_number*10 + remainder;
            number= number/10;

        }
        System.out.println(reverse_number);
        return orig_number == reverse_number;
    }
}
