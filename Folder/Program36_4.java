import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        int i = 0,j = 0;

        for(i = iRow; i >=1; i--)
        {
            for(j = iCol;j >= 1; j--)
            {
                System.out.print(i+"\t");                
            }
            System.out.println();
        }
    }
}

class Program36_4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Rows");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter number of Columns");
        int iNo2 = sobj.nextInt();

        Pattern obj = new Pattern();
        obj.Pattern(iNo1,iNo2);

    }
}