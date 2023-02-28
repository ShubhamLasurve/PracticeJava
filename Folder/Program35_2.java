import java.util.*;

class StringDemo
{
    public boolean StrCmpX(String src, String dest)
    {
        boolean bFlag = false;
        for(int i = 0; i < src.length(); i++)
        {
            if(src.charAt(i) == dest.charAt(i))
            {
                bFlag = true;
            }
            else
            {
                bFlag =false;
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

class Program35_2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second string");
        String str2 = sobj.nextLine();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.StrCmpX(str1,str2);

        if(bRet == true)
        {
            System.out.println("Both strings are equal");
        }
        else
        {
            System.out.println("Both Strings are not equal");
        }

    }
}