import java.util.Scanner;
public class seventh {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++)
            {
                System.out.print(i);
            }
            for(int l=n-i;l>=1;l--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*____1____
 * __222__
 * _33333_
 * 4444444
 */