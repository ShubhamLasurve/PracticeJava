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

    public int LastOccurance(int iNo)
    {
        int iFrequency = 0;
        int iCnt = 0;

        
        for(iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iFrequency = iCnt;
            }
            else
            {
                return -1;
            }
        }
        return iFrequency;
    }
}

 class Program34_3
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

        int iRet = obj.LastOccurance(NO);

        System.out.println("The Last Occurance is :"+iRet);
    }
}