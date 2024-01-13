/*
All Factors
Write a method named printFactors with one parameter of type int named number.
If number is < 1, the method should print "Invalid Value".
The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.
 */

public class printFactors {
    public static void main(String[] args) {
        printFactors(33);
    }
    public static void printFactors(int num)
    {
        if(num<1){
            System.out.println("Invalid Value");
        }
        else {
            System.out.print("The factors of "+num+" are: ");
            for(int i=1; i<num; i++)
            {
                if(num%i==0)
                {
                    System.out.print(" "+i);
                }
            }
        }
    }
}
