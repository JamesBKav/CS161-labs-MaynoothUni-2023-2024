public class fibonacci
{
    public static void main(String[]args)
    {
        int num = 11;
        int value1 = 0;
        int value2 = 1;
        int sumOfPrev2 = 0;
        int i = 1;

        while (i<num)
        {
            System.out.print(value1+" ");
            sumOfPrev2 = value1 + value2;
            value1 = value2;
            value2 = sumOfPrev2;
            i++;
        }
        System.out.println(value1);
    }
}
