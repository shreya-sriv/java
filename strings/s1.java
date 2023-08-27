package strings;

public class s1 {
    public static void main(String args[])
    {
        String s="welcome in the world of java";
        String rev[]=s.split(" ");
        for(int i=rev.length-1;i>=0;i--)
        {
            System.out.print(rev[i]+" ");
        }
    }
}
