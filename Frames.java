import java.util.Scanner;
public class Frames
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    int sum=((x*2)+(y*2));
    System.out.println(sum*z);
    }
}