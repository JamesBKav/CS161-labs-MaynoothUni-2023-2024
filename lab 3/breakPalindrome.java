public class breakPalindrome
{
    public static void main(String[]args)
    {
        for (int i = 10000; i <= 99999; ++i)
        {
            if (i % 53==0)
            {
                int num5 = i % 10;             
                int num4 = i/10 % 10;          
                int num3 = i/100 %10;           
                int num2 = i/1000 %10;          
                int num1 = i /10000%10;         

            if (num5==num1 && num4==num2)
            {
                System.out.println(i);
                System.out.println(num5);
                System.out.println(num4);
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
                System.out.println("**********");
            }
            }
        }
    }
}
