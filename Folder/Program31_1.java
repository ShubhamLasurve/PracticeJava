import java.util.*;

class StringDemo
{
    public int CountCapital(String str)
    {
        int iCnt = 0;

        for(int i = 0;i < str.length(); i++)
        {
            if((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program31_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter the string");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        int iRet = obj.CountCapital(str);
        System.out.println("The Count of Capital Characters in string is "+iRet);
    }
}