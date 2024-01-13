/*
Sum Odd
>> Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
>> Check that number is > 0, if it is not return false.
>> If number is odd return true, otherwise return false.
>> Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
>> The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
>> It should call the method isOdd to check if each number is odd.
>> The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
>> If those conditions are not satisfied return -1 from the method to indicate invalid input.
 */
public class sumOdd {
    public static void main(String[] args) {

        //sumOdd(1,10);
        System.out.println("Sum of all odd numbers int the range is "+ sumOdd(3,9));

    }
    public static boolean isOdd(int number)
    {
        if(!(number >0)){
            return false;
        }
        if (number%2 == 0)
        {
            return false;
        }
        else {

            return true;
        }
    }
    public static int sumOdd(int startNum, int endNum)
    {
        int sum=0;
        for (int i= startNum; i<=endNum; i++)
        {

            if(isOdd(i))
            {
              //  System.out.println("Inside Loop and value of i is "+i);
                sum+=i;
            }
        }
       return sum;
    }
}
