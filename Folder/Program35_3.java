import java.util.*;

class StringDemo
{
    public boolean StrNCmpX(String src, String dest,int iCnt)
    {
        boolean bFlag = false;
        for(int i = 0; i < iCnt; i++)
        {
            if(src.charAt(i) == dest.charAt(i))
            {
                bFlag = true;
            }
            else
            {
                bFlag = false;
            }
        }
        
        if(bFlag == true)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }    
}

class Program35_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second string");
        String str2 = sobj.nextLine();

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.StrNCmpX(str1, str2,iNo);

        if(bRet == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }
}