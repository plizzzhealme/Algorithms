package Recursion;

/**
 * Created by analBrutality on 27.10.2016.
 */
public class Tests
{
    public static void main(String[] args) throws InterruptedException
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.print(Recursions.factorial(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++)
        {
            System.out.print(Recursions.fibonacci(i) + " ");
        }

        System.out.println();

        Recursions.recursion("Рекурсия");

        
    }
}
