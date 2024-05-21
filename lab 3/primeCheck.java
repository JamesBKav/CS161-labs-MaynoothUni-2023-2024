public class primeCheck
{
    public static void main(String [] args)
    {
        int num = 12;
        int i = 2;
        int prime = 0;

        do
        {
            if (num%i==0)
            {
                prime++;
            }
            i++;
        }
        while (i < num);

        if (prime==0)
        {
            System.out.print(num +" is a prime number");
        }

        else
        {
            System.out.print(num +" is NOT a prime number");
        }

    }

}
