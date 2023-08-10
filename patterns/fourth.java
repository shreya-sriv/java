import java.util.Scanner;
public class fourth {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(j);
            }
            System.out.println("\n");
        }
    }
}
// 54321

// 5432

// 543

// 54

// 5
