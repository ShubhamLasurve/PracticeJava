 import java.util.*;

class Digits
{
    public int SumEven(int iNo)
    {
        int iDigit = 0;
        int iSumEven = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            iNo = iNo / 10;
        }
        return iSumEven;
    }

    public int SumOdd(int iNo)
    {
        int iDigit = 0;
        int iSumOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 != 0)
            {
                iSumOdd = iSumOdd + iDigit;
            }
            iNo = iNo / 10;
        }
        return iSumOdd;
    }

    public int CountDifference(int iNo)
    {     
        int iRet1 = SumEven(iNo);
        int iRet2 = SumOdd(iNo);

        int iDifference = iRet1 - iRet2;
        return iDifference;
    }
}

class Program33_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");

        int iNo = sobj.nextInt();

        Digits obj = new Digits();

        int iRet = obj.CountDifference(iNo);
        System.out.println("The Difference is : "+iRet);
    }
}