import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1;i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == j)
                {
                    System.out.print(j+"\t");
                }
                else if((i == 1) || (j == 1))
                {
                    System.out.print(j+"\t");
                }
                else if((i == iRow) || (j == iCol))
                {
                    System.out.print(j+"\t");
                }
                else 
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
class Program40_5
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