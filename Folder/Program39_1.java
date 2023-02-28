import java.util.*;

class Pattern
{
    public void Pattern(String str)
    {
        char Arr[] = str.toCharArray();

        int i = 0, j = 0;

        for(i = 0;i < Arr.length; i++)
        {
            for(j = 0; j < Arr.length; j++)
            {
                if(i < j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(Arr[j]+"\t");
                }
            }
            System.out.println();
        }
    }
}
class Program39_1
{
    public static void main(String a[])
    {
        Scanner sobj  = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        Pattern obj = new Pattern();

        obj.Pattern(str);
    }
}