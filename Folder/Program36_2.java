import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        int i = 0,j = 0;
        char ch = 'A';
        char ch1 = 'a';
        for(i = 0;i < iRow; i++)
        {   
            for(j = 0; j < iCol;j++)
            { 
                if(i % 2 != 0)
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                } 
                else
                {
                    System.out.print(ch+"\t");
                    ch++;
                } 
            } 
            System.out.println();  
                   
        }
    }
}

class Program36_2
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