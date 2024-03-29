package practise;/*
    Created By: Talveen Rakhra
    Created On: 30-12-2021
    Question URL:
    Time Taken:
    Complexity:
*/

public class Q4readmeQ {

    // A simple atoi() function
    static int myAtoi(char[] str)
    {

        // Initialize result
        int res = 0;

        // Initialize sign as positive
        int sign = 1;

        // Initialize index of first digit
        int i = 0;

        // If number is negative, then
        // update sign
        if (str[0] == '-') {
            sign = -1;

            // Also update index of first
            // digit
            i++;
        }

        // Iterate through all digits
        // and update the result
        for (; i < str.length; ++i)
            res = res * 10 + str[i] - '0';

        // Return result with sign
        return sign * res;
    }

    // Driver code
    public static void main(String[] args)
    {
        char[] str = "-568978".toCharArray();

        // Function call
        int val = myAtoi(str);
        System.out.println(val);
    }
}
