import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("please enter "+Arr.length+ " elements");

        for(int iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the element no :"+(iCnt + 1));
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are :");
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]+"\t");
        }
        
    }
}

class MarvellousX extends ArrayX
{
    public MarvellousX(int iSize)
    {
        super(iSize);
    }

    public int SumEven()
    {
        int iSumEven = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iSumEven = iSumEven + Arr[iCnt];
            }
        }
        return iSumEven;
    }

    public int SumOdd()
    {
        int iSumOdd = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                iSumOdd = iSumOdd + Arr[iCnt];
            }
        }
        return iSumOdd;
    }

    public int Difference()
    {
        int iRet1 = SumEven();
        int iRet2 = SumOdd();

        int iDifference = iRet1 - iRet2;
        return iDifference;
    }
}

class Program32_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array you want");

        int iSize =sobj.nextInt();

        MarvellousX obj = new MarvellousX(iSize);
        
        obj.Accept();

        obj.Display();

        int iRet = obj.Difference();
        System.out.println("Difference is : "+iRet);
    }
}