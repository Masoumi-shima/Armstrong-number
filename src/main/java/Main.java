import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        for(int number : isArmstrong(getNumber(),getNumber()))
        {
            System.out.println(number);
        }
    }

    private static int getNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return sc.nextInt();
    }

    private static List<Integer> isArmstrong(int firstNumber, int secondNumber)
    {
        List<Integer> numbers = new ArrayList<>();
        int length = Integer.toString(firstNumber).length();
        for(int number = firstNumber; number <= secondNumber; number++)
        {
            int currentNumber = number;
            int sum = 0;

            while (currentNumber != 0)
            {
                int digit = currentNumber % 10;
                sum += Math.pow(digit,length);
                currentNumber /= 10;
            }
            if (sum == number)
            {
                numbers.add(number);
            }
        }
        return numbers;
    }
}
