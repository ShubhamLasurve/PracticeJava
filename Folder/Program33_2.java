import java.util.*;

class Digits
{
    public int CountOdd(int iNo)
    {
        int iDigit = 0;
        int iOdd = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 != 0)
            {
                iOdd++;
            }
            iNo = iNo / 10;
        }
        return iOdd;
    }
   
}

class Program33_2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");

        int iNo = sobj.nextInt();

        Digits obj = new Digits();

        int iRet = obj.CountOdd(iNo);
        System.out.println("The count of odd numbers in given number is : "+iRet);
    }
}