import java.util.*;

class Digits
{
    public int CountRange(int iNo)
    {
        int iDigit = 0;
        int iRange = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((3 <= iDigit) && (iDigit <= 7))
            {
                iRange++;
            }
            iNo = iNo / 10;
        }
        return iRange;
    }
   
}

class Program33_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");

        int iNo = sobj.nextInt();

        Digits obj = new Digits();

        int iRet = obj.CountRange(iNo);
        System.out.println("The count is : "+iRet);
    }
}