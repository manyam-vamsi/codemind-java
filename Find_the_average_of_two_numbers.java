import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double N=sc.nextDouble();
        double M=sc.nextDouble();
        double z=((N+M)/2);
        System.out.printf("%.4f",z);
    }
}
