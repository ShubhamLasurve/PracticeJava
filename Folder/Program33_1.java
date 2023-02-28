import java.util.*;

class Digits
{
    public int CountEven(int iNo)
    {
        int iDigit = 0;
        int iEven = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iEven++;
            }
            iNo = iNo / 10;
        }
        return iEven;
    }
   
}

class Program33_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");

        int iNo = sobj.nextInt();

        Digits obj = new Digits();

        int iRet = obj.CountEven(iNo);
        System.out.println("The count of even numbers in given number is : "+iRet);
    }
}