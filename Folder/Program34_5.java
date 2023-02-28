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

    public int OddMult()
    {
        int iMult = 1;

        for(int iCnt = 0; iCnt <Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                iMult = iMult * Arr[iCnt];
            }
            else
            {
                iMult = 0;
            }
        }
        return iMult;
    }
    
}

 class Program34_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want");

        int iSize = sobj.nextInt();


        MarvellousX obj = new MarvellousX(iSize);

        obj.Accept();
        obj.Display();
        
        int iRet = obj.OddMult();
        System.out.println("The product of all odd numbers is :"+iRet);        
    }
}