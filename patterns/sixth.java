import java.util.Scanner;
public class sixth {
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
                System.out.print("*");
            }
            for(int l=1;l>=n-i;l--)
            {
                System.out.print(" ");
            }
            // for(int m=1;m<i;m++)
            // {
            //     System.out.print("*");
            // }
            System.out.print("\n");
        }
    }
}
// ____*____
// ___***___
// __*****__
// _*******_
// *********
