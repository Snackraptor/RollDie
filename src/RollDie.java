/* Random Dice Roller
 *  Author: Lionel Pineda
 *  Date: March 5, 2021
 *  Reference: Java: How to Program - Paul Deitel | Harvey Deitel
 */

import java.security.SecureRandom;
public class RollDie
{
    public static void main(String[] args)
    {
        //Dice rolling using arrays instead of a switch
        SecureRandom randomNumbers = new SecureRandom();

        //array of frequency counters
        int[] frequency = new int[7];

        //roll die 60,000,000 times: use the dice value as frequency index - Issue with number being too large
        for (int roll = 1; roll <= 6000; roll++)
        {
            ++frequency[1 + randomNumbers.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        //output each array element's value
        for (int face = 1; face < frequency.length; face++)
        {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }

    }
}
