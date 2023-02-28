import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        int i = 0,j = 0;
        int iCnt = 1;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1;j <= iCol; j++)
            {
                System.out.print(iCnt+"\t");
                iCnt++;                
            }
            System.out.println();
        }
    }
}

class Program36_5
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