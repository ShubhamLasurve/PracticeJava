import java.util.*;

class StringDemo
{
    public int CountSmall(String str)
    {
        int iCnt = 0;

        for(int i = 0;i < str.length(); i++)
        {
            if((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program31_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter the string");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        int iRet = obj.CountSmall(str);
        System.out.println("The Count of Small Characters in string is "+iRet);
    }
}