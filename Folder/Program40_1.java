import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 0;i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    System.out.print("#"+"\t");
                }
                else
                {
                    System.out.print("*"+"\t");
                }
                
            }
            System.out.println();
        }
    }
}
class Program40_1
{
    public static void main(String a[])
    {
        Scanner sobj  = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of column");
        int iCol = sobj.nextInt();

        Pattern obj = new Pattern();

        obj.Pattern(iRow, iCol);
    }
}