public class calculator
{
    public static void main(String[]args)
    {
        char math = '*';
        int num1 = 15;
        int num2 = 3;
        int answer = 0;

        if (math == '+')
        {
            answer = num1 + num2;
            System.out.println(answer);
        }
        else if (math == '-')
        {
            answer = num1 - num2;
            System.out.println(answer);
        }
        else if (math == '*')
        {
            answer = num1*num2;
            System.out.println(answer);
        }
        else if (math == '/')
        {
            answer = num1/num2;
            System.out.println(answer);
        }
    }
}
