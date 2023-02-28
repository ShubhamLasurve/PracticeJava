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

    public void DisplayRange(int iStart, int iEnd)
    {
        System.out.println("Elements in the given range are :");
        for(int iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            if((iStart <= Arr[iCnt] ) && (Arr[iCnt] <= iEnd))
            {
                
                System.out.println(Arr[iCnt]);
            }
        }
    }
    
}

 class Program34_4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want");

        int iSize = sobj.nextInt();


        MarvellousX obj = new MarvellousX(iSize);

        obj.Accept();
        obj.Display();

        System.out.println("Enter the starting point of range");
        int iStart = sobj.nextInt();

        System.out.println("Enter the Ending point of range");
        int iEnd = sobj.nextInt();

        obj.DisplayRange(iStart, iEnd);

        
    }
}