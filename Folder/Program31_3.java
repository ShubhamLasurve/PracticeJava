import java.util.*;

class StringDemo
{
    static int CountCapital(String str)
    {
        int iCnt1 = 0;

        for(int i = 0;i < str.length();i++)
        {
            if((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
            {
                iCnt1++;
            }
        }
        return iCnt1;
    }

    static int CountSmall(String str)
    {
        int iCnt2 = 0;

        for(int i = 0;i < str.length(); i++)
        {
            if((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
            {
                iCnt2++;
            }
        }
        return iCnt2;
    }

    public int CountDiff(String str)
    {
        int iDiff = 0;

        int iSmall = CountSmall(str);
        int iCap = CountCapital(str);

        iDiff = iSmall - iCap;
        return iDiff;
    }
    
}

class Program31_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter the string");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        int iRet = obj.CountDiff(str);

        System.out.println("The Difference is "+iRet);
    }
}