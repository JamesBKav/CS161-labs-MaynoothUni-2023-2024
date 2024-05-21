public class fizzbuzz
{
    public static void main(String[]args)
    {
        int start = 210;
        int end = 15;
        
        for(int i = start; i<= end; i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.print("fizzbuzz ");
            }
            else if (i%3==0)
            {
                System.out.print("fizz ");
            }
            else if (i%5==0)
            {
                System.out.print("buzz ");
            }
            
            else
            {
                System.out.print(i+" ");
            }
        }
    }
}
