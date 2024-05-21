public class centPincher
{
    public static void main(String[]args)
    {
        int days = 4;
        int i = 1;
        int num1 = 1;
        int totalNum = 1;

        while (i<days)
        {
            num1 *= 2; // num1 = num1*2
            totalNum += num1;
            i++;
        }
        System.out.print(totalNum);
    }
}
