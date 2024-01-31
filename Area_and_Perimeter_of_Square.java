import java.util.Scanner;
public class Square
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int area=(s*s);
        int perimeter=(4*s);
        System.out.printf("%d %d",area,perimeter);
    }
}