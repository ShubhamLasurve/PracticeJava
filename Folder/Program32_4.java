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

    public void EvenDivisibleBy3And5()
    {
        System.out.println("Elements thatand divisible by 3 and 5 are :");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 5 == 0) && (Arr[iCnt] % 3 == 0))
            {
                
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

class Program32_4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array you want");

        int iSize =sobj.nextInt();

        MarvellousX obj = new MarvellousX(iSize);
        
        obj.Accept();

        obj.Display();

        obj.EvenDivisibleBy3And5();

    }
}