import java.util.Scanner;
public class Volume
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double volume=((4*3.14*r*r*r)/3);
        System.out.printf("%.2f",volume);
    }
}
