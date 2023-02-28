import java.util.*;

class StringDemo
{
    public boolean CheckVowel(String s)
    {
        boolean bFlag = false;
        for(int iCnt = 0; iCnt < s.length(); iCnt++)
        {
            if((s.charAt(iCnt) = 'a') || (s.charAt(iCnt) = 'e') || (s.charAt(iCnt) = 'i') || (s.charAt(iCnt) = 'o') || (s.charAt(iCnt) = 'u'))
            {
                bFlag = true;
            }
        }
        return bFlag;
    }
}

class Program31_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter the string");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.CheckVowel(str);

        if(bRet == true)
        {
            System.out.println("The Given string contains vowel");
        }
        else
        {
            System.out.println("The Given string does not contains vowel");
        }
    }
}