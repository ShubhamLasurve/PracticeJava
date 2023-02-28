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

        System.out.println("Please enter "+Arr.length+" elements");

        for(int iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are :");

        for(int iCnt = 0;iCnt < Arr.length; iCnt++)
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

    public boolean CheckNumber(int iNo)
    {
        boolean bFlag = false;

        for(int iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                bFlag = true;
                break;
            }
            else
            {
                bFlag = false;
            }
        }
        return bFlag;
    }
}

 class Program34_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want");

        int iSize = sobj.nextInt();


        MarvellousX obj = new MarvellousX(iSize);

        obj.Accept();
        obj.Display();

        System.out.println("Enter the number you want to search");

        int NO = sobj.nextInt();

        boolean bRet = obj.CheckNumber(NO);
        
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